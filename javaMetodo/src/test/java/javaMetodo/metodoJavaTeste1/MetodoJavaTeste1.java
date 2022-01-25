package javaMetodo.metodoJavaTeste1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import javaMetodo.javaMetodo1.ClasseMetodo_1;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class MetodoJavaTeste1 {
	@Test	
	@Order(1)
	@DisplayName("Teste da primeira variável varString")
	public void criaPrimeiroMetodoTesteJava() {		
		ClasseMetodo_1 classeMetodoTeste = new ClasseMetodo_1();
		String contaString = classeMetodoTeste.varString.toString(); // toString();
		System.out.println(contaString.length());
		assertEquals(true, (contaString != null));
	}
	
	@Test	
	@Order(2)
	@DisplayName("Teste conta o tamanho da string contida na variável")
	public void contaOTamanhoDaVariavelVarString() {		
		ClasseMetodo_1 classeMetodoTeste = new ClasseMetodo_1();
		String contaString = classeMetodoTeste.varString.toString(); // toString();
		System.out.println(contaString.length());
		assertEquals(true, (contaString.length() == 35));
	}
	
	@Test	
	@Order(3)
	@DisplayName("Criar um metodo para converter todos os caracteres da variável em caracteres maiúsculos")
	public void funcaoParaTornarTodosCaracteresMaiusculos() {		
		String stringMaius = "simone josy";		
		ClasseMetodo_1 classeMetodoTeste = new ClasseMetodo_1();
		String contaString = classeMetodoTeste.tornaMaiusculoCaracteres(stringMaius); // toString();
		//System.out.println(contaString.length());
		assertEquals("O FILME MATRIX É O MELHOR DE TODOS!", (contaString.toUpperCase()));
	} 

	@Test
	@Order(4)
	@DisplayName("Testa função que retorna valores")
	public void funcaoComRetornodeValores() {		
		ClasseMetodo_1 classeMetodoRetornoTeste = new ClasseMetodo_1();
		int retornaValor = classeMetodoRetornoTeste.funcaoRetornaValor(classeMetodoRetornoTeste.varString);
		assertEquals('f', (classeMetodoRetornoTeste.varString).charAt(2));
		assertEquals(-1, (classeMetodoRetornoTeste.varString.indexOf(retornaValor)));
		
	}
	
	@Test
	@Order(5)
	@DisplayName("Testa calculo de número fatorial")
	public void metodoRecursivoClaculaFatorial() {
		ClasseMetodo_1 calculaFatorialMetodo = new ClasseMetodo_1();
		long calculaFatorialTest = calculaFatorialMetodo.calculaFatorial(5);
		assertEquals(1, calculaFatorialTest);	
	}
	
	/*@Test
	@Order(5)
	@DisplayName("Testa função que retorna valores pares")
	public void mostrarValores() {
		ClasseMetodo_1 mostraValor = new ClasseMetodo_1();
		int funcMostraValorPares = mostraValor.funcaoMostraPares(4);
		assertEquals(2, String.valueOf(funcMostraValorPares));
	}*/
	
	
}































