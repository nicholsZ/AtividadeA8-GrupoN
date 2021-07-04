package com.main;

/**
 * 
 * @author Nicholas - nicholsz
 * Classe EmpregadoTerceirizado Atualizada - nicholsz
 * Issue #12 Metodos de Testes para setAdicionalVazio feitos
 */
public class EmpregadoTerceirizado {
	
	public double adicional;
	
	public double getAdicional() {
		return adicional;
	}

	public double setAdicional() {
		
		if (adicional < 100) {
			throw new IllegalArgumentException("Valor minimo R$100,00 / Valor máximo R$1100");
		}
		else if (adicional > 1100) {
			throw new IllegalArgumentException("Valor minimo R$100,00 / Valor máximo R$1100");
		}
		else {
			return adicional;
		}	
	}	
	
	public double getAdicionalVazio() {
		System.out.println("O valor adicional: " + adicional);
		return adicional;
	}
	
	public void setAdicionalVazio(double adicional) {
		
		if (adicional < 100) {
			throw new IllegalArgumentException("Valor minimo R$100,00 / Valor máximo R$1100");
		}
		else if (adicional > 1100) {
			throw new IllegalArgumentException("Valor minimo R$100,00 / Valor máximo R$1100");
		}
		else {
			this.adicional = adicional;	
		}	
	}	
}
