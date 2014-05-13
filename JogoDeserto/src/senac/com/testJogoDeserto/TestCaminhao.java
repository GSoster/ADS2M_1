package senac.com.testJogoDeserto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import senac.com.JogoDeserto.Caminhao;
import senac.com.JogoDeserto.OutOfDesertException;
import senac.com.JogoDeserto.OutOfGasException;

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
	public void testCaminhaoAvancaPosicao() throws OutOfDesertException{
		assertEquals(0,caminhao.getPosicao());
		caminhao.avancar();
		assertEquals(1,caminhao.getPosicao());
	}
	
	@Test
	public void testCaminhaoGastaCombustivelAoAvancar() throws OutOfDesertException{
		assertEquals(6,caminhao.getQtdCombustivel());
		caminhao.avancar();
		assertEquals(5,caminhao.getQtdCombustivel());
	}
	
	/*
	 * AQUI preciso lançar uma excessão, mas não lembro como
	 * faz para usar o exception expected...
	 */
	@Test 
	public void testCaminhaoNaoAndaSemCombustivel() throws OutOfDesertException{
		assertEquals(6,caminhao.getQtdCombustivel());
		for(int i = 0; i<6; i++){
			caminhao.avancar();
		}
		assertEquals(0,caminhao.getQtdCombustivel());				
	}
	
	@Test
	public void testCaminhaoGastaCombustivelAoVoltar() throws OutOfDesertException{
		assertEquals(6,caminhao.getQtdCombustivel());
		caminhao.avancar();
		caminhao.avancar();
		assertEquals(4,caminhao.getQtdCombustivel());
		caminhao.voltar();
		assertEquals(3,caminhao.getQtdCombustivel());		
	} 
	
	@Test
	public void testCaminhaoVoltaPosicao(){
		assertEquals(0,caminhao.getPosicao());
		try {
			caminhao.avancar();
			caminhao.avancar();
			caminhao.avancar();
		} catch (OutOfDesertException e1) {
			e1.printStackTrace();
		}
		
		assertEquals(3,caminhao.getPosicao());
		try {
			caminhao.voltar();
		} catch (OutOfDesertException e) {
			e.printStackTrace();
		}
		assertEquals(2,caminhao.getPosicao());
	}
	
	@Test
	public void testCaminhaoRecargaCombustivelAoVoltarPosicaoInicial(){
		assertEquals(0,caminhao.getPosicao());
		try {
			caminhao.avancar();
			caminhao.avancar();
		} catch (OutOfDesertException e1) { 
			e1.printStackTrace();
		}
		
		assertEquals(4,caminhao.getQtdCombustivel());
		try {
			caminhao.voltar();
			caminhao.voltar();
		} catch (OutOfDesertException e) { 
			e.printStackTrace();
		}
		
		assertEquals(6,caminhao.getQtdCombustivel());
	}

	
	@Test
	public void testLargarCombustivel(){		
		try {
			caminhao.avancar();
			caminhao.avancar();
			caminhao.avancar();
		} catch (OutOfDesertException e) { 
			e.printStackTrace();
		}
		
		assertEquals(3,caminhao.getQtdCombustivel());
		try {
			caminhao.descarregar();
		} catch (OutOfGasException e) {
			e.printStackTrace();
		}
		assertEquals(2,caminhao.getQtdCombustivel());		
	}
}
