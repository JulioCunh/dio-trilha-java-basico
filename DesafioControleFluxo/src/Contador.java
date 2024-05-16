import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args) throws Exception {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    try {
      contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println("Parametro inválido, informe um número inteiro.");
    }

  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    int interacao = parametroDois - parametroUm;
    for (int i = 1; i < interacao; i++) {
      System.out.println("Imprimindo o número " + i);
    }
    if (interacao < 0)
      throw new ParametrosInvalidosException();
  }
}