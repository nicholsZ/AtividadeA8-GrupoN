package com.main;

/**
 * 
 * @author Nicholas - nicholsz
 * Classe Empregado Atualizada com todos os m�todos - nicholsz
 * Issue #13 Metodos Aplicados 
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
	
	// M�todo realizarPagamento
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
	
	// M�todo getNome
	public String getNome() {
		return nome;
	}

	// M�todo setNome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// M�todo getHoras
	public int getHoras() {
		System.out.println("A quantidade de horas de " +nome+ ": " + horas);
		return horas;
	}

	// M�todo setHoras
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
	
	// M�todo getValorPorHora
	public double getValorPorHora() {
		System.out.println("O valor por Hora de " +nome+ ": " + valorPorHora);
		return valorPorHora;
	}

	// M�todo setValorPorHora
	public void setValorPorHora(double valorPorHora) {
		
		if (valorPorHora < 30) {
			throw new IllegalArgumentException("Valor minimo R$30,00 / Valor m�ximo R$200,00");	
		}
		else if (valorPorHora > 200) {
			throw new IllegalArgumentException("Valor minimo R$30,00 / Valor m�ximo R$200,00");	
		}
		else {
			this.valorPorHora = valorPorHora;
		}	
	}
}

	
	
	
	
	


