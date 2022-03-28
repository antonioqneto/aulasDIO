
public class Main {

	public static void main(String[] args) {
		Cliente fulano = new Cliente();
		fulano.setNome("Fulano");
		fulano.setEndereco("Rua dos bobos, 0");
		
		Conta cc = new ContaCorrente(fulano);
		Conta poupanca = new ContaPoupanca(fulano);
		
		cc.depositar(500);
		cc.transferir(250, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
