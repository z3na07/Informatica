import java.util.Scanner;
import Persona.*;

public class Agenda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean fine=true;
        final int nmax=5;
        String[] Menu={
            "[1] - Inserimento",
            "[2] - Visualizzazione",
            "[3] - Rubrica",
            "[4] - Fine"
        };

        Contatto utente = new Contatto(); //istanzio oggetto di tipo contatto
        utente.nome="Pippo";
        utente.cognome="Rossi";
        utente.telefono="123";
        utente.utilizzo= Contatto.tipo.abitazione;
        Contatto banana = new Contatto();
        Contatto [] rubrica = new Contatto[nmax];

        do {
            switch (printMenu(Menu, input)) {
                case 1:

                    break;


                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    fine=false;
                    break;
            }
        }while(!fine);
    }


    public static int printMenu (String opzioni[], Scanner input)
    {
        int scelta;

        do {
            ClrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i=1; i < opzioni.length; i++)
            {
                System.out.println(opzioni[i]);
            }

            scelta = Integer.parseInt(input.nextLine());

            if ((scelta < 1 ) || (scelta > opzioni.length -1 ))
            {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((scelta < 1 ) || (scelta > opzioni.length -1 ));

        return scelta;
    }

    public static void ClrScr(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Wait(int attesa) {
        try{
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
