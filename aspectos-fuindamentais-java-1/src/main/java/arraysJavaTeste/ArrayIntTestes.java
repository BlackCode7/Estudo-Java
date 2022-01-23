package arraysJavaTeste;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
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
	@DisplayName("Testa se a lista de arrays � maior que zero")
	void testeArrayJavaVerificaSeEMaiorQueZERO() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.arrayInt_1.length;
		Assert.assertEquals(true, (teste1 > 0));
	}	
	
	@Test
    @Order(2)
	@DisplayName("Testa se a lista de arrays � maior ou igual � 200")
	void testeArrayJavaVerificaSeEMaiorOuIgual200() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.arrayInt_1.length;
		Assert.assertEquals(true, (teste1 >= 200));
	}
	
	@Test
    @Order(3)
	@DisplayName("Testa se o array � maior que 100 e menor que 200")
	void testeArrayJavaVerificaSeMaiorQue100MenorQue200() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.arrayInt_1.length;
		Assert.assertEquals(true, (teste1 > 100 && teste1 <= 200));
	}
	
	@Test
    @Order(4)
	@DisplayName("Testa se o arrays n�o � maior � 200")
	void testeArrayJavaVerificaSeArrayNaoMaiorQue200() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.arrayInt_1.length;
		Assert.assertNotEquals(false, (teste1 <= 200));
	}
	
	@Test
    @Order(5)
	@DisplayName("Testa se o arrays n�o � maior � 200")
	void testeArrayJavaVerificaSeArrayNaoMaiorQue200_() {
		ArrayJavaTestes arraysJava = new ArrayJavaTestes();
		int teste1 = arraysJava.arrayInt_1.length;
		Assert.assertNotEquals(true, (teste1 > 200));
	}

}
