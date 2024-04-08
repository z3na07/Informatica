
import java.util.Random;
import java.util.Scanner;

public class Fiam {
    public static void main(String[] args) {

        //inizializzazione variabili
        Scanner input = new Scanner(System.in);
        int nFiam=0, sceltaGiocata = 0;

        //Richiamo metodo menu
        sceltaGiocata=Menu(sceltaGiocata, input);

        //Richiamo metoo gioco
        Gioco(nFiam, input, sceltaGiocata);



    }

    //metodo menu
    private static int Menu(int sceltaGiocata, Scanner input){

        //menu inizale
        System.out.println("[1] - Giocatore VS Computer");
        System.out.println("[2] - Giocatore VS Giocatore2");
        System.out.println("[3] - PC vince sempre");
        System.out.println("[4] - Esci");
        System.out.println("\n");

        //try catch per controllo scelta
        try{
            System.out.println("cosa vuoi fare? Inserire il numero corrispondente alla scelta che si vuole fare");
            sceltaGiocata=input.nextInt();
            while(sceltaGiocata<0 || sceltaGiocata>4){
                System.out.println("Scelta non valida reinserire");
                sceltaGiocata=input.nextInt();
            }
        }catch(Exception e){
            System.out.println("devi inserire un numero, ottuso");

        }

        //return finale
        return sceltaGiocata;
    }


    //metodo gioco
    private static void Gioco(int nFiam, Scanner input, int sceltaGiocata){


        //dichiarazione variabili locali
        int nfiamPC=0, fiammiferi=21;
        boolean vinto = true;
        Random casuale = new Random();

        //switch per tipo di gioco
        switch (sceltaGiocata){

            case 1:
                do {
                    //for stampa fiam1
                    vinto=true;
                    for(int i=0;i<fiammiferi;i++){

                        System.out.print("* ");
                    }

                    System.out.println();

                    //for stampa fiam2
                    for(int j=0; j<fiammiferi;j++){
                        System.out.print("| ");
                    }


                    //metodo prelevo fiammiferi
                    nFiam=PrelevoFiammiferi(nFiam, input, fiammiferi, vinto);

                    //Sottrazione fiammiferi
                    fiammiferi=fiammiferi-nFiam;


                    //for stampa fiam1
                    for(int i=0;i<fiammiferi;i++){

                        System.out.print("* ");
                    }

                    System.out.println();

                    //for stampa fiam2
                    for(int j=0; j<fiammiferi;j++){
                        System.out.print("| ");
                    }
                    System.out.println();



                    if(fiammiferi!=0) {
                        vinto=false;
                        //turno pc
                        System.out.println("Ora tocca al pc");
                        nfiamPC = casuale.nextInt(1, 3) + 1;
                        if (fiammiferi < 3) {
                            nfiamPC = casuale.nextInt(1, 2) + 1;
                        }
                        System.out.println("Il pc ha preso " + nfiamPC + " fiammiferi");
                        fiammiferi = fiammiferi - nfiamPC;
                    }



                }while(fiammiferi != 0);


                //output vincitori
                if(vinto)
                    System.out.println("Ha vinto il giocatore");

                if(!vinto)
                    System.out.println("Ha vinto il pc");

                break;

            case 2:

                do {
                    System.out.println("Tocca al giocatore");

                    vinto=true;

                    //for stampa fiam1
                    for (int i = 0; i < fiammiferi; i++) {

                        System.out.print("* ");
                    }

                    System.out.println();

                    //for stampa fiam2
                    for (int j = 0; j < fiammiferi; j++) {
                        System.out.print("| ");
                    }
                    System.out.println();

                    //prelevo dei fiammiferi
                    nFiam = PrelevoFiammiferi(nFiam, input, fiammiferi, vinto);

                    //sottrazione fiammiferi
                    fiammiferi= fiammiferi-nFiam;

                    //cambio variabile bool
                    vinto=false;


                    if(fiammiferi!=0) {
                        System.out.println("Tocca al giocatore2");

                        //for stampa fiam1
                        for (int i = 0; i < fiammiferi; i++) {

                            System.out.print("* ");
                        }

                        System.out.println();

                        //for stampa fiam2
                        for (int j = 0; j < fiammiferi; j++) {
                            System.out.print("| ");
                        }
                        System.out.println();

                        nFiam = PrelevoFiammiferi(nFiam, input, fiammiferi, vinto);

                        //sottrazione fiammiferi
                        fiammiferi = fiammiferi - nFiam;
                    }

                }while(fiammiferi!=0);

                //output vincitori
                if(vinto)
                    System.out.println("Ha vinto il giocatore");

                if(!vinto)
                    System.out.println("Ha vinto il giocatore2");


                break;


            case 3:

                while(fiammiferi!=0) {
                    int contPc = 0;
                    //cambio variabile bool
                    vinto = false;

                    System.out.println("Ora tocca al pc");

                    //for stampa fiam1
                    for (int i = 0; i < fiammiferi; i++) {

                        System.out.print("* ");
                    }

                    System.out.println();

                    //for stampa fiam2
                    for (int j = 0; j < fiammiferi; j++) {
                        System.out.print("| ");
                    }
                    System.out.println();

                    //turno pc
                    while (fiammiferi % 4 != 0) {
                        fiammiferi--;
                        contPc++;
                    }
                    System.out.println("Il pc ha preso " + contPc + " fiammiferi");
                    fiammiferi = fiammiferi - nfiamPC;


                    if (fiammiferi != 0) {
                        System.out.println("Tocca al giocatore");

                        vinto = true;

                        //for stampa fiam1
                        for (int i = 0; i < fiammiferi; i++) {

                            System.out.print("* ");
                        }

                        System.out.println();

                        //for stampa fiam2
                        for (int j = 0; j < fiammiferi; j++) {
                            System.out.print("| ");
                        }
                        System.out.println();

                        //prelevo dei fiammiferi
                        nFiam = PrelevoFiammiferi(nFiam, input, fiammiferi, vinto);

                        //sottrazione fiammiferi
                        fiammiferi = fiammiferi - nFiam;
                    }

                }

                //output vincitori
                if(vinto)
                    System.out.println("Ha vinto il giocatore");

                if(!vinto)
                    System.out.println("Ha vinto il pc");
                

                break;


            case 4:

                break;











        }

    }

    private static int PrelevoFiammiferi(int nFiam, Scanner input, int fiammiferi, boolean vinto) {


            if (fiammiferi < 3) {
                do {


                    System.out.println("Quanti fiammiferi vuoi prelevare? o 1 o 2");
                    nFiam = input.nextInt();

                }while(fiammiferi<0 || fiammiferi>2);

            } else if (fiammiferi >= 3)
            {
                System.out.println("Quanti fiammiferi vuoi prendere? da 1 a 3");
                nFiam = input.nextInt();

                while (nFiam < 0 || nFiam > 3)
                {
                    System.out.println("scelta sbagliata, reinseire");
                    nFiam = input.nextInt();
                }
                // E SEU UN SURGUS
                // E C'HAI LA FACCIA DA SURGUS
                // PK SEI UN SURGUS
                // SEI UN DROGATO?

            }
            else if(fiammiferi==1){
                System.out.println("Prendere il fiammifero");
                nFiam=input.nextInt();
                while (nFiam != 1)
                {
                    System.out.println("scelta sbagliata, reinseire");
                    nFiam = input.nextInt();
                }



            }




        return nFiam;

}
}

