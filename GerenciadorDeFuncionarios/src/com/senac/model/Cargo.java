package com.senac.model;

public enum Cargo {

	ESTAGIARIO("Estagiario",500.00),
	DESENVOLVEDOR_JUNIOR("Analista de Desenvolvimento Junior",850.00),
	DESENVOLVEDOR_PLENO("Analista de Desenvolvimento Pleno",1250.00),
	DESENVOLVEDOR_SENIOR("Analista de Desenvolvimento Senior",1500.00),
	GERENTE_PROJETO("Gerente de Projetos",2500.00),
	GERENTE_EXECUTIVO("Gerente de Pessoas",0.00);
	
	private String titulo;
	private double salarioMinimo;
	
	//No enum não são criados novos objetos, portando o construtor é privado.
	private Cargo(String titulo, double salarioMinimo){
		this.titulo = titulo;
		this.salarioMinimo = salarioMinimo;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public double getSalarioMinimo(){
		return this.salarioMinimo;
	}
	
	
	
}
