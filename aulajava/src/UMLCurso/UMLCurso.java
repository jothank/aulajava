package UMLCurso;

public class UMLCurso {
	
	private int codigo;
	private String nome;
	private int cargaHoraria;
	private double preco;

		 public int getCodigo() {
				return codigo;
			}
			public void setCodigo(int codigo) {
				this.codigo = codigo;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public int getCargaHoraria() {
				return cargaHoraria;
			}
			public void setCargaHoraria(int cargaHoraria) {
				this.cargaHoraria = cargaHoraria;
			}
			public double getPreco() {
				return preco;
			}
			public void setPreco(double preco) {
				this.preco = preco;
			}
		public void imprime() {
			 System.out.println ("Código....... " + codigo);
			 System.out.println ("Nome......... " + nome);
			 System.out.println ("Carga horária. " + cargaHoraria);
			 System.out.println ("Preço......... " + preco);
		 }
		 public void reajustar (int porcentagem) {
		//se o parâmetro for inteiro, o reajuste é em percentual
			 preco = preco + (preco * porcentagem)/ 100.0;
		 }

		 public void reajustar (double reais) {
		//se o parâmetro for double, o reajuste é em R$ (Reais)
			 preco = preco + reais;
		 		 }

}
