import java.util.Scanner;
public class ContaCorrente extends Conta {
	
	Scanner digite = new Scanner(System.in);

//	public ContaCorrente() {
//	System.out.println("Estamos processando sua solicitacao:");
//	System.out.println("Nome do titular: ");
//	titular = digite.nextLine();
//
//	System.out.println("CPF do titular: ");
//	cpf = digite.nextLine();
//
//	System.out.println("Valor do deposito inicial (Minimo R$50.0): ");
//	valor = digite.nextDouble();
//	depositoInicial(valor);
//
//	System.out.println("Bem vindo " + titular);
//	System.out.println("Sua Conta Correte ja esta em operacao!");
//	}

	@Override
	public  void depositar(double valor) {
		valor = digite.nextDouble();
		super.saldo += valor;
		
	}

}
