package packpage;

public class ContaPoupanša extends Conta {
	
	public ContaPoupanša(Cliente cliente) {
		super(cliente);
	}
	public void Extrato() {
		System.out.println("======= Extrato Conta Corrente =======");
		super.ImprimirDados();
	}
	
}
