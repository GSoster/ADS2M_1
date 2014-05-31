package SistemaBancario.tests;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import lib.SaldoInsuficienteException;
import model.Conta;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContaTest {
	
	Conta conta;
	
	@Before
	public void setUp() throws Exception {
		this.conta = new Conta(1,1);
	}

	@After
	public void tearDown() throws Exception {
		this.conta = null;
		
	}

	
	
	@Test
	public void testDeposito(){
		this.conta.depositar(30);
		assertEquals(30,this.conta.getSaldo(), 0.01);
	}
	
	@Test
	public void testDepositar(){
		assertEquals(0, this.conta.getSaldo(), 0.1);
		this.conta.depositar(20);
		assertEquals(20, this.conta.getSaldo(), 0.1);
	}
	
	@Test
	public void testSacar(){
		assertEquals(0,this.conta.getSaldo(),0.1);
		this.conta.depositar(150);
		assertEquals(150,this.conta.getSaldo(), 0.1);
		try {
			this.conta.sacar(35);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(115, this.conta.getSaldo(), 0.1);		
	}
	
	@Test(expected=SaldoInsuficienteException.class)	
	public void testContaLancaExcessaoSacarMaisQueSaldo() throws SaldoInsuficienteException{
		assertEquals(0, this.conta.getSaldo(), 0.1);
		this.conta.sacar(30);
	}
}
