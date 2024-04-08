import java.util.Scanner;

public class Booleani {

    public static void main(String[] args) {

        Boolean vero = true;     //reference
        boolean Vero = true;     //primitivo
        Scanner input = new Scanner(System.in);

        if(vero == Vero){
            System.out.println("Confronto fra reference e primitvo");
            System.out.println("Reference = "+vero.toString());

        }


        /*

        int -> Integer
        double -> Double
        char -> Character
        float -> Float

      */
        /*
        char car = 'a';
        if(car >= 'a' && car <= 'z')
            System.out.println("Il carattere è alfabetico");
        else
            System.out.println("Il carattere non è aòfabetico");

        car = Character.toUpperCase(car);

        if(Character.isDigit(car))
            System.out.println("Il carattere è alfabetico");
        else
            System.out.println("Il carattere non è alfabetico");

        */



        int Valore;
        Integer valore;
        String ggmmaaa = "12122024";


        valore = Integer.parseInt(ggmmaaa);
        System.out.println("valore = "+valore);

        Valore = Integer.parseInt("1111", 2);

        Valore = Integer.parseInt("FF", 16);

        int valore1;

        valore1=Integer.parseInt(ggmmaaa);



        try{
            valore1= Integer.parseInt("a"+ggmmaaa);
        }catch(Exception x){

            System.out.println("Erroe: Stringa non valida");
        }
        boolean error;
        do {
            System.out.println(valore1);
            error=false;

            System.out.println("Inserisci un valore intero");
            try {
                valore1 = input.nextInt();
            } catch (Exception x) {
                System.out.println("Errore: Il valore inserito non è un numero");
                error = true;
            }
        } while(error);

    }
}
