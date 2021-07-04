package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import com.main.Empregado;

/**
 * 
 * @author Nicholas - nicholsz
 * Classe EmpregadoTest Atualizada - nicholsz
 * Issue #10 Metodos de Testes para setHoras feitos
 * 
 */
public class EmpregadoTest {

	@Test
	public void testRealizarPagamentoMaior() {
		
		Empregado funcionario1 = new Empregado("Nicholas", 30, 40, 0);
			
		Assert.assertEquals(1200, funcionario1.realizarPagamento(), 0.00001);
	}
	
	
	@Test
	public void testRealizarPagamentoMenor() {
		
		/* 30 * 30 = 900, com a condição 1100 é o esperado*/
		Empregado funcionario2 = new Empregado("Maria", 30, 30, 0);
		
		Assert.assertEquals(1100, funcionario2.realizarPagamento(), 0.00001);
	} 
	
	@Test
	public void testRealizarPagamentoIgual() {
		
		/* (30 * 30) + 200 = 1100 é o esperado*/
		Empregado funcionario3 = new Empregado("Joao", 30, 30, 200);
		
		Assert.assertEquals(1100, funcionario3.realizarPagamento(), 0.00001);
	}
	
	@Test
	public void testSetHorasIgual() {
		
		Empregado funcionarioSH = new Empregado("Joao", 30, 30, 500);
		
		int horasSH = 30;
		
		funcionarioSH.setHoras(horasSH);
		
		assertEquals(funcionarioSH.getHoras(), horasSH);
	}
	
	@Test
	public void testSetHorasMaior() {
		
		Empregado funcionarioSH = new Empregado("Joao", 50, 30, 500);
		
		int horasSH = 50;
		
		funcionarioSH.setHoras(horasSH);
		
		assertEquals(funcionarioSH.getHoras(), horasSH);
	}
	
	@Test
	public void testSetHorasMenor() {
		
		Empregado funcionarioSH = new Empregado("Joao", -10, 30, 500);
		
		int horasSH = -10;
		
		funcionarioSH.setHoras(horasSH);
		
		assertEquals(funcionarioSH.getHoras(), horasSH);
	}
}


