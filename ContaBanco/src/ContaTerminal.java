import java.util.Scanner;

public class ContaTerminal {

    static Long numero;
    static String nomeCliente;
    static String agencia;
    static double saldo;

    static Scanner teclado = new Scanner(System.in);

    void inserirNome(){
        System.out.println("Por favor, digite seu nome");
        nomeCliente = teclado.nextLine();
    }

    public static void main(String[] args) throws Exception {
        
        ContaTerminal conta = new ContaTerminal();

        conta.inserirNome();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = teclado.next();
        System.out.println("Por favor, digite o numero da conta!");
        numero = teclado.nextLong();
        System.out.println("Por favor, digite o saldo da sua conta!");
        saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");

    }
}
