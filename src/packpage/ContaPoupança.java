package packpage;

public class ContaPoupan�a extends Conta {
	
	public ContaPoupan�a(Cliente cliente) {
		super(cliente);
	}
	public void Extrato() {
		System.out.println("======= Extrato Conta Corrente =======");
		super.ImprimirDados();
	}
	
}
