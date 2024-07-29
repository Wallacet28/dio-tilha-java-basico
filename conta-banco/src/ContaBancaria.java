import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        // TODO: Conhecer e importar classe Scanner
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("pt", "BR")); // Configura o scanner para aceitar vírgula como separador decimal
    
        // Declare as variáveis para armazenar os dados da conta
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;
    
        // Exibir as mensagens para o usuário
        try {
            System.out.println("Por favor, digite o número da conta: ");
            if (scanner.hasNextInt()) {
                numeroConta = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha
            } else {
                throw new InputMismatchException("Número da conta inválido.");
            }
    
            System.out.println("Por favor, digite o número da agência: ");
            agencia = scanner.nextLine();
    
            System.out.println("Por favor, digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();
    
            System.out.println("Por favor, digite o saldo inicial com a vírgula: ");
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();
            } else {
                throw new InputMismatchException("Saldo inicial inválido.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira os dados no formato correto.");
            return; // Sair do programa se houver entrada inválida
        } finally {
            // Fechar o scanner
            scanner.close();
        }
    
        // Exibir a mensagem de conta criada com as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua conta é: " + numeroConta + ", agência: " + agencia + " e saldo: R$" + String.format(Locale.getDefault(), "%.2f", saldo));
    }
}
