import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da  Agencia: ");
        agencia = ler.next();
        System.out.print("Por favor, digite o Numero da Conta: ");
        numero = ler.nextInt();
        System.out.print("Por favor, digite o seu Nome: ");
        nomeCliente = ler.next();
        System.out.print("Por favor, digite o Saldo: ");
        saldo = ler.nextDouble();

        System.out.println("Olá "+nomeCliente+", Obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
                ", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}