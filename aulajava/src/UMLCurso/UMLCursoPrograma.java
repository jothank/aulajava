package UMLCurso;

public class UMLCursoPrograma {
	
	public static void main(String[] args) {
		
	UMLCurso c1 = new UMLCurso();
	 c1.setCodigo(100);
	 c1.setNome ("Lógica de programação");
	 c1.setPreco(600.00);
	 c1.setCargaHoraria(120);
	 c1.reajustar(10.00);
	 c1.imprime();
	}
}