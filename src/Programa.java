import java.util.Scanner;

public class Programa {
  
  public static void main(String args[]) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Bem-vindo!\n\n"
	  		+ "Vamos primeiro criar uma conta\n");
	  
	  Conta conta;
	  System.out.println("Seu nome:");
	  String titular = sc.next();
	  System.out.println("Número da conta:");
	  int numConta = sc.nextInt();
	  System.out.println("Fará um depósito inicial? (s/n):");
	  char resposta = sc.next().charAt(0);
	  
	  if(resposta == 's') {
		  System.out.println("Entre com o valor do depósito: ");
		  double depositoInicial = sc.nextDouble();
		  conta = new Conta(titular, numConta, depositoInicial);
	  } else {
		  conta = new Conta(titular, numConta);
	  }
	  
	  System.out.println("Conta criada com sucesso!");
	  
	  int opcao;
	  conta.exibirMenu();
	  opcao = sc.nextInt(); 
	  conta.escolherOpcao(opcao); 
	  
	  do {
		  conta.exibirMenu();
		  opcao = sc.nextInt();
		  conta.escolherOpcao(opcao);
	  } while(opcao != 4);
	  
	  
	  sc.close();
    }
 }

