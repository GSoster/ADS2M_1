package com.senac.examples;

import java.util.Date;

public class Pessoa {

	private String nome;
	private Date dataNascimento;
	
	public Pessoa(Date dataNascimento){
		this.nome = null;
		this.dataNascimento = dataNascimento;
	}
		
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Date getDateNascimento(){
		return dataNascimento;
	}
	
	public int getIdade(){		
		int anoAtual = (new Date()).getYear();
		int anoDataNascimento = this.dataNascimento.getYear();
		int idade = anoAtual - anoDataNascimento;
		return idade;
	}
	
	/*
	 * Metodo para testar excessoes
	 */
	public void gerarExcecao() throws UmaUnicaException{
		throw new UmaUnicaException();
	}
	
	
}
