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
		System.out.println(contaString.length());
		assertEquals("SIMONE JOSY", (contaString.toUpperCase()));
	}
}
