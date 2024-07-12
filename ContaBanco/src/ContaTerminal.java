import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor informe seu nome. ");
        String nome = scan.nextLine();

        System.out.println("Por favor, digite o número da agência. ");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o número da conta. ");
        int numeroConta = scan.nextInt();

        System.out.println("Por favor, informe qual é seu saldo.");
        double saldo = scan.nextDouble();

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta no nosso banco! Sua agência é " +
        agencia + ", conta " + numeroConta + ". Seu saldo de " + saldo + " já está disponível para saque");
        
    }
}
