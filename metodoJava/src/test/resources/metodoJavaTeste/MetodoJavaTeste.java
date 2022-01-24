package metodoJavaTeste;


@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class MetodoJavaTeste {
	@Test	
	@Order(1)
	@DisplayName("Testa se a lista de arrays � maior que zero")
	public void criaPrimeiroMetodoTesteJava() {		
		ClasseMetodo_1 classeMetodoTeste = new ClasseMetodo_1();
		int contaString = classeMetodoTeste.varString.length(); // toString();
		System.out.println(contaString);
		Assert.assertTrue("Conta o Tamanho da string >>", (contaString > 0));
	}
}
