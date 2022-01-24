package Projeto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Conta {
	Execucao ex = new Execucao();
	Scanner Leia = new Scanner(System.in);
	Long numConta = (long) 100;
	String nome;
	String email;
	String senha;
	Float saldo = (float) 0;
	Float credito = (float) ((float) saldo * 1.25);


	public void SuporteDeRegistro() {
		System.out.println("Insira o email desejado: ");
		setEmail(Leia.next());
		System.out.println("Insira a senha: ");
		setSenha(Leia.next());
		System.out.println("Insira o seu nome: ");
		setNome(Leia.next());
		System.out.println("Insira da conta desejada: ");
		setNumConta(Leia.nextLong());
	}
	
	public void RegistrarCliente(String Email, String Senha, String Nome ,String NumConta) {
		SuporteDeRegistro();
		setEmail(getEmail());
		setSenha(getSenha());
		setNome(getNome());
		setNumConta(getNumConta());
	}
	
	public void Login(String emailField, String senhaField) {
		if(getEmail().equals(emailField) && getSenha().equals(senhaField)) {
			espacamento();
			System.out.println("Voc� logou com sucesso! Bem vindo "+getNome()+"!");
			espacamento();
		} else {
			espacamento();
			System.out.println("Credenciais inv�lidas!");
			espacamento();
		}
	}
	
			// =============== M�todos =============== //
	public void deposito(Float valorDepositado)
	
	{
		System.out.println("");
		setSaldo(saldo+valorDepositado);
		System.out.println(this.nome + ", seu dep�sito de: R$"+valorDepositado+" foi efetuado com sucesso!");
		System.out.println("Seu novo saldo � de: R$"+saldo);
		System.out.println();
	}

	public void sacar (Float valorSacado) {
	if(getSaldo() + getCredito()>= valorSacado) {
		setSaldo(saldo-valorSacado);
		System.out.println("");
		System.out.println("Valor de: R$ "+valorSacado+" sacado com sucesso!");
		System.out.println("Seu novo saldo � de: R$"+saldo);
		System.out.println();
		System.out.println("");
	}else {
			System.out.println("");
			System.out.println("Seu saldo/cr�dito � insuficiente para concluir esta fun��o."); 
			System.out.println("");
		}
	}
	
	
	public void espacamento() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	public void resumo() {
		System.out.println("======================================");
		System.out.println("|| Numero da conta: "+numConta);
		System.out.println("|| Nome: "+nome);
		System.out.println("|| Email: "+email);
		System.out.println("|| Saldo: R$"+saldo);
		System.out.println("======================================");
		System.out.println();
	}
	
	public void transferencia (Float valorTransferido, String emailDestinat�rio) {
		if(getSaldo() + getCredito()>= valorTransferido) {
		System.out.println("");
		System.out.println("Sua transferencia no valor de: R$"+valorTransferido+" foi enviada com sucesso. ");
		System.out.println("Recebedor: "+emailDestinat�rio);
		setSaldo(saldo-valorTransferido);
		System.out.println("Seu novo saldo �: R$"+getSaldo());
		System.out.println("");
	}else {
		System.out.println("");
		System.out.println("Seu saldo/cr�dito � insuficiente para concluir esta fun��o."); 
		System.out.println("");
	}
		}
	
	
	
	public void consultaCredito() {
		System.out.println("");
		System.out.println("Seu cr�dito � de: R$" +credito);
		System.out.println("");
	}
	
	public void solicitarCredito() {
		if(getSaldo()>=0 && getCredito()*getSaldo()>getCredito()) {
			System.out.println("");
			setCredito(saldo * 1.25);
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("Infelizmente o acrescimo no valor de cr�dito n�o foi autorizado.");
			System.out.println("");
		}
		
	}
	
	public void pix(Float ValorPix, String Destinat�rio){
		
		if(getSaldo() + getCredito()>= ValorPix) {
		System.out.println("");
		if(Destinat�rio.length()>=11) {
			System.out.println("");
			System.out.println("Seu pix no valor de R$"+ValorPix+" foi processado com sucesso.");
			System.out.println("Destinat�rio: " + Destinat�rio);
			System.out.println("");
		} else
		{
			System.out.println("");
			System.out.println("Insira uma chave v�lida");
			System.out.println("");
		}
		} else {
			System.out.println("Seu saldo/cr�dito � insuficiente para concluir esta fun��o."); 
		}
		
	}
		// =============== M�todos =============== //
	
	
	// =============== Getters and Setters =============== //
	
	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(float f) {
		this.saldo = f;
	}

	public Long getNumConta() {
		return numConta;
	}

	public void setNumConta(long l) {
		this.numConta = l;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Float getCredito() {
		return credito;
	}
	public void setCredito(double d) {
		this.credito = (float) d;
	}
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	
	
	
	// =============== Getters and Setters =============== //
}
