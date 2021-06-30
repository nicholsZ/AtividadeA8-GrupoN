package com.teste;

public class EmpregadoTerceirizado{
	
	public double adicional;
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		
		if (adicional < 100) {
			throw new IllegalArgumentException("Valor minimo R$100,00 / Valor máximo R$1100");
		}
		else if (adicional > 1100) {
			throw new IllegalArgumentException("Valor minimo R$100,00 / Valor máximo R$1100");
		}
		
		this.adicional = adicional;
			
	}
}
