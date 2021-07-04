package com.test;

import org.junit.Assert;
import org.junit.Test;
import com.main.Empregado;

/**
 * 
 * @author Nicholas - nicholsz
 * Classe EmpregadoTerceirizadoTeste atualizada com testes de SetAdicionalVazio - nicholsz
 */

public class EmpregadoTerceirizadoTeste {

	@Test
	public void testSetAdicionalIgual() {
		
		Empregado funcionarioT = new Empregado("Joao", 30, 30, 500);
		
		Assert.assertEquals(500, funcionarioT.setAdicional(), 0.00001);
	}
	
	@Test
	public void testSetAdicionalMaior() {
		
		Empregado funcionarioT = new Empregado("Jose", 30, 30, 2000);
		
		Assert.assertEquals(2000, funcionarioT.setAdicional(), 0.00001);
	}
	
	@Test
	public void testSetAdicionalMenor() {
		
		Empregado funcionarioT = new Empregado("Maria", 30, 30, 50);
		
		Assert.assertEquals(50, funcionarioT.setAdicional(), 0.00001);
	}
	
	
	@Test
	public void testSetAdicionalVazioIgual() {
		
		Empregado funcionarioAV = new Empregado("Marieva", 30, 30, 500);
		
		double adicionalV = 500;
		
		funcionarioAV.setAdicionalVazio(adicionalV);
		
		Assert.assertEquals(500, funcionarioAV.getAdicionalVazio(), 0.00001);
	}
	
	@Test
	public void testSetAdicionalVazioMaior() {
		
		Empregado funcionarioAV = new Empregado("Julieta", 30, 30, 1500);
		
		double adicionalV = 1500;
		
		funcionarioAV.setAdicionalVazio(adicionalV);
		
		Assert.assertEquals(1500, funcionarioAV.getAdicionalVazio(), 0.00001);
	}
	
	@Test
	public void testSetAdicionalVazioMenor() {
		
		Empregado funcionarioAV = new Empregado("Katia", 30, 30, 50);
		
		double adicionalV = 50;
		
		funcionarioAV.setAdicionalVazio(adicionalV);
		
		Assert.assertEquals(50, funcionarioAV.getAdicionalVazio(), 0.00001);
	}

}
