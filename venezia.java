import java.util.Random;
import java.util.Scanner;

public class venezia {
    public static void main(String[] args) {
        int[] ruota = new int[6];
        int estratto;
        Random numero = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            estratto = numero.nextInt(0, 90) + 1;
            ruota[i] = estratto;
            System.out.println(ruota[i]);

        }
        System.out.println("I numeri estratti finali sono: \n");
        stampa(ruota);


    }
    private static void stampa(int[] ruota){
        for(int j=0; j<5; j++){
            System.out.println(ruota[j]);
        }


    }
}