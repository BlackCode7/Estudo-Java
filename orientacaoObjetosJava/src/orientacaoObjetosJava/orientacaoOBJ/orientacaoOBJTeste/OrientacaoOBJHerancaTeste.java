package orientacaoObjetosJava.orientacaoOBJ.orientacaoOBJTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import orientacaoObjetosJava.orientacaoOBJ.OrientacaoOBJHeranca;

public class OrientacaoOBJHerancaTeste {
	@Test
	@Order(1)
	@DisplayName("Testa da variável stringObj, se ela é uma string na classe OrientacaoObjJavaClasse ( 01 )")
	void orientacaoOBJ() {
		OrientacaoOBJHeranca orientacaoOBJ = new OrientacaoOBJHeranca();
		String var = orientacaoOBJ.stringObj;
		assertEquals("Teste variável Java", var.toString());
	}
}
