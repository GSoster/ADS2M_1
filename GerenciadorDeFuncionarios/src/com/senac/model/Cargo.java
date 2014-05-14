package com.senac.model;

public enum Cargo {

	ESTAGIARIO("Estagiario",500.00, 2.34),
	DESENVOLVEDOR_JUNIOR("Analista de Desenvolvimento Junior",850.00, 2.34),
	DESENVOLVEDOR_PLENO("Analista de Desenvolvimento Pleno",1250.00, 2.34),
	DESENVOLVEDOR_SENIOR("Analista de Desenvolvimento Senior",1500.00, 2.34),
	GERENTE_PROJETO("Gerente de Projetos",2500.00, 2.34),
	GERENTE_EXECUTIVO("Gerente de Pessoas",0.00, 2.34);
	
	private String titulo;
	private double salarioMinimo;
	private double dissidio;
	
	//No enum não são criados novos objetos, portando o construtor é privado.
	private Cargo(String titulo, double salarioMinimo, double dissidio){
		this.titulo = titulo;
		this.salarioMinimo = salarioMinimo;
		this.dissidio = dissidio;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public double getSalarioMinimo(){
		return this.salarioMinimo;
	}
	
	public double getDissidio(){
		return this.dissidio;
	}
	
}
