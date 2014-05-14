package com.senac.model;

public class Funcionario {

	private static int PROXIMA_MATRICULA = 1; 
	private int matricula;
	private double salario;
	private Cargo cargo;
	
	public Funcionario(Cargo cargo, double salario) throws Exception{		
		if(salario < cargo.getSalarioMinimo()){
			throw new Exception("Salario Inválido!");
		}
		
		this.matricula = PROXIMA_MATRICULA++;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public int getMatricula() {
		return this.matricula;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public double getSalario() {
		return this.salario;
	}

}
