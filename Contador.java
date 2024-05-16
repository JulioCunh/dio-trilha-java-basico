import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws Exception {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Informe o primeiro parâmetro:");
			int parameter1 = scanner.nextInt();
			System.out.println("Informe o segundo parâmetro:");
			int parameter2 = scanner.nextInt();
			count(parameter1, parameter2);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Parametro inválido, informe um número inteiro.");
		}
	}

	static void count(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		int interação = parametroDois - parametroUm;
		for (int i = 1; i <= interação; i++) {
			System.out.println("Imprimindo o número " + i);
		}
		if (interação < 0)
			throw new ParametrosInvalidosException();
	}
}