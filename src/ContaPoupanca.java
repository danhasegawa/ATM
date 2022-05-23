import java.util.Scanner;

public class ContaPoupanca extends Conta {

	Scanner digite = new Scanner(System.in);

	public ContaPoupanca() {
		System.out.println("Estamos processando sua solicitacao:");
		System.out.println("Nome do titular: ");
		titular = digite.nextLine();

		System.out.println("CPF do titular: ");
		cpf = digite.nextLine();

		System.out.println("Bem vindo " + titular);
		System.out.println("Sua Conta Poupanca ja esta em operacao!");
	}

	@Override
	public void depositar(double valor) {
		valor = digite.nextDouble();
		super.saldo += valor;
		digite.close();

	}

}
