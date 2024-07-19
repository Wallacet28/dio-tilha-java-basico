import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Declare as variáveis para armazenar os dados da conta
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;
    
        // Solicite e receba os dados do usuário
        try {
            System.out.println("Por favor, digite o número da conta: ");
            numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
    
            System.out.println("Por favor, digite o número da agência: ");
            agencia = scanner.nextLine();
    
            System.out.println("Por favor, digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();
    
            System.out.println("Por favor, digite o saldo inicial: ");
            saldo = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira os dados no formato correto.");
        } finally {
            // Feche o scanner
            scanner.close();
        }
    
        // Exiba a mensagem final com as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua conta é: " + numeroConta + ", agência: " + agencia + " e saldo: R$" + saldo);
    }
}

