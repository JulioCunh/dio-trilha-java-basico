import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu numero do agencia: ");
    int agencia = scanner.nextInt();

    System.out.println("Digite sua conta: ");
    String conta = scanner.next();

    System.out.println("Digite seu nome:");
    String nomeCliente = scanner.next();

    System.out.println("Digite seu nome:");
    String sobreNome = scanner.next();

    System.out.println("Qual o valor do deposito? ");
    double saldo = scanner.nextDouble();

    System.out.println(
        "Olá " + nomeCliente + " " + sobreNome + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta " + conta + "  seu saldo R$ " + saldo + " já está disponível para saque.");

  }
}