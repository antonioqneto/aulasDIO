
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta (Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Endereco: %s", this.cliente.getEndereco()));
		System.out.println(String.format("Ag�ncia: %d",agencia));
		System.out.println(String.format("N�mero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}
}