package test;

import static org.junit.Assert.*;
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
		for(int i = 0; i< 10; i++){
			assertEquals(0,deserto.getValorDaPosicao(i));			
		}
		
	}
	
}
