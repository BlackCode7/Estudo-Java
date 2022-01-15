package clausulaexcecoesTryExcept;

import java.io.DataInputStream;
import java.io.IOException;

public class ClausulaExcecoesTryExcept {

	public static void main(String[] args) {
		// Cláusura try / catch
		String s;
		float largura = 2111;
		float area;
		float comprimento;
		float perimetro;
		
		DataInputStream dado;		
		
		// Neste Bloco são os casos de sucesso na operação
		try {
			System.out.println("Digite o comprimento >>> ");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			comprimento = Float.parseFloat(s);
			
			System.out.println("Digite o comprimento >>> ");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			comprimento = Float.parseFloat(s);
			
			area = comprimento * largura;
			perimetro = comprimento * 2 + largura * 2;
			System.out.println("Área do retangulo >>> "+ area);
			System.out.println("Perimetro do retangulo >>> " + perimetro);
		// Neste Bloco são os casos de ERRO na operação ( cláusura catch(){} ) 
		}catch(IOException erro) {
			System.out.println("Houve um ero na entrada dos dados "+erro.toString());
		}catch(NumberFormatException erro){
			System.out.println("Houve um erro na conversão, digite apenas caracteres numéricos "+erro.toString());
		}
		
	}

}
