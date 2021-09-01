package Saldo;

public class Conta {
	private String cpf;
	private double saldo;
	private double limite;
	
	
	public String getCpf() {
		return cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public double getLimite() {
		return limite;
	}
	public Conta(String cpf) {
		this.cpf = cpf;
	}
	public Conta(String cpf, double saldo) {
		this.cpf = cpf;
		this.saldo = saldo;
	}
	public Conta(String cpf, double saldo, double limite) {
		this.cpf = cpf;
		this.saldo = saldo;
		this.limite = limite;
	}
	public void deposito(double valor) {
		saldo=saldo+valor;
	}
	public void retirada(double valor) {
		if (valor > saldo)
			System.out.println("Não é possível completar essa operação, pois a Retirada é maior que o saldo!");
		else
			saldo=saldo-valor;
	}
	public void reajustar(double valor) {
		if (valor != 0)
			limite=limite+valor;
	}
	public void reajustar(int valor) {
		if (valor != 0)
			limite=limite+limite*(valor/100.00);
	}	
	public void emprestimo(double valor) {
		if (limite == 0 || limite <=valor) {
			
		}
		else
			limite=limite-valor;
	}
	public void imprime() {
		System.out.println("O CPF do Cliente é...." + cpf);
		System.out.println("O valor do Saldo é...." + saldo);
		System.out.println("O valor do Limite é..." + limite);
	}
}