package concurso;

public class ConcursoPrograma {

public static void main(String[] args) {		
		
		Concurso c = new Concurso (); 
		
		int p1, p2, p3;
		p1=5;
		p2=4;
		p3=1;
		c.nota1=2.5;
		c.nota2=3.5;
		c.nota3=9.0;
		
		c.calculaMedias (p1, p2, p3);

	}

}