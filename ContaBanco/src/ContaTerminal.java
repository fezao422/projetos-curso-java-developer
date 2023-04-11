import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        String nome_cliente;
        float saldo;

        System.out.print("Por favor, digite o número da  Agencia! ");
        agencia = ler.next();
        System.out.print("Por favor, digite o Numero da Conta ! ");
        numero = ler.nextInt();
        System.out.print("Por favor, digite o seu Nome ! ");
        nome_cliente = ler.next();
        System.out.print("Por favor, digite o Saldo ! ");
        saldo = ler.nextFloat();

        System.out.println("Olá "+nome_cliente+", Obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
                ", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}