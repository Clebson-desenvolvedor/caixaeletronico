import java.util.Scanner;

public class Conta {
	
	Scanner sc = new Scanner(System.in);

	private String titular;
	private int numConta;
	private double saldo;
	
	public Conta(String titular, int numConta, double depositoInicial) {
		
		this.titular = titular;
		this.numConta = numConta;
		depositar(depositoInicial);
	}
	
    public Conta(String titular, int numConta) {
		
		this.titular = titular;
		this.numConta = numConta;
	}
	
	public Conta() {
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return numConta;
	}

	public void setConta(int conta) {
		this.numConta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("saque realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente para saque! ");
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void extrato() {
		System.out.println("\tExtrato da Conta\n\n"
				+ "Titular: "
				+ titular
				+ "\nNúmero da Conta: "
				+ numConta
				+ "\nSaldo: " 
				+ String.format("%.2f", saldo)
				+ "\n--------------------------"); 
				
	}

	public void exibirMenu() {
		System.out.println("\n\n\t O que deseja fazer?\n\n"
				+ "1. ver extrato\n"
				+ "2. sacar\n"
				+ "3. depositar\n"
				+ "4. fechar programa");
	}
	
	public void escolherOpcao(int opcao) {
		
		double valor;
		switch(opcao) {
		case 1:
			extrato();
			//exibirMenu();
			break;
		case 2:
			System.out.println("Quanto deseja sacar? ");
			valor = sc.nextDouble();
			sacar(valor);
			break;
		case 3:
			System.out.println("Quanto deseja depositar? ");
			valor = sc.nextDouble();
			depositar(valor);
			System.out.println("Depósito realizado com sucesso!");
			break;
		case 4:
			System.out.println("Sistema encerrado. ");
			break;
		default:
			System.out.println("opção inválida. ");
		}
	}

	
}
