package entradadedadosporteclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EntradaDeDadosPeloTeclado {


	public static void main(String[] args) throws IOException {
		// Entrada de dados do teclado
		
		InputStream in = null;
		BufferedReader entrada1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entrada 1 >>> " +entrada1.readLine());
		
		BufferedReader entrada2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entrada 2 >>> " +entrada2.readLine());
		
		BufferedReader entrada3 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entrada 3 >>> " +entrada3.readLine());
		
		BufferedReader entrada4 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entrada 4 >>> " +entrada4.readLine());
	
		BufferedReader entrada5 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entrada 5 >>> " +entrada5.readLine());
		
		BufferedReader entrada6 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entrada 6 >>> " +entrada6.readLine());

		BufferedReader entrada7 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entrada 7 >>> " + entrada7.readLine());
	
	}

	
}
