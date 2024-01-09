import java.util.Scanner;
public class modificcaVinaio {
    public static void main(String[] args) {
        int cont=1;
        do{
            //dichiarazione inziazillazione variabile
            int nBottiglie=0;
            int scelta;
            double iva;
            double costototale, costoFinale;
            double prezzo=0;
            Scanner input = new Scanner(System.in);
            //scelta tipo di vino
            System.out.println("seleziona il tipo di vino che vuoi comprare");
            System.out.println("1-barbera");
            System.out.println("2-Lugana");
            System.out.println("3-Merlot");
            scelta= input.nextInt();
            //if per prezzo
            if(scelta==1){
                prezzo=1.5;
            }
            else if(scelta==2){
                prezzo=2;
            }
            else if(scelta==3){
                prezzo=1;
            }
            //numero bottiglie
            System.out.println("Inserire quantità bottiglioni da acquistare");
            nBottiglie= input.nextInt();
            //calcoli
            costototale=nBottiglie*prezzo;
            iva= (costototale/100)*21;
            costoFinale=costototale-iva;
            //scontrino
            System.out.println("I bottiglioni acquistati sono: "+nBottiglie);
            System.out.println("Il costo totale è: "+costototale);
            System.out.println("di cui iva: "+iva);
            System.out.println("Prezzo senza iva: "+costoFinale);

            System.out.println("vuoi fare un altro ordine?");
            System.out.println("0=no  1=si");
            cont= input.nextInt();

            //fine programma
        }while(cont==1);


    }
}
