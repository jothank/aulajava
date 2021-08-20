package AulaConstrutores;

public class Salario {
	
	private int matriculaEmpregado;
	private double salarioHora, salarioBruto, inss, salarioLiquido, desconto;
	
	public int getMatriculaEmpregado() {
		return matriculaEmpregado;
	}
	public void setMatriculaEmpregado(int matriculaEmpregado) {
		this.matriculaEmpregado = matriculaEmpregado;
	}
	public double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getInss() {
		return inss;
	}
	public void setInss(double inss) {
		this.inss = inss;
	}
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public Salario (int matricula) {
		matriculaEmpregado=matricula;
		salarioHora=15.00;
	}
	
	public Salario (int matricula, double sh) {
		matriculaEmpregado=matricula;
		
		if (sh>10.0 & sh<50.0)
			salarioHora=sh;
		else 
			salarioHora=0;
	}
	
	public void calculaSalario (int dias) {
		salarioBruto=dias*salarioHora;
		inss=salarioBruto*0.11;
		salarioLiquido=salarioBruto-inss;
	}
	
	public void imprime() {
		System.out.println("Matricula: " + matriculaEmpregado);
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Inss: " + inss);
		System.out.println("Salario Liquido: " + salarioLiquido);
	}
		
}
