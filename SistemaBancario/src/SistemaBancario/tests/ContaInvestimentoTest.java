package SistemaBancario.tests;

import static org.junit.Assert.assertEquals;
import model.Investimento;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContaInvestimentoTest {

	Investimento conta;
	
	@Before
	public void setUp() throws Exception {
		this.conta = new Investimento(1,1,1);
	}

	@After
	public void tearDown() throws Exception {
		this.conta = null;
	}

	@Test
	public void testGeraDividendos() {
		this.conta.depositar(500);
		this.conta.dividendos(10);
		assertEquals(550,this.conta.getSaldo(), 0.01);
	}

}
