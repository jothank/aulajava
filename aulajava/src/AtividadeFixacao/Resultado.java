package AtividadeFixacao;

public class Resultado {
	
	private double n1, n2, media;
	
	public double getMedia() {
		return media;
	}
	
	public Resultado (double n1, double n2) {
		
		this.n1=n1;
		this.n2=n2;
		media = (this.n1+this.n2)/2;
	}
			
}
