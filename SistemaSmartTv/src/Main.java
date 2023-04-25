import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        SmartTV smartTV = new SmartTV();
        smartTV.ligar();
        System.out.println("LIGANDO TV");
        boolean sair = true;
        int controle;
        do {

            System.out.println("--STATUS TV--");
            System.out.println("CANAL ATUAL : " + smartTV.canal);
            System.out.println("VOLUME ATUAL: " + smartTV.volume);

            System.out.println("--CONTROLE-- \n" +
                    "1 CANAL +  |  2 CANAL - \n" +
                    "3 VOLUME + |  4 VOLUME - \n" +
                    "\t 0 DESLIGAR ");

            controle = ler.nextInt();
            switch (controle) {
                case 0:
                    System.out.println("DESLIGANDO TV!");
                    smartTV.desligar();
                    sair = false;
                    break;
                case 1:
                    smartTV.aumentaCanal();
                    break;
                case 2:
                    smartTV.diminuiCanal();
                    break;
                case 3:
                    smartTV.aumentaVolume();
                    break;
                case 4:
                    smartTV.diminuiVolume();
                    break;
            }
            System.out.println();
        } while (sair);
    }
}