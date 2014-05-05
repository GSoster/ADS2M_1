package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import senac.FilaCircular;

public class testFilaCircular {

	FilaCircular fc;
	
	@Before
	public void setUp() throws Exception {
		fc = new FilaCircular();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPushPosicaoZero() {
		fc.push(10);		
		assertEquals(10,fc.getValor(0));		
	}
	
	@Test
	public void testPushPosicaoUm(){
		fc.push(10);
		fc.push(20);
		assertEquals(20,fc.getValor(1));
	}
	
	@Test
	public void testPop(){
		fc.push(10);
		fc.push(20);
		assertEquals(10,fc.peek());
		fc.pop();
		assertEquals(20,fc.peek());
		
	}
	

}
