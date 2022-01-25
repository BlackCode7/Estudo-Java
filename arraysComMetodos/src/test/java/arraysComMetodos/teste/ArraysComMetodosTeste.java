package arraysComMetodos.teste;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import arraysComMetodos.arrayComMetodoClasse.ArrayComMetodoClasse;


public class ArraysComMetodosTeste {

	@Test
	@Order(1)
	@DisplayName("Testa se o método retorna o maior valor teste( 01 )")
	void arraysComMetodoTestes() {
		ArrayComMetodoClasse arrayMetodo = new ArrayComMetodoClasse();
		double[] var = {1, 21, 88.1, 1100};
		double arraysVar = arrayMetodo.buscarMaiorNumero(var);		
		assertEquals(true, (arraysVar > 1099 && arraysVar == 1100 && arraysVar != 100.000 || arraysVar < 100.000));
	}
}
