package Model;

public  abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agenciaDaConta;
    protected int numeroDaConta;
    protected double saldoDaConta;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agenciaDaConta = AGENCIA_PADRAO;
        this.numeroDaConta = SEQUENCIAL++;
        this.cliente = cliente;

    }

    @Override
    public void sacar(double valor) {
        this.saldoDaConta -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldoDaConta += valor;
    }

    @Override
    public void transferir(IConta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComuns() {
        System.out.println("Titular da Conta: " + this.cliente.getNomeDoCliente());
        System.out.println("Agência da Conta: " + this.agenciaDaConta);
        System.out.println("Numero da Conta: " + this.numeroDaConta);
        System.out.println("Saldo da Conta: " + this.saldoDaConta);
    }

    public int getAgenciaDaConta() {
        return agenciaDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

}
