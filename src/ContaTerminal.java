import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroDaConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        nomeCliente = entradaDados.nextLine();

        System.out.println("Por favor, digite o número da agencia:");
        agencia = entradaDados.nextLine();

        System.out.println("Agora digite o numero da conta:");
        numeroDaConta = entradaDados.nextInt();



        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + "e seu saldo [Saldo] já está disponível para saque");
    }
}
