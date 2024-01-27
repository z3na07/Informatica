import java.util.Scanner;
import java.util.Random;
public class Giuoco {

    public static void main(String[] args) {
        int dio;
                do{
            ClrScr();
            dio=Menu();

            Gioco(dio);


        }while(dio!=3);



    }

    private static int Menu(){
        int scelta;
        Scanner input= new Scanner(System.in);
        System.out.println("===App gara Dadi===");
        System.out.println("[1]-Sfida tra due giocatori");
        System.out.println("[2]-Sfida contro il computer");
        System.out.println("[3]-Exit");
        scelta=input.nextInt();


        return scelta;
    }

    private static void Gioco(int scelta){
        Random random= new Random();

        int Giocata, Giocata1;
        switch(scelta){

            case 1:
                Giocata= random.nextInt(1,6);
                System.out.println("Il giocatore 1 ha estratto: "+Giocata);
                Giocata1= random.nextInt(1,6);
                System.out.println("Il giocatore 2 ha estratto: "+Giocata1);
                if(Giocata>Giocata1){
                    System.out.println("Ha vinto il giocatore 1");
                }
                else if(Giocata<Giocata1){
                    System.out.println("Ha vinto il giocatore 2");
                }
                else{
                    System.out.println("Parità!");



        }
                break;
            case 2:
                Giocata= random.nextInt(0,6);
                System.out.println("Il giocatore  ha estratto: "+Giocata);
                Giocata1= random.nextInt(0,6);
                System.out.println("Il computer ha estratto: "+Giocata1);
                if(Giocata>Giocata1){
                    System.out.println("Ha vinto il giocatore ");
                }
                else if(Giocata<Giocata1){
                    System.out.println("Ha vinto il computer");
                }
                else{
                    System.out.println("Parità!");
                }
                break;

            case 3:
                break;

            default:
                System.out.println("scelta non valida");
                break;



        }




    }


    private static void Wait() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


        private static void ClrScr(){
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
