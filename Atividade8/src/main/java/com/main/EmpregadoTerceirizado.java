package com.main;

/**
 * 
 * @author Nicholas - nicholsz
 * Classe EmpregadoTerceirizado atualizada com todos os métodos - nicholsz
 * Issue #14 Metodos Aplicados 
 */
public class EmpregadoTerceirizado {
	
	public double adicional;
	
	// Método getAdicional
	public double getAdicional() {
		return adicional;
	}

	// Método setAdicional
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
	
	// Método getAdicionalVazio
	public double getAdicionalVazio() {
		System.out.println("O valor adicional: " + adicional);
		return adicional;
	}
	
	// Método setAdicionalVazio
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
