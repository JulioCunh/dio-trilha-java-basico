import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o limite diário da entrada do usuário
        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;

        // Loop para processar retiradas
        for (int i = 1;; i++) {
            // Lendo o valor da retirada a partir da entrada do usuário
            double valorSaque = scanner.nextDouble();

            // Verifique se o usuário digitou 0 para finalizar transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // End the loop
            }

            // Verifique se o valor do saque ultrapassa o limite restante
            if (valorSaque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // End the loop
            } else {
                // Realize o saque e atualize o limite restante
                limiteRestante -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteRestante);
            }
        }

        // Feche o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}