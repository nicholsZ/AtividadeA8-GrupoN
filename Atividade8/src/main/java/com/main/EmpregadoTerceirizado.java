package com.main;

/**
 * 
 * @author Nicholas - nicholsz
 * Classe EmpregadoTerceirizado atualizada com todos os m�todos - nicholsz
 * Issue #14 Metodos Aplicados 
 */
public class EmpregadoTerceirizado {
	
	public double adicional;
	
	// M�todo getAdicional
	public double getAdicional() {
		return adicional;
	}

	// M�todo setAdicional
	public double setAdicional() {
		
		if (adicional < 100) {
			throw new IllegalArgumentException("Valor minimo R$100,00 / Valor m�ximo R$1100");
		}
		else if (adicional > 1100) {
			throw new IllegalArgumentException("Valor minimo R$100,00 / Valor m�ximo R$1100");
		}
		else {
			return adicional;
		}	
	}	
	
	// M�todo getAdicionalVazio
	public double getAdicionalVazio() {
		System.out.println("O valor adicional: " + adicional);
		return adicional;
	}
	
	// M�todo setAdicionalVazio
	public void setAdicionalVazio(double adicional) {
		
		if (adicional < 100) {
			throw new IllegalArgumentException("Valor minimo R$100,00 / Valor m�ximo R$1100");
		}
		else if (adicional > 1100) {
			throw new IllegalArgumentException("Valor minimo R$100,00 / Valor m�ximo R$1100");
		}
		else {
			this.adicional = adicional;	
		}	
	}	
}
