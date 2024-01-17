import java.util.Random;
import java.util.Scanner;
public class Lotto {
    public static void main(String[] args) {

        int scelta = 0;
        boolean exit = true;
        int [] ruota=null;


//Sono nei tuoi muri


        Scanner input = new Scanner(System.in);
        do {
            ClrScr();
            init();
            scelta = input.nextInt();


            switch (scelta) {
                case 1:
                    ruota=EstraiNumero();
                    Wait();
                    break;

                case 2:
                     VisualizzaRuota(ruota);
                    Wait();
                    break;

                case 3:
                    exit=false;
                    Wait();
                    break;

                default:
                    System.out.println("Scelta errata");
                    Wait();
                    break;


            }
        }while (exit);

    }
    private static void init () {
        System.out.println("=== App lotto");
        System.out.println("\n");
        System.out.println("[1] Estrazioni ruota venezia");
        System.out.println("[2] Visualizzazione estrazione ruota venezia");
        System.out.println("[3] Exit");
    }

    private static void ClrScr () {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Wait() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int[] EstraiNumero(){
        int[] ruota = new int[5];
        int estratto;
        Random numero = new Random();
        Scanner def = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            estratto = numero.nextInt(0, 90) + 1;
            ruota[i] = estratto;
            System.out.println(ruota[i]);

        }
        return ruota;
    }
    private static void VisualizzaRuota(int [] ruota){
        for(int numero : ruota){
            System.out.print(numero+" ");
        }
        System.out.println();

    }
}

