package test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import model.Deserto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testDeserto {

	Deserto deserto;
	
	@Before
	public void setUp() throws Exception {
		deserto = new Deserto();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void testDesertoIniciaZerado(){
		deserto = new Deserto();
		assertEquals(0,deserto.getValorDaPosicao(0));
		assertEquals(0,deserto.getValorDaPosicao(1));
		assertEquals(0,deserto.getValorDaPosicao(2));
		assertEquals(0,deserto.getValorDaPosicao(3));
		
	}
	
}
