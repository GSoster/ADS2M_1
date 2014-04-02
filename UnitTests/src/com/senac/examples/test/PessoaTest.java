/**
 * 
 */
package com.senac.examples.test;
import java.util.Date;

import com.senac.examples.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.examples.Pessoa;

/**
 * @author 180901405
 *
 */
public class PessoaTest {

	private Pessoa joao;
	private Date hoje;
	
	private Pessoa novo;
	private Date ontem;
	
	private Pessoa velho;
	private Date lastYear;
	
	private Pessoa matusalem;
	private Date tenYear;
	
	/**
	 * @throws java.lang.Exception
	 * Cria o ambiente
	 */
	@Before
	public void setUp() throws Exception {
		hoje = new Date();
		joao = new Pessoa(hoje);
		joao.setNome("João");			
		//Pessoa novo
		ontem = new Date(hoje.getYear(), hoje.getMonth(), hoje.getDay() -1 );
		novo = new Pessoa(ontem);		
		//pessoa velho
		lastYear = new Date(hoje.getYear()-1, hoje.getMonth(), hoje.getDay());
		velho = new Pessoa(lastYear);
		//pessoa matusalem
		tenYear = new Date(hoje.getYear()-10, hoje.getMonth(), hoje.getDay());
		matusalem = new Pessoa(tenYear);
		
		
	}

	/**
	 * Destroi o ambiente
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		joao = null;
		novo = null;
		velho = null;
		matusalem = null;
		hoje = null;
		ontem = null;
		lastYear = null;
		tenYear = null;
	}

	/**
	 * Test method for {@link com.senac.examples.Pessoa#Pessoa(java.util.Date)}.
	 */
	@Test
	public void testPessoa() {
		Date data = new Date();
		Pessoa p = new Pessoa(data);
		assertNull(p.getNome());
		assertEquals(0, p.getIdade());
		assertEquals(data, p.getDateNascimento());
	}

	/**
	 * Test method for {@link com.senac.examples.Pessoa#getNome()}.
	 */
	@Test
	public void testNome() {		
		//test get/set
		Pessoa p = new Pessoa(new Date());
		p.setNome("Rafael");
		assertEquals("Rafael", p.getNome());
		//test get/set null
		p.setNome(null);
		assertNull(p.getNome());
		
		//test only get
		assertEquals("João", joao.getNome());
	}

	/**
	 * Test method for {@link com.senac.examples.Pessoa#setNome(java.lang.String)}.
	 */
	@Test
	public void testSetNome() {
		Pessoa p = new Pessoa(new Date());
		p.setNome("Rafael");
		assertEquals("Rafael", p.getNome());
	}

	/**
	 * Test method for {@link com.senac.examples.Pessoa#getDateNascimento()}.
	 */
	@Test
	public void testGetDateNascimento() {
		//test existing object
		assertEquals(hoje, joao.getDateNascimento());
		
		//test existing object
		assertEquals(ontem, novo.getDateNascimento());
		
		//test existing object
		assertEquals(lastYear, velho.getDateNascimento());
		
		
	}

	/**
	 * Test method for {@link com.senac.examples.Pessoa#getIdade()}.
	 */
	@Test
	public void testGetIdade() {
		assertEquals(0,joao.getIdade());
		assertEquals(0,novo.getIdade());
		assertEquals(1,velho.getIdade());
		assertEquals(10,matusalem.getIdade());
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	/*
	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}
*/
	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	/*
	@Test
	public void testToString() {
		fail("Not yet implemented");
	}
	*/
	
	//o CODIGO(expected = UmaUnicaException.class) serve para dizer que esperamos que 
	//o teste gere uma exceçao.
	@Test(expected = UmaUnicaException.class)
	public void testGerarExcecao() throws UmaUnicaException{
		
		joao.gerarExcecao();
		
		/*	FORMA 1 de testar excessoes
		try {
			joao.gerarExcecao();
			//o lançamento de exceção interrompe o fluxo e vai direto para
			//o catch, então o codigo fail abaixo não seria executado.
			fail("Exceção não foi lançada.");
		} catch (UmaUnicaException e) {
			// teste funcionou
		}*/
		
	}
	

}
