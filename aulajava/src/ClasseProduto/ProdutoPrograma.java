package ClasseProduto;

import javax.swing.JOptionPane;

public class ProdutoPrograma {

	public static void main(String[] args) {

		Produto item = new Produto();
		
		item.codigo=100;
		item.estoque=1000;
		item.preco=150;
		
		double valorAdicional;
		
		System.out.println("");
		
		item.imprime();
		
		System.out.println("");
		System.out.println("************************************************");
		System.out.println("");
				
		valorAdicional=Double.parseDouble(JOptionPane.showInputDialog("Digite valor para adicionar ao preço: "));
		item.compra=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos comprados: "));
		item.venda=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos vendidos: "));
		
		item.reajustes(valorAdicional);
		item.compras();
		item.vendas();
		item.imprime();
		
	}

}
