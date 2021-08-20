package AulaConstrutores;

public class SalarioPrograma {

	public static void main(String[] args) {
		
		Salario sal = new Salario(1001);
		sal.calculaSalario(20);
		sal.imprime();
		
		
		System.out.println("matricula " +  sal.getMatriculaEmpregado());
		System.out.println("salario por hora " + sal.getSalarioHora());
		
		int matricula;
		double salarioHora;
		
		matricula=111;
		salarioHora=18.50;
				
		Salario sal2 = new Salario(matricula,salarioHora);
		
		sal.calculaSalario(20);
		sal2.imprime();
		
		System.out.println("matricula " +  sal2.getMatriculaEmpregado());
		System.out.println("salario por hora " + sal2.getSalarioHora());

				
	}

}
