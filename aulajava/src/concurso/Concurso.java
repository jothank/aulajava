package concurso;

public class Concurso {
	
	public int numeroCandidato;
	public double nota1;
	public double nota2;
	public double nota3;

		public void  calculaMedias (int peso1, int peso2, int peso3) {
			
		double mediaSimples;
		double mediaPonderada;		
		
		mediaSimples  = (nota1 + nota2 + nota3)/3;
		
		mediaPonderada  = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1+peso2+peso3);
		
		System.out.println ("A média simples é " + mediaSimples);
		System.out.println ("A média ponderada é " + mediaPonderada);
		
	}
}