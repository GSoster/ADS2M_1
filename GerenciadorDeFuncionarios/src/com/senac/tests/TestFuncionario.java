package com.senac.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.model.Cargo;
import com.senac.model.Funcionario;

public class TestFuncionario {

	Funcionario funcionario = null;
	
	@Before
	public void setUp() throws Exception {
		funcionario = new Funcionario(Cargo.ESTAGIARIO, Cargo.ESTAGIARIO.getSalarioMinimo());
	}

	@After
	public void tearDown() throws Exception {
		funcionario = null;
	}

	@Test
	public void testMatriculaValida() {
		assertTrue(funcionario.getMatricula() > 0);		
	}
	
	@Test
	public void testMatriculaUnicaParaCadaFuncionario() throws Exception{		
		Funcionario f1 = new Funcionario(Cargo.ESTAGIARIO, Cargo.ESTAGIARIO.getSalarioMinimo());
		Funcionario f2 = new Funcionario(Cargo.ESTAGIARIO, Cargo.ESTAGIARIO.getSalarioMinimo());
		assertFalse(funcionario.getMatricula() == f1.getMatricula());
		assertFalse(f1.getMatricula() == f2.getMatricula());
		assertFalse(funcionario.getMatricula() == f2.getMatricula());
	}

	//Se o salario atribuido ao funcionario está dentro do minimo
	//estipulado pelo Cargo
	@Test
	public void testSalarioDentroDaLei() throws Exception{		
		assertTrue(funcionario.getSalario() >= funcionario.getCargo().getSalarioMinimo());
	}
		
	
	@Test(expected=java.lang.Exception.class)
	public void testNaoPermiteCriarObjetoComSalarioInvalido() throws Exception{
		new Funcionario(Cargo.ESTAGIARIO, 0);		
	}
	
	@Test(expected=java.lang.Exception.class)
	public void testSalarioNaoPodeDiminuir() throws Exception{
		funcionario.ajustaSalario(-5.35);
	}
	
	@Test
	public void testSalarioCorretamenteAjustado() throws Exception{
		Funcionario func = new Funcionario(Cargo.ESTAGIARIO, 1000.00);
		func.ajustaSalario(4.23);
		//o 0.00001 no final serve para que se tenha precisao de 4 casas decimais após o zero 
		assertEquals(1042.30,func.getSalario(), 0.00001);
	}
	
	@Test(expected=java.lang.Exception.class)
	public void testSalarioNaoAumentaMenosQueDissidio() throws Exception{		
		funcionario.ajustaSalario(funcionario.getCargo().getDissidio() - 0.001);//tem que lancar uma excecao
	}
	
}
