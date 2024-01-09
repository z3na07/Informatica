import java.util.*;
public class es {
    public static void main(String[] args) {
        Random casuale = new Random();
        String studente;
        /*for(int i=0;  i<10; i++){
            System.out.println(casuale.nextInt(0,20)+1);

        }*/
        //generiamo un val corrispondente al numero assegnato agli studenti della classe 3E
        switch(casuale.nextInt(0,7)+1)//possiamo definire byte, short char, int string e numeratori
        {
            case 1: //con il costrutto case non si possono definire espressioni
                studente="Mattia Albieri";
                break;
            case 2: //con il costrutto case non si possono definire espressioni
                studente="Filippo barchi";
                break;

            case 3: //con il costrutto case non si possono definire espressioni
                studente="Basaglia Noemi";
                break;

            case 4: //con il costrutto case non si possono definire espressioni
                studente="Bego Francesco";
                break;

            case 5: //con il costrutto case non si possono definire espressioni
                studente="Stefano Boscolo";
                break;

            case 6: //con il costrutto case non si possono definire espressioni
                studente="Daniele Chiarion";
                break;
            case 7: //con il costrutto case non si possono definire espressioni
                studente="Eleonora Cosmi";
                break;

            case 8: //con il costrutto case non si possono definire espressioni
                studente="Mattia Crepaldi";
                break;

            default:
                studente="Oggi non interroghiamo";
                break;

        }
        System.out.println("è uscito il nome "+studente);
    }
}

