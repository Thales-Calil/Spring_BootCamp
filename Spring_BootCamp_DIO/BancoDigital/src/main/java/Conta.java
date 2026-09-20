public abstract class Conta {

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(int agencia, int numero, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo) {
            saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void imprimirExtrato() {
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}