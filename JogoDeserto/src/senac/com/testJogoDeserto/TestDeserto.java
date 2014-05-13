package senac.com.testJogoDeserto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import senac.com.JogoDeserto.Deserto;

public class TestDeserto {

	Deserto deserto = null;
	
	@Before
	public void setUp() throws Exception {
		deserto = new Deserto(); 
	}

	@After
	public void tearDown() throws Exception {
		deserto = null;
	}

	@Test
	public void testDesertoIniciaZerado() {
		for(int i = 0; i<10; i++){
			assertEquals(0,deserto.getValorDaPosicao(i));
		}
	}
	
	@Test 
	public void testAdicionarValorEmPosicao(){		
		assertEquals(0,deserto.getValorDaPosicao(3));
		deserto.setValorNaPosicao(3);
		assertEquals(1,deserto.getValorDaPosicao(3));
	}

	@Test
	public void testRetirarValorDaPosicao(){		
		assertEquals(0,deserto.getValorDaPosicao(3));
		deserto.setValorNaPosicao(3);
		deserto.setValorNaPosicao(3);
		deserto.setValorNaPosicao(3);
		assertEquals(3,deserto.getValorDaPosicao(3));
		deserto.retirarValorDaPosicao(3);
		assertEquals(2,deserto.getValorDaPosicao(3));
	}
}
