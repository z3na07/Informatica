import java.util.Scanner;
public class Vinaio {
    public static void main(String[] args) {
        //dichiarazione inziazillazione variabile
        int nBottiglie=0;
        double iva;
        double costototale, costoFinale;
        Scanner input = new Scanner(System.in);
        //numero bottiglie
        System.out.println("Inserire quantità bottiglioni da acquistare");
        nBottiglie= input.nextInt();
        //calcoli
        costototale=nBottiglie*1.5;
        iva= (costototale/100)*21;
        costoFinale=costototale-iva;
        //scontrino
        System.out.println("I bottiglioni acquistati sono: "+nBottiglie);
        System.out.println("Il costo totale è: "+costototale);
        System.out.println("di cui iva: "+iva);
        System.out.println("Prezzo senza iva: "+costoFinale);

        //fine programma




    }
}
