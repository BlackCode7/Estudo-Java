package conversaotiposjava;

public class ConversaoDeTiposJava {

	public static void main(String[] args) {
		
		// Conversão de tipos em java
		String s1 = "10";
		int conversaoParaInt = Integer.parseInt(s1);
		float conversaoParaFloat = Float.parseFloat(s1);
		double conversaoParaDouble = Double.parseDouble(s1);
		
		// laõ de repetição for(){}
		for (int conversaoParaFloat1 = 0; conversaoParaFloat1 == 100; conversaoParaFloat1++) {
			conversaoParaFloat1 = conversaoParaFloat1 + 1;
			System.out.println("Valor de x >>> " + conversaoParaFloat1);
		}
		
		int conversaoParaInt_2 = (int) conversaoParaInt; 
		int conversaoParaInt_3 = (int) conversaoParaFloat;
		int conversaoParaInt_4 = (int) conversaoParaDouble;
		
		float conversaoParaFloat_2 = (float) conversaoParaInt; 
		float conversaoParaFloat_3 = (float) conversaoParaFloat;
		float conversaoParaFloat_4 = (float) conversaoParaDouble;
		
		double conversaoParaDouble_2 = (double) conversaoParaInt; 
		double conversaoParaDouble_3 = (double) conversaoParaFloat;
		double conversaoParaDouble_4 = (double) conversaoParaDouble;
		
		System.out.printf("Conversão para tipo 1 (double) > " + conversaoParaDouble_2);
		System.out.printf("Conversão para tipo 2 (double) > " + conversaoParaDouble_3);
		System.out.printf("Conversão para tipo 3 (double) > " + conversaoParaDouble_4);
		
		System.out.printf("Conversão para tipo 1 (float) > " + conversaoParaFloat_2);
		System.out.printf("Conversão para tipo 2 (float) > " + conversaoParaFloat_3);
		System.out.printf("Conversão para tipo 3 (float) > " + conversaoParaFloat_4);
		
		System.out.printf("Conversão para tipo 1 (int) > " + conversaoParaInt_2);
		System.out.printf("Conversão para tipo 2 (int) > " + conversaoParaInt_3);
		System.out.printf("Conversão para tipo 3 (int) > " + conversaoParaInt_4);
		
		
	}

}
