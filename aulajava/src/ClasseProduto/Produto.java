package ClasseProduto;

public class Produto {
	
	public int codigo, venda, compra;
	public double preco, estoque, reajuste;
	
	public void imprime() {
		System.out.println("O código do produto é: " + codigo);
		System.out.println("O preço do produto em reais é: " + preco);
		System.out.println("O número de produtos no estoque é de: " + estoque);
	}
	
	public void reajustes(double valorAdicional) {
		preco=(preco+valorAdicional);
	}
	
	public void compras() {
		estoque=(estoque+compra);
	}

	public void vendas() {
		estoque=(estoque-venda);
	}
}
