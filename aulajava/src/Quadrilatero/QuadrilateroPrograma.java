package Quadrilatero;

import javax.swing.JOptionPane;
public class QuadrilateroPrograma {

	public static void main(String[] args) {
		
		double lado1, lado2, baseMenor, baseMaior, altura;
		Quadrilatero q = new Quadrilatero();

		lado1=Double.parseDouble(JOptionPane.showInputDialog ("Informe o lado do quadrado"));
		q.lados(lado1);
		System.out.println ("O perímetro é " + q.getPerimetro());
		System.out.println ("A área é " + q.getArea());
		
			lado1=Double.parseDouble(JOptionPane.showInputDialog ("Informe o lado 1 do retângulo"));
			lado2=Double.parseDouble(JOptionPane.showInputDialog ("Informe o lado 2 do retângulo"));
			q.lados(lado1, lado2);
			System.out.println ("O perímetro é " + q.getPerimetro());
			System.out.println ("A área é " + q.getArea());

				lado1=Double.parseDouble(JOptionPane.showInputDialog ("Informe o lado 1 do trapézio"));
				lado2=Double.parseDouble(JOptionPane.showInputDialog ("Informe o lado 2 do trapézio"));
				baseMenor=Double.parseDouble(JOptionPane.showInputDialog ("Informe a base menor do trapézio"));
				baseMaior=Double.parseDouble(JOptionPane.showInputDialog ("Informe a base maior do trapézio"));
				altura=Double.parseDouble(JOptionPane.showInputDialog ("Informe a altura do trapézio"));
				q.lados(lado1, lado2, baseMenor, baseMaior, altura);
				System.out.println ("O perímetro é " + q.getPerimetro());
				System.out.println ("A área é " + q.getArea());
			
	}

}
