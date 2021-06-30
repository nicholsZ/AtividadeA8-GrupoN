package com.teste;

import org.junit.Assert;
import org.junit.Test;

public class EmpregadoTeste {

	@Test
	public void testRealizarPagamentoProprio1() {
		Empregado funcionarioProprio1 = new Empregado("Nicholas" ,40 ,40, 0);
		double pagamento1 = funcionarioProprio1.realizarPagamento();
		//Assert.assertEquals(1600, pagamento1, pagamento1);  	
	}
	
	@Test
	public void testRealizarPagamentoProprio2() {
		Empregado funcionarioProprio2 = new Empregado("Maria" ,30 ,30, 0);
		double pagamento2 = funcionarioProprio2.realizarPagamento();
		Assert.assertEquals(0, pagamento2, pagamento2); 		
	}
	
	@Test
	public void testRealizarPagamentoTerceirizado1() {
		Empregado funcionarioTerceirizado1 = new Empregado("João" ,40 ,40, 400);
		double pagamento1 = funcionarioTerceirizado1.realizarPagamento();
		Assert.assertEquals(2000, pagamento1, pagamento1);  	
	}

	/*
	@Test
	public void testSetNome() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetHoras() {
		
	}

	@Test
	public void testSetValorPorHora() {
		fail("Not yet implemented");
	}
	*/
}
