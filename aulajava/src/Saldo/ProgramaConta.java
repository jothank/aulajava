package Saldo;

public class ProgramaConta {
	
	public static void main(String[] args) {
		
		Conta cont = new Conta("100.100.100-10",10,10.00);
		double valorEmprestimo;
		double valorDeposito;
		double valorRetirada;
		int valorReajuste;
		
		valorEmprestimo=70.00;
		valorDeposito=500.00;
		valorRetirada=60;
		valorReajuste=10;
		
		cont.deposito(valorDeposito);
		cont.emprestimo(valorEmprestimo);
		cont.retirada(valorRetirada);
		cont.reajustar(valorReajuste);
		cont.reajustar(valorReajuste);
		cont.imprime();
	}
	
}