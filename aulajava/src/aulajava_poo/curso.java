package aulajava_poo;

public class curso {
	
	public int codigo;
	public String nome;
	public int cargaHoraria;
	public double preco;
	
	public void imprime () {
		System.out.println(codigo);
		System.out.println(nome);
		System.out.println(cargaHoraria);
		System.out.println(preco);
	}
	
	public void reajustePreco (double percentual) {
		preco=preco+(preco*percentual)/100;
	}
	

}