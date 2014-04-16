package com.senac.examples.login.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.examples.login.Account;
import com.senac.examples.login.AccountDB;
import com.senac.examples.login.AccountLockedExcpetion;
import com.senac.examples.login.AccountLoginLimitReachedException;
import com.senac.examples.login.AccountNotFoundException;
import com.senac.examples.login.LoginService;

import static org.mockito.Mockito.*;


public class LoginServiceTest {

	private Account account;
	private AccountDB accountDB;
	private LoginService service;
	
	@Before
	public void setUp(){
		//Prepara��o do ambiente
		this.account = mock(Account.class);				
		this.accountDB = mock(AccountDB.class);		
		this.service = new LoginService(accountDB);
		when(accountDB.find(anyString())).thenReturn(account);
				
	}
	
	private void willPasswordMatch(boolean value){
		when(account.passwordMatches(anyString())).thenReturn(value);
	}
	
	@Test
	public void testObjectContaEstaLogadoQuandoSenhaForCorreta() throws AccountLoginLimitReachedException, AccountNotFoundException, AccountLockedExcpetion {
		//Prepara��o do ambiente
		willPasswordMatch(true);
		//## ## Execu��o do Metodo ## ##		
		
		//testa o login
		service.login("Steve", "CorrectPassword");
		
		//## ## Verifica��o da execu��o (Asserts/verify/..) ## ##
		//verifica se um objeto, executou x  vezes (neste caso 1 vez) um metodo (neste caso com parametro)
		verify(account, times(1)).setLoggedIn(true);
	}

	@Test
	public void testContaDeveSerSuspensaQuandoFalharTresLogins() throws AccountLoginLimitReachedException, AccountNotFoundException, AccountLockedExcpetion{
		//Prepara��o do ambiente		
		willPasswordMatch(false);
		//Execu��o do Teste		
		for(int i = 0; i<3; i++){
			service.login("Steve","WrongPassword");
		}
		//Valida��o do Teste
		verify(account, times(1)).setLocked(true);;
	}
	
	@Test
	public void testObjetoContaNaoEstaLogadoQuandoSenhaForErrada() throws AccountLoginLimitReachedException, AccountNotFoundException{
		//Prepara��o do ambiente
		willPasswordMatch(false);
		//Execu��o do teste
		//Valida��o do teste
		verify(account, never()).setLoggedIn(true);
	}
	
	@Test
	public void testFalhaDeDoisLoginsSucessoNoTerceiroLogin() throws AccountLoginLimitReachedException, AccountNotFoundException, AccountLockedExcpetion{
		//Prepara��o do ambiente
		willPasswordMatch(false);
		when(account.passwordMatches("CorrectPassword")).thenReturn(true);
		//Execu��o do teste		
		//Logando duas vezes errado:
		service.login("Steve", "WrongPassword");
		service.login("Steve", "WrongPassword");
		//Logand uma vez correto
		service.login("Steve", "CorrectPassword");		
		//Valida��o do teste
		verify(account, never()).setLocked(true);		
	}
	
	@Test
	public void testNaoDeveBloquearSegundaContaQuandoUmaContaFalhaDuasVezesAntes() throws AccountLoginLimitReachedException, AccountNotFoundException, AccountLockedExcpetion{
		//Prepara��o do ambiente
		willPasswordMatch(false);
		Account second = mock(Account.class);
		when(second.passwordMatches(anyString())).thenReturn(false);
		
		when(accountDB.find("Annie")).thenReturn(second);
		
		//Execu��o do teste
		service.login("Steve", "WrongPassword");
		service.login("Steve", "WrongPassword");
		service.login("Annie", "WrongPassword");
		//Valida��o/verifica do teste
		verify(second, never()).setLocked(true);
			
	}

	@Test(expected = AccountLoginLimitReachedException.class)
	public void testNaoPodeLogarQuandoJaEstaLogado() throws AccountLoginLimitReachedException, AccountNotFoundException, AccountLockedExcpetion{
		willPasswordMatch(true);
		when(account.isLoggedIn()).thenReturn(true);
		service.login("Steve", "CorrectPassword");
	}
	
	@Test(expected = AccountNotFoundException.class)
	public void testFalhaDeLoginQuandoContaNaoExiste() throws AccountLoginLimitReachedException, AccountNotFoundException, AccountLockedExcpetion{
		when(accountDB.find("Zeus")).thenReturn(null);
		service.login("Zeus", "QualquerSenha");
	}

	@Test(expected = AccountLockedExcpetion.class)
	public void testUmaContaBloqueadaNaoPodeSeLogar() throws AccountLoginLimitReachedException, AccountNotFoundException, AccountLockedExcpetion{
		willPasswordMatch(true);
		when(account.isLocked()).thenReturn(true);
		service.login("Steve","CorrectPassword");
		
	}
	
	
}
