package ClasseProduto;

public class Produto {
	
	public int codigo, venda, compra;
	public double preco, estoque, reajuste;
	
	public void imprime() {
		System.out.println("O c�digo do produto �: " + codigo);
		System.out.println("O pre�o do produto em reais �: " + preco);
		System.out.println("O n�mero de produtos no estoque � de: " + estoque);
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
