package arraysJavaTeste;

import static org.junit.Assert.assertEquals;
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
		int teste1 = arraysJava.listaNomes.length;
		assertEquals(true, (teste1 == 5));
	}	
	
	@Test
	@Order(2)
	@DisplayName("Testa se a lista � menor ou igual a 5 e se � maior que 0")	
	void testeArrayJavaSejeMaiorQue5() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.listaNomes.length;
		assertEquals(true, (teste1 <= 5 && teste1 > 0));
	}
		
	@Test
	@Order(3)
	@DisplayName("Testa se a lista na posi��o 1 � igual a string Simone")
	void testeArrayJavaSejeNaPosicao1SejaIqualSimone() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		String teste1 = arraysJava.listaNomes[1].toString();
		assertEquals(true, (teste1 == "Simone"));
	}
		
	@Test
	@Order(4)
	@DisplayName("Testa se a lista na posi��o 2 � igual a string 'Josy' ")
	void testeArrayJavaSejeNaPosicao2SejaIqualJosy() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		String teste1 = arraysJava.listaNomes[2].toString();
		assertEquals(true, (teste1 == "Josy"));
	}
	
	@Test
	@Order(5)
	@DisplayName("Testa se a lista na posi��o 3 � igual a string 'Adilson' ")
	void testeArrayJavaSejeNaPosicao3SejaIqualAdilson() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		String teste1 = arraysJava.listaNomes[3].toString();
		assertEquals(true, (teste1 == "Adilson"));
	}
	
	@Test
	@Order(6)
	@DisplayName("Testa se a lista na posi��o 4 � igual a string 'dagmar' ")
	void testeArrayJavaSejeNaPosicao4SejaIqualdagmar() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		String teste1 = arraysJava.listaNomes[4].toString();
		assertEquals(true, (teste1 == "dagmar"));
	}
		
	@Test
	@Order(7)
	@DisplayName("Testa se a lista na posi��o 0 � igual a string 'Anderson' ")
	void testeArrayJavaSejeNaPosicao0SejaIqualAnderson() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		String teste1 = arraysJava.listaNomes[0].toString();
		assertEquals(true, (teste1 == "Anderson"));
	}

}
