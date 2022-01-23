package com.teste;

import javax.swing.JOptionPane;

public class MessagePrintStackTrace {
	// messagePrintStackTrace
	// Insere informações do usuário no sistema
	
	public int printMessageInScreen() {
	
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		try {		
			
		}catch(Exception Erro){
			JOptionPane.showMessageDialog(null, Erro.getMessage());
			Erro.printStackTrace();
		}
		
		return (x + x2);
		
	}
	
	
} 
