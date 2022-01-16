package messagePrintStackTrace;

import javax.swing.JOptionPane;

public class MessagePrintStackTrace {

	public static void main(String[] args) {
		// messagePrintStackTrace
		
		// Insere informações do usuário no sistema
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		try {
			int y = x / x2; // gera um erro numero não é divisivel por zero
			
			System.out.println(y);
			
		}catch(Exception Erro){
			JOptionPane.showMessageDialog(null, Erro.getMessage());
			Erro.printStackTrace();
		}

	}

}
