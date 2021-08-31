package Competidor;

import javax.swing.JOptionPane;

public class CompetidorPrograma {
	
	public static void main(String[] args) {
		
		int idade;
		int minima;
		int maxima;
		
		minima=Competidor.idadeMinima;
		maxima=Competidor.idadeNaxima;
		
		idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		
		if ((idade<minima)||(idade>maxima))
			System.out.println("Digite a Idade correta entre 18 e 65");
		else
			informarCompetidor(idade);
		
	}

	private static void informarCompetidor(int id) {
		
		int inscricao;
		String nome;
		
		inscricao=Integer.parseInt(JOptionPane.showInputDialog("Digite a inscrição"));
		nome=JOptionPane.showInputDialog("Digite o nome");
		
		Competidor atleta = new Competidor(inscricao, nome);
		
		atleta.imprime();

	}
}