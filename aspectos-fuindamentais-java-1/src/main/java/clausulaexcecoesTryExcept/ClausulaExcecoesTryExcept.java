package clausulaexcecoesTryExcept;

import java.io.DataInputStream;
import java.io.IOException;

public class ClausulaExcecoesTryExcept {

	public static void main(String[] args) {
		// Cl�usura try / catch
		String s;
		float largura = 2111;
		float area;
		float comprimento;
		float perimetro;
		
		DataInputStream dado;		
		
		// Neste Bloco s�o os casos de sucesso na opera��o
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
			System.out.println("�rea do retangulo >>> "+ area);
			System.out.println("Perimetro do retangulo >>> " + perimetro);
		// Neste Bloco s�o os casos de ERRO na opera��o ( cl�usura catch(){} ) 
		}catch(IOException erro) {
			System.out.println("Houve um ero na entrada dos dados "+erro.toString());
		}catch(NumberFormatException erro){
			System.out.println("Houve um erro na convers�o, digite apenas caracteres num�ricos "+erro.toString());
		}
		
	}

}
