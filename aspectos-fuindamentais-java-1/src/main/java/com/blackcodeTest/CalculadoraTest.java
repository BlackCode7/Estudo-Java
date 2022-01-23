package com.blackcodeTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
	public void deveSomarDoisNumerosInteiros() {
		Calculadora calc = new Calculadora();		
		int soma = calc.somar(3, 10);		
		Assert.assertEquals(13, soma);		
	}

}
