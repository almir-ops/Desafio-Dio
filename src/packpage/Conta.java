package packpage;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Conta implements InterfaceConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int digito;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.digito = SEQUENCIAL++;
		this.cliente= cliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}	
	
	protected void ImprimirDados() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Digito: %d", this.digito));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	
	}
	protected void caixaEletronico() {
		System.out.println(String.format("Olá, %s", this.cliente.getNome()));
		System.out.println("1 - Sacar");
		System.out.println("2 - Depositar ");
		System.out.println("3 - Transferir ");
		System.out.println("4 - Consultar Extrato");
		System.out.println("Escolha uma das opções: ");
		
		Scanner escolha = new Scanner(System.in);
		int n = escolha.nextInt();
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupança(cliente);
		cc.depositar(500);
		switch (n){
		case 1:
			System.out.println("Digite um valor para sacar : ");
			double valorSaque = escolha.nextDouble();
			cc.sacar(valorSaque);
			cc.Extrato();
			break;
		case 2:
			System.out.println("Digite um valor para Depositar : ");
			double valorDeposito = escolha.nextDouble();
			cc.depositar(valorDeposito);
			cc.Extrato();
			break;
		case 3:
			System.out.println("Digite um valor para transferir : ");
			double valorTransferencia = escolha.nextDouble();
			cc.transferir(valorTransferencia, poupanca);
			cc.Extrato();
			break;
		case 4:
			cc.Extrato();
			break;
		default:
			System.out.println("Numero Invalido");
				
	}
	
	}}
