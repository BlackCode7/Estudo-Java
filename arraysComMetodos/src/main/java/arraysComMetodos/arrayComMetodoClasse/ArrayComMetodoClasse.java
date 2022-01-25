package arraysComMetodos.arrayComMetodoClasse;

public class ArrayComMetodoClasse {

	public double buscarMaiorNumero(double[] num) {
		// Procura o maior número
		double maior = num[0];		
		for (int i=1; i<num.length; i++) {
			maior = Math.max(maior, num[i]);
		}		
		
		return maior;
	}

}
