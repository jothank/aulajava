package Quadrilatero;

import javax.swing.JOptionPane;
public class QuadrilateroPrograma {

	public static void main(String[] args) {
		
		double lado1, lado2, baseMenor, baseMaior, altura;
		Quadrilatero q = new Quadrilatero();

		lado1=Double.parseDouble(JOptionPane.showInputDialog ("Informe o lado do quadrado"));
		q.lados(lado1);
		System.out.println ("O per�metro � " + q.getPerimetro());
		System.out.println ("A �rea � " + q.getArea());
		
			lado1=Double.parseDouble(JOptionPane.showInputDialog ("Informe o lado 1 do ret�ngulo"));
			lado2=Double.parseDouble(JOptionPane.showInputDialog ("Informe o lado 2 do ret�ngulo"));
			q.lados(lado1, lado2);
			System.out.println ("O per�metro � " + q.getPerimetro());
			System.out.println ("A �rea � " + q.getArea());

				lado1=Double.parseDouble(JOptionPane.showInputDialog ("Informe o lado 1 do trap�zio"));
				lado2=Double.parseDouble(JOptionPane.showInputDialog ("Informe o lado 2 do trap�zio"));
				baseMenor=Double.parseDouble(JOptionPane.showInputDialog ("Informe a base menor do trap�zio"));
				baseMaior=Double.parseDouble(JOptionPane.showInputDialog ("Informe a base maior do trap�zio"));
				altura=Double.parseDouble(JOptionPane.showInputDialog ("Informe a altura do trap�zio"));
				q.lados(lado1, lado2, baseMenor, baseMaior, altura);
				System.out.println ("O per�metro � " + q.getPerimetro());
				System.out.println ("A �rea � " + q.getArea());
			
	}

}
