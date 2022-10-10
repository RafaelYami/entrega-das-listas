package lista1.logica8;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class Principal {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "Nome: ");
		String endereco = JOptionPane.showInputDialog(null, "Endereço: ");
		String telefone = JOptionPane.showInputDialog(null, "Telefone: ");
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone);

	}

}
