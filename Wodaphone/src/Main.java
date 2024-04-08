
import static Cose.utlity.*;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        String [] operazioni = {"VODAFONE",
                "[1] - Inserimento",
                "[2] - Visualizzazione",
                "[3] - Ricerca",
                "[4] Fine"};

        Scanner input = new Scanner(System.in);
        final int nMax=3;
        Contatto [] gestore = new Contatto[3];
        boolean Sitel=true;

        int contrattiVenduti=0;

        boolean esci=true;

        do {
            switch (printMenu(operazioni, input)) {
                case 1 :
                    if(contrattiVenduti<nMax)
                    {/* lettura */
                        gestore[contrattiVenduti]=leggiPersona(Sitel, input);
                        contrattiVenduti++;
                    }

                case 2 :

                case 3 :

                case 4 :
                    esci = false;

            }
        }while(esci);




    }


    private static Contatto leggiPersona(boolean Sitel, Scanner input)
    {

        String [] TipoC={ "Telefono","abitazione", "cellulare", "aziendale"};

        //sitel è true quando dobbiamo leggere

        //istanziare oggetto di tipo contatto
        Contatto persona = new Contatto();

        //inserimento nome
        System.out.println("Inserisci il nome ");
         persona.nome=input.next();

        //inserimento cognome
        System.out.println("Inserisci il cognome ");
        persona.cognome=input.next();

        //inserimento numero di telefono
        System.out.println("Inserisci numero di telefono");
        persona.telefono=input.next();  

        if(Sitel) {
            persona.telefono = input.next();
            switch(printMenu(TipoC, input)){

              case 1 -> persona.tipo=TipoContratto.abitazione;

              case 2 -> persona.tipo=TipoContratto.cellulare;

             default -> persona.tipo=TipoContratto.aziendale;


            }
        }





        return persona;

    }

    private static void Visualizza(String [] gestore, int contrattiVenduti){
        //RICMOINCIA A BESTEMMIARE DA QUI
        for(int i=0;i<=contrattiVenduti;i++){



        }


    }
}