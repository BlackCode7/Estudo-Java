package entradadedadosporteclado;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeituraDeArquivosDataInputStream {

	/* Para o programa achar o arquivo para execução dele deve estar na raiz do projeto */
	
	public static void main(String[] args) throws IOException {
		// Leitura de arquivos com DataInputStream
		DataInputStream entradaArquivo = new DataInputStream(new 
				FileInputStream("entradaDeDadosJavaDataInputStreamDataBufferedReaderScannerTeste_1.txt"));
		DataOutputStream saidaArquivo = new DataOutputStream(
				new FileOutputStream("entradaDeDadosJavaDataInputStreamDataBufferedReaderScannerTeste_2.txt"));
		
		String count ;
		while((count = entradaArquivo.readLine()) != null) {
			String u = count.toUpperCase();
			System.out.println("Saída do u >>> "+ u);
			saidaArquivo.writeBytes(u + " ,");
		}
		entradaArquivo.close();
		saidaArquivo.close();
	}

}
