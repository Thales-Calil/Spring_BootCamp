public class Main {

    public static void main(String[] args) {

        Cliente thales = new Cliente("Thales");

        ContaCorrente corrente = new ContaCorrente(1, 1001, thales);
        ContaPoupanca poupanca = new ContaPoupanca(1, 1002, thales);

        corrente.depositar(1000);
        corrente.transferir(200, poupanca);

        corrente.imprimirExtrato();

        System.out.println();

        poupanca.imprimirExtrato();
    }
}