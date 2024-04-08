import java.util.Scanner;
package persona;
public class GestioneData {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int data;
        int[] dataGGMMAAAA;
        boolean dataError = false;
        do {
            System.out.println("Inserisci la data in GGMMAAAA o GMMAAAA");
            data = tastiera.nextInt();
            dataError = validaData(data);
            if (!dataError)
                System.out.println("Formato data errato");
        } while (!dataError);
        //GGMMAAAA o GMMAAAA
        System.out.println("Data corretta");

        dataGGMMAAAA = elementiData(data);
        System.out.println(dataGGMMAAAA[0]);
        System.out.println(dataGGMMAAAA[1]);
        System.out.println(dataGGMMAAAA[2]);

        System.out.println(dataString(dataGGMMAAAA));

        // Menu per aggiungere o togliere giorni
        int scelta;
        do {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aggiungi giorni");
            System.out.println("2. Togli giorni");
            System.out.println("0. Esci");

            scelta = tastiera.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il numero di giorni da aggiungere:");
                    int giorniAggiunti = tastiera.nextInt();
                    dataGGMMAAAA = data_up(dataGGMMAAAA, giorniAggiunti);
                    System.out.println(dataString(dataGGMMAAAA));
                    break;
                case 2:
                    System.out.println("Inserisci il numero di giorni da togliere:");
                    int giorniTolto = tastiera.nextInt();
                    dataGGMMAAAA = data_down(dataGGMMAAAA, giorniTolto);
                    System.out.println(dataString(dataGGMMAAAA));
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);
    }
    public static boolean validaData(int data) {
        int lunghezza = 0;
        int tempData = data; // Memorizza il valore originale di data per il controllo della lunghezza
        do {
            tempData = tempData / 10;
            lunghezza++;
        } while (tempData > 0);
        return (lunghezza == 8 || lunghezza == 9);
    }
    public static int[] elementiData(int data) {
        int[] elementi = new int[3];
        elementi[0] = data % 10000; //12042004
        data = data / 10000;
        elementi[1] = data % 100;
        data = data / 100;
        elementi[2] = data;
        return elementi;
    }
    public static String dataString(int[] dataGGMMAAAA) {
        String meseS;
        meseS = switch (dataGGMMAAAA[1]) {
            case 1 -> " gennaio ";
            case 2 -> " Febbraio ";
            case 3 -> " Marzo ";
            case 4 -> " Aprile ";
            case 5 -> " Maggio ";
            case 6 -> " Giugno ";
            case 7 -> " Luglio ";
            case 8 -> " Agosto ";
            case 9 -> " Settembre ";
            case 10 -> " Ottobre ";
            case 11 -> " Novembre ";
            case 12 -> " Dicembre ";
            default -> " Errato ";
        };
        return dataGGMMAAAA[2] + meseS + dataGGMMAAAA[0];
    }
    public static int[] data_up(int[] dataGGMMAAAA, int giorni) {
        int giorno = dataGGMMAAAA[0];
        int mese = dataGGMMAAAA[1];
        int anno = dataGGMMAAAA[2];


        giorno += giorni;


        while (giorno > giorniDelMese(mese, anno)) {
            giorno -= giorniDelMese(mese, anno);
            mese++;
            if (mese > 12) {
                mese = 1;
                anno++;
            }
        }


        dataGGMMAAAA[0] = giorno;
        dataGGMMAAAA[1] = mese;
        dataGGMMAAAA[2] = anno;


        return dataGGMMAAAA;
    }


    public static int[] data_down(int[] dataGGMMAAAA, int giorni) {
        int giorno = dataGGMMAAAA[0];
        int mese = dataGGMMAAAA[1];
        int anno = dataGGMMAAAA[2];


        giorno -= giorni;


        while (giorno <= 0) {
            mese--;
            if (mese <= 0) {
                mese = 12;
                anno--;
            }
            giorno += giorniDelMese(mese, anno);
        }


        dataGGMMAAAA[0] = giorno;
        dataGGMMAAAA[1] = mese;
        dataGGMMAAAA[2] = anno;


        return dataGGMMAAAA;
    }


    public static int giorniDelMese(int mese, int anno) {
        if (mese == 2) {
            if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (mese == 4 || mese == 6 || mese == 9 || mese == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}

