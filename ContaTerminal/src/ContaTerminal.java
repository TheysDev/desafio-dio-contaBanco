import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numeroConta = solicitarInt("Por favor, digite o número da Conta Bancaria!", scanner);
            String numeroAgencia = solicitarString("Por favor, digite o número da Agência!", scanner);
            String nomeCorrentista = solicitarString("Por favor, digite o seu nome!", scanner);
            double saldo = solicitarDouble("Por favor, digite o valor do saldo em conta:", scanner);

            String mensagem = String.format(
                    "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo de R$%.2f já está disponível para saque.",
                    nomeCorrentista, numeroAgencia, numeroConta, saldo
            );
            System.out.println(mensagem);
        }
    }

    private static int solicitarInt(String mensagem, Scanner scanner) {
        System.out.println(mensagem);
        return scanner.nextInt();
    }

    private static double solicitarDouble(String mensagem, Scanner scanner) {
        System.out.println(mensagem);
        return scanner.nextDouble();
    }

    private static String solicitarString(String mensagem, Scanner scanner) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }
}
