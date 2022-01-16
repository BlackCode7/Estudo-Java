package usodothrow;

import java.io.*;

import javax.swing.JOptionPane;

public class UsoDoThrow {

	public static void main(String[] args) throws IOException {

		String frase = JOptionPane.showInputDialog("Digite uma frase !");
		try {
			FileWriter file = new FileWriter("A:/2022_projects/projetos2022.txt", true);
			PrintWriter out = new PrintWriter(file);
			out.println(frase);
			file.close();
			out.close();
			JOptionPane.showMessageDialog(null, "projetos para 2022");			
		}catch(FileNotFoundException erro){
			JOptionPane.showMessageDialog(null, "ERRO, verifique se a pasta existe");
		}
		
	}

}
