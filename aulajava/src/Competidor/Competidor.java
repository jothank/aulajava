package Competidor;

public class Competidor {
	private int inscricao,idade;
	private String nome;

	public static int idadeMinima=18;
	public static int idadeNaxima=65;
	
	public int getInscricao() {
		return inscricao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public Competidor(int inscricao, String nome) {
		this.inscricao = inscricao;
		this.nome = nome;		
	}
	public void imprime() {
		System.out.println("Inscricao....." + inscricao);
		System.out.println("Nome.........." + nome);
		System.out.println("Idade........." + idade);	
	}
	
	
 }
 