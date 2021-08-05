package aulajava;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		String nome;
		double altura, peso, resultado;
		DecimalFormat df =  new DecimalFormat("0.00");
		
		nome=JOptionPane.showInputDialog("Digite seu nome: ");
		peso=Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
	
		resultado=peso/(altura*altura);
		
		if(resultado<=18.5) {	
			System.out.println("Olá " + nome + ", seu resultado é: " + df.format(resultado) + " considerado Magreza.");
		} else if (resultado>18.5 && resultado <=24.9) {
			System.out.println("Olá " + nome + ", seu resultado é: " + df.format(resultado) + " considerado Normal.");
		} else if (resultado>24.9 && resultado <=29.9) {
			System.out.println("Olá " + nome + ", seu resultado é: " + df.format(resultado) + " considerado Sobrepeso.");
		} else if (resultado>29.9 && resultado <=39.9) {
			System.out.println("Olá " + nome + ", seu resultado é: " + df.format(resultado) + " considerado Obesidade.");
		} else if (resultado>39.9) {
			System.out.println("Olá " + nome + ", seu resultado é: " + df.format(resultado) + " considerado Obesidade Grave.");
		}
	}

}
