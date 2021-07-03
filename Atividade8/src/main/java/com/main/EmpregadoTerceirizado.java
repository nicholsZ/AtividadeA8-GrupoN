package com.main;

/**
 * 
 * @author Nicholas - nicholsz
 * Classe EmpregadoTerceirizado Atualizada com setAdicional - nicholsz
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
}
