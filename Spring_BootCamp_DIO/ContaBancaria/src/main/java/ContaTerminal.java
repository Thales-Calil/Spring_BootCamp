import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + "!");
        System.out.println("Saldo: R$ " + saldo);

        scanner.close();
    }
}