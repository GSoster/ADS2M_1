package senac.com.testJogoDeserto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import senac.com.JogoDeserto.Caminhao;

public class TestCaminhao {

	Caminhao caminhao;
	
	@Before
	public void setUp() throws Exception {
		caminhao = new Caminhao();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCaminhaoIniciaCom6Combustivel() {
		assertEquals(6,caminhao.getQtdCombustivel());
	}
	
	@Test
	public void testCaminhaoIniciaComPosicaoZero() {
		assertEquals(0,caminhao.getPosicao());
	}
	
	@Test
	public void testCaminhaoAvancaPosicao(){
		assertEquals(0,caminhao.getPosicao());
		caminhao.avancar();
		assertEquals(1,caminhao.getPosicao());
	}
	
	@Test
	public void testCaminhaoGastaCombustivelAoAvancar(){
		assertEquals(6,caminhao.getQtdCombustivel());
		caminhao.avancar();
		assertEquals(5,caminhao.getQtdCombustivel());
	}
	
	/*
	 * AQUI preciso lançar uma excessão, mas não lembro como
	 * faz para usar o exception expected...
	 */
	@Test 
	public void testCaminhaoNaoAndaSemCombustivel(){
		assertEquals(6,caminhao.getQtdCombustivel());
		for(int i = 0; i<6; i++){
			caminhao.avancar();
		}
		assertEquals(0,caminhao.getQtdCombustivel());				
	}
	
	@Test
	public void testCaminhaoGastaCombustivelAoVoltar(){
		assertEquals(6,caminhao.getQtdCombustivel());
		caminhao.avancar();
		assertEquals(5,caminhao.getQtdCombustivel());
		caminhao.voltar();
		assertEquals(4,caminhao.getQtdCombustivel());		
	} 
	
	@Test
	public void testCaminhaoVoltaPosicao(){
		assertEquals(0,caminhao.getPosicao());
		caminhao.avancar();
		caminhao.avancar();
		caminhao.avancar();
		assertEquals(3,caminhao.getPosicao());
		caminhao.voltar();
		assertEquals(2,caminhao.getPosicao());
	}
	
	

}
