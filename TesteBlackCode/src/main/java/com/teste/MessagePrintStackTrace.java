package com.teste;

import javax.swing.JOptionPane;

public class MessagePrintStackTrace {
	// messagePrintStackTrace
	// Insere informa��es do usu�rio no sistema
	
	public int printMessageInScreen() {
	
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		try {		
			
		}catch(Exception Erro){
			JOptionPane.showMessageDialog(null, Erro.getMessage());
			Erro.printStackTrace();
		}
		
		return (x + x2);
		
	}
	
	
} 
