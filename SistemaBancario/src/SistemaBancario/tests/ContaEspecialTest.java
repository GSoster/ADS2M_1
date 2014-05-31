package SistemaBancario.tests;

import static org.junit.Assert.assertEquals;
import lib.SaldoInsuficienteException;
import model.Especial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContaEspecialTest {

	Especial conta;
	double limite;
	
	@Before
	public void setUp() throws Exception {
		this.limite = 200;
		this.conta = new Especial(1,1, limite);
	}

	@After
	public void tearDown() throws Exception {
		this.limite = 0;
		this.conta = null;
	}

	@Test
	public void testSacarDentroDoLimite() {
		try {
			this.conta.sacar(200);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(-200,this.conta.getSaldo(), 0.01);
	}

	@Test(expected = SaldoInsuficienteException.class)
	public void testSacarMaisQueOLimite() throws SaldoInsuficienteException{
		this.conta.sacar(201);
		//Não chega na linha abaixo porque uma excessao é lançada 
		//quando se tenta retirar mais que o saldo e o limite!
		assertEquals(-200, this.conta.getSaldo(),0.1);
	}
}
