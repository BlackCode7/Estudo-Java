package arraysJavaTeste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@DisplayName("Classe de testes de Arrays tipo String")
@TestMethodOrder(OrderAnnotation.class)
public class ArrayIntTestes {
	
	@Test
    @Order(1)
	@DisplayName("Testa se a lista de arrays é maior que zero")
	void testeArrayJavaVerificaSeEMaiorQueZERO() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.arrayInt_1.length;
		assertEquals(true, (teste1 > 0));
	}	
	
	@Test
    @Order(2)
	@DisplayName("Testa se a lista de arrays é maior ou igual à 200")
	void testeArrayJavaVerificaSeEMaiorOuIgual200() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.arrayInt_1.length;
		assertEquals(true, (teste1 >= 200));
	}
	
	@Test
    @Order(3)
	@DisplayName("Testa se o array é maior que 100 e menor que 200")
	void testeArrayJavaVerificaSeMaiorQue100MenorQue200() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.arrayInt_1.length;
		assertEquals(true, (teste1 > 100 && teste1 <= 200));
	}
	
	@Test
    @Order(4)
	@DisplayName("Testa se o arrays não é maior à 200")
	void testeArrayJavaVerificaSeArrayNaoMaiorQue200() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.arrayInt_1.length;
		assertNotEquals(false, (teste1 <= 200));
	}
	
	@Test
    @Order(5)
	@DisplayName("Testa se o arrays não é maior à 200")
	void testeArrayJavaVerificaSeArrayNaoMaiorQue200_() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.arrayInt_1.length;
		assertNotEquals(true, (teste1 > 200));
	}

}
