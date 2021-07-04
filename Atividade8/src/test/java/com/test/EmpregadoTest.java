package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import com.main.Empregado;

/**
 * 
 * @author Nicholas - nicholsz
 * Classe EmpregadoTest Atualizada - nicholsz
 * Issue #15 Resultado dos testes dos metodos.
 */
public class EmpregadoTest {

	@Test
	public void testRealizarPagamentoMaior() {
		
		/* testRealizarPagamentoMaior 
		pagamento = (valorPorHora * horas) + adicional;
		pagamento = (30 * 40) + 0 = 1200
		Passou do minimo 1100 e ajustou o teste sendo maior que 1100 dentro dos paramentros
		*/
		Empregado funcionario1 = new Empregado("Nicholas", 30, 40, 0);
			
		Assert.assertEquals(1200, funcionario1.realizarPagamento(), 0.00001);
	}
	
	
	@Test
	public void testRealizarPagamentoMenor() {
		
		/* testRealizarPagamentoMenor 
		pagamento = (valorPorHora * horas) + adicional;
		pagamento = (30 * 30) + 0 = 900
		Não passou do minimo 1100 e ajustou conforme o metodo para 1100.
		*/
		Empregado funcionario2 = new Empregado("Maria", 30, 30, 0);
		
		Assert.assertEquals(1100, funcionario2.realizarPagamento(), 0.00001);
	} 
	
	@Test
	public void testRealizarPagamentoIgual() {
		
		/* testRealizarPagamentoIgual 
		pagamento = (valorPorHora * horas) + adicional;
		pagamento = (30 * 30) + 200 = 1100
		Igual ao minimo 1100 e ajustou o teste.
		*/
		Empregado funcionario3 = new Empregado("Joao", 30, 30, 200);
		
		Assert.assertEquals(1100, funcionario3.realizarPagamento(), 0.00001);
	}
	
	@Test
	public void testSetHorasIgual() {
		
		/* testSetHorasIgual 
		Dentro das restrições de horas 0 até 40
		*/
		Empregado funcionarioSH = new Empregado("Joao", 30, 30, 500);
		
		int horasSH = 30;
		
		funcionarioSH.setHoras(horasSH);
		
		assertEquals(funcionarioSH.getHoras(), horasSH);
	}
	
	@Test
	public void testSetHorasMaior() {
		
		/* testSetHorasMaior ,atribue a Exception 
		Acima das restrições de horas 0 até 40
		*/
		Empregado funcionarioSH = new Empregado("Roberto", 50, 30, 500);
		
		int horasSH = 50;
		
		funcionarioSH.setHoras(horasSH);
		
		assertEquals(funcionarioSH.getHoras(), horasSH);
	}
	
	@Test
	public void testSetHorasMenor() {
		
		/* testSetHorasMenor, atribue a Exception 
		Abaixo das restrições de horas 0 até 40
		*/
		Empregado funcionarioSH = new Empregado("Mario", -10, 30, 500);
		
		int horasSH = -10;
		
		funcionarioSH.setHoras(horasSH);
		
		assertEquals(funcionarioSH.getHoras(), horasSH);
	}
	
	@Test
	public void testSetValorPorHoraIgual() {
		
		/* testSetValorPorHoraIgual 
		Igual as restrições de valorPorHora 30 até 200
		*/
		Empregado funcionarioVPH = new Empregado("Claudio", 30, 100, 500);
		
		double valorPH = 100;
		
		funcionarioVPH.setValorPorHora(valorPH);
		
		Assert.assertEquals(100, funcionarioVPH.getValorPorHora(), 0.00001);
	}
	
	@Test
	public void testSetValorPorHoraMaior() {
		
		/* testSetValorPorHoraMaior, atribue a Exception 
		Maior que as restrições de valorPorHora 30 até 200, caindo na Exception.
		*/
		Empregado funcionarioVPH = new Empregado("Julio", 30, 300, 500);
		
		double valorPH = 300;
		
		funcionarioVPH.setValorPorHora(valorPH);
		
		Assert.assertEquals(300, funcionarioVPH.getValorPorHora(), 0.00001);
	}
	
	@Test
	public void testSetValorPorHoraMenor() {
		
		/* testSetValorPorHoraMenor, atribue a Exception
		Menor que as restrições de valorPorHora 30 até 200, caindo na Exception.
		*/
		Empregado funcionarioVPH = new Empregado("Marieva", 30, 20, 500);
		
		double valorPH = 20;
		
		funcionarioVPH.setValorPorHora(valorPH);
		
		Assert.assertEquals(20, funcionarioVPH.getValorPorHora(), 0.00001);
	}
	
	
}


