package com.test;

import org.junit.Assert;
import org.junit.Test;
import com.main.Empregado;

/**
 * 
 * @author Nicholas - nicholsz
 * Classe EmpregadoTerceirizadoTeste Atualizada com testes - nicholsz
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

}
