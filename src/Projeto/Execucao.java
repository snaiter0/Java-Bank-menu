package Projeto;

import java.util.Scanner;

public class Execucao {
	
	String emailField;
	String senhaField;
	String email = "snaiter.lopes@gmail.com";
	String senha = "190899";
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
			int Exit = 9;
		
			Scanner Leia = new Scanner(System.in);
			Conta cliente1 = new Conta();
			System.out.println("Execução iniciada");
			cliente1.espacamento();
			
			
			// Registro de cliente //
			cliente1.setNumConta(00001);
			cliente1.setNome("Douglas");
			cliente1.setEmail("snaiter.lopes@gmail.com");
			cliente1.setSenha("190899");

			// Registro de cliente //
			
			System.out.println("Insira seu email de login:");
			String emailField = Leia.next();
			System.out.println("Insira sua senha de login:");
			String senhaField = Leia.next();
			
			
			if(emailField!=null && senhaField!=null) {
				cliente1.Login(emailField, senhaField);
				Exit = 9;
			}
			
		while(Exit != 0) {
				switch(Exit) {
				case 0:
					System.out.println("Agradecemos pela preferencia, até mais.");
					break;
					
				case 1: 
					cliente1.resumo();
					Exit=9;
					break;
						
				case 2: 
					System.out.println("Insira o novo valor que será depositado: ");
					Float ValorDepositado = Leia.nextFloat();
					if(ValorDepositado!=null) {
						cliente1.deposito(ValorDepositado);
						Exit=9;
					}
					break;

				case 3:
					System.out.println("Insira o valor que será sacado: ");
					Float ValorSacado = Leia.nextFloat();
					if(ValorSacado!=null) {
						cliente1.sacar(ValorSacado);
						Exit=9;
					}
					break;
					
				case 4:
					System.out.println("Insira o valor que deseja transferir: ");
					Float ValorTransferido = Leia.nextFloat();
					System.out.println("Insira o email do destinatário: ");
					String emailDestinatário = Leia.next();
					if(ValorTransferido!= null && emailDestinatário!=null)
					{
						cliente1.transferencia(ValorTransferido, emailDestinatário);
						Exit=9;
					}
					break;
					
				case 5: 
					cliente1.consultaCredito();
					Exit=9;
					break;
					
				case 6:
					cliente1.solicitarCredito();
					Exit=9;
					break;
					
				case 7:
					System.out.println("Insira o valor transferido: ");
					Float ValorTransferido2 = Leia.nextFloat();
					System.out.println("Insira a chave pix: ");
					String emailDestinatário2 = Leia.next();
					cliente1.pix(ValorTransferido2, emailDestinatário2);
					Exit=9;
					break;	
			}
				System.out.println("//======== Bem vindo ao menu ========// ");
				System.out.println("Digite 1 para consultar o resumo da sua conta");
				System.out.println("Digite 2 para Deposito");
				System.out.println("Digite 3 para Saques");
				System.out.println("Digite 4 para Transferencias");
				System.out.println("Digite 5 para Consultar crédito");
				System.out.println("Digite 6 para solicitar atualização do limite de crédito");
				System.out.println("Digite 7 para pagar ou receber com pix");
				System.out.println("Digite 0 para encerrar o programa.");
				System.out.println("//===================================// ");
				Exit = Leia.nextInt();
		}
	}
}
