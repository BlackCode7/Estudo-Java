package javaMetodo.javaMetodo1;

public class ClasseMetodo_1 {

	public String varString = "O filme matrix é o melhor de todos!";

	public String tornaMaiusculoCaracteres(String string) {	
		// retorna string em caracteres maiúsculos
		return varString.toUpperCase();
	}

	public int funcaoRetornaValor(String varString2) {
		// Retorna o char da posição em que string específica ocupa dentro da string
		int quantidade = 0;
		varString2 = varString2.toUpperCase();
		for (int a = 0; a < varString2.length(); a++) {
			if(varString2.charAt(a) == 'A') {
				quantidade++;
			}
		}
		
		return quantidade;
	}

	public int funcaoMostraPares(int valor) {
		// Mostra valor par
		int retorno = 0;		
		for(int a=0; a<=valor; a=a/2) {
			retorno += a;
		}
		
		return retorno;
	}

	public static long calculaFatorial(long fatorial) {
		// Calcula o fatorial
		if(fatorial <= 1) {
			return (1);
		}else {
			return (fatorial * calculaFatorial(fatorial - 1));
		}
		
	}

		

}
