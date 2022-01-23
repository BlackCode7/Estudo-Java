package arraysJavaTeste;

public class ArrayJavaTestes {
	
	/* Existem dois tipos de Arrays:
	 * UNIDIMENCIONAL ---> vetores 
	 * BIDIMENCIONAL  ---> matrizes
	 * 
	 *  exemplo de arrays unidimencional - vetor ==>>> { "Anderson", "Simone", "Josy", "Adilson", "dagmar" }
	 *  exemplo de arrays bidimencional  - matriz ==>>> [] 	 *  
	 *  
	 *  Links de referência de testes com Junit
	 *  https://junit.org/junit5/docs/current/user-guide/
	 *  https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-execution-order-classes
	 *  https://junit.org/junit5/docs/current/user-guide/#writing-tests-display-names  
	 */
	
	//public static final String arrayInt_1 = null;
	static String[] listaNomes = { "Anderson", "Simone", "Josy", "Adilson", "dagmar" };// Array de strings
	static String[] listaNomes1 = new String[112]; // Limitando o uso do arrays a uma determinada quantidade de arrays
	static String[] listaNomes2 = listaNomes;
	
	int[] arrayInt = new int[0]; //Array de números inteiros
    Integer[] arrayInt_1 = new Integer[200]; // desta forma só posso passar a quantidade dos array dentro da variável arrayInt[]
	
	
	double[] arrayDouble = new double[10]; //Array de doubles
	double[] arrayDouble_1 = new double[2000]; //Passando a quantidade de array double
	
	char[] arrayChar = new char[2]; //Array de chars
	char[] arrayChar_1 = new char[10];
	
	boolean[] arrayBoolean = new boolean[2]; //Array de booleanos
	boolean[] arrayBoolean_1 = new boolean[200];
			
	public static void main(String args[]) {
		System.out.println(listaNomes);
		System.out.println(listaNomes1[1]);
		System.out.println(listaNomes2[0]);
	}
	
}
