package messagePrintStackTrace;

import javax.swing.JOptionPane;

public class MessagePrintStackTrace {

	public static void main(String[] args) {
		// messagePrintStackTrace
		
		// Insere informa��es do usu�rio no sistema
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		try {
			int y = x / x2; // gera um erro numero n�o � divisivel por zero
			
			System.out.println(y);
			
		}catch(Exception Erro){
			JOptionPane.showMessageDialog(null, Erro.getMessage());
			Erro.printStackTrace();
		}

	}

}
