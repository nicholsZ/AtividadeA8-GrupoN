package com.main;

/**
 * 
 * @author Nicholas - nicholsz
 * Classe Empregado Atualizada - nicholsz
 * Issue #8 método realizarPagamento
 * Atualização da Classe Empregado, construtor e método, extends
 */

public class Empregado extends EmpregadoTerceirizado{

	public String nome;
	public int horas;
	public double valorPorHora;
	
	public Empregado(String nome, int horas, double valorPorHora, double adicional) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
		this.adicional = adicional;
	}
	
	public double realizarPagamento() {
		
		double pagamento;
		
		pagamento = (valorPorHora * horas) + adicional;
		
		if (pagamento >= 1100) {
			System.out.println("Valor do pagamento de " +nome+ ": " + pagamento);
		}
		else {
			pagamento = 1100;
			System.out.println("Valor do pagamento de " +nome+ ": " + pagamento);
		}
		
		return pagamento;		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoras() {
		System.out.println("A quantidade de horas de " +nome+ ": " + horas);
		return horas;
	}

	public void setHoras(int horas) {
		if (horas > 40) {
			throw new IllegalArgumentException("Digite a quantidade de horas maior/igual a 0 e menor/igual a 40");
		}
		else if (horas < 0) {
			throw new IllegalArgumentException("Digite a quantidade de horas maior/igual a 0 e menor/igual a 40");
		}
		else {
			this.horas = horas;	
		}		
	}
}

	
	
	
	
	


