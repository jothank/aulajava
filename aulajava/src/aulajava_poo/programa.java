package aulajava_poo;

import javax.swing.JOptionPane;

public class programa {

	public static void main(String[] args) {


		curso curso1 = new curso();
				
		curso1.codigo=100;
		curso1.nome="Jonathan";
		curso1.preco=600.00;
		curso1.cargaHoraria=40;
		
		double reajuste;
				
		curso1.imprime();		
		
		System.out.println("********************************");
		
		reajuste=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de acrescimo"));
		curso1.reajustePreco(reajuste);
		curso1.imprime();
				
	}

}
