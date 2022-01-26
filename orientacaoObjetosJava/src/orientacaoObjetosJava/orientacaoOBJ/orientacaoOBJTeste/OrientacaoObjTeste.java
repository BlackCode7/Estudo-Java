package orientacaoObjetosJava.orientacaoOBJ.orientacaoOBJTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import orientacaoObjetosJava.orientacaoOBJ.OrientacaoObjJavaClasse;

public class OrientacaoObjTeste {
	
	@Test
	@Order(1)
	@DisplayName("Testa da vari�vel stringObj, se ela � uma string na classe OrientacaoObjJavaClasse ( 01 )")
	void orientacaoOBJ() {
		OrientacaoObjJavaClasse orientacaoOBJ = new OrientacaoObjJavaClasse();
		String var = orientacaoOBJ.stringObj;
		assertEquals("Teste vari�vel Java", var.toString());
	}
	
	@Test
	@Order(2)
	@DisplayName("Teste da vari�vel stringObj, testa se a vari�vel seja diferente de null ( 02 )")
	void orientacaoOBJ_testaDiferNull() {
		OrientacaoObjJavaClasse orientacaoOBJ = new OrientacaoObjJavaClasse();
		String var = orientacaoOBJ.stringObj;
		assertEquals(true, (var.toString() != null && var.toString().length() > 0));
	}
	
	@Test
	@Order(3)
	@DisplayName("Teste do m�todo stringObj, testa se o m�todo orientacaoObjMetodo() transforma uma string em caracteres to lower case ( 02 )")
	void orientacaoOBJ_testaMetodo() {
		OrientacaoObjJavaClasse orientacaoOBJ = new OrientacaoObjJavaClasse();
		String varStringTest = "Teste do m�todo stringObj, testa se o m�todo orientacaoObjMetodo()";
		String var = orientacaoOBJ.orientacaoObjMetodo(varStringTest);
		System.out.println(var);
		assertEquals("teste do m�todo stringobj, testa se o m�todo orientacaoobjmetodo()", (var.toLowerCase()));
	}

}
