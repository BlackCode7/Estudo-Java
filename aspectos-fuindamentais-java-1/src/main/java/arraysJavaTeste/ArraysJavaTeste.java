package arraysJavaTeste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;


import org.junit.jupiter.api.Test;
@DisplayName("Classe de testes de Arrays tipo String")
@TestMethodOrder(OrderAnnotation.class)
public class ArraysJavaTeste {	
	
	@Test
    @Order(1)
	@DisplayName("Testa se a lista tem 5 elementos")
	void testeArrayJavaSejeVerdadeiro() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = ArrayJavaTestes.listaNomes.length;
		Assert.assertEquals(true, (teste1 == 5));
	}	
	
	@Test
	@Order(2)
	@DisplayName("Testa se a lista ï¿½ menor ou igual a 5 e se ï¿½ maior que 0")	
	void testeArrayJavaSejeMaiorQue5() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = ArrayJavaTestes.listaNomes.length;
		Assert.assertEquals(true, (teste1 <= 5 && teste1 > 0));
	}
		
	@Test
	@Order(3)
	@DisplayName("Testa se a lista na posição 1 igual a string Simone")
	void testeArrayJavaSejeNaPosicao1SejaIqualSimone() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		String teste1 = ArrayJavaTestes.listaNomes[1].toString();
		Assert.assertEquals(true, (teste1 == "Simone"));
	}
		
	@Test
	@Order(4)
	@DisplayName("Testa se a lista na igual a string 'Josy' ")
	void testeArrayJavaSejeNaPosicao2SejaIqualJosy() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		String teste1 = ArrayJavaTestes.listaNomes[2].toString();
		Assert.assertEquals(true, (teste1 == "Josy"));
	}
	
	@Test
	@Order(5)
	@DisplayName("Testa se a lista na posiï¿½ï¿½o 3 ï¿½ igual a string 'Adilson' ")
	void testeArrayJavaSejeNaPosicao3SejaIqualAdilson() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		String teste1 = ArrayJavaTestes.listaNomes[3].toString();
		Assert.assertEquals(true, (teste1 == "Adilson"));
	}
	
	@Test
	@Order(6)
	@DisplayName("Testa se a lista na posiï¿½ï¿½o 4 ï¿½ igual a string 'dagmar' ")
	void testeArrayJavaSejeNaPosicao4SejaIqualdagmar() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		String teste1 = ArrayJavaTestes.listaNomes[4].toString();
		Assert.assertEquals(true, (teste1 == "dagmar"));
	}
		
	@Test
	@Order(7)
	@DisplayName("Testa se a lista na posiï¿½ï¿½o 0 ï¿½ igual a string 'Anderson' ")
	void testeArrayJavaSejeNaPosicao0SejaIqualAnderson() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		String teste1 = ArrayJavaTestes.listaNomes[0].toString();
		Assert.assertEquals(true, (teste1 == "Anderson"));
	}

}
