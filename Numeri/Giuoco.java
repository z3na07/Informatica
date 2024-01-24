import java.util.Scanner;
import java.util.Random;
public class Giuoco {
    public static void main(String[] args) {
        int scelta=0;
        String fine= new String();
        do{
            Menu();
            if(scelta==3){
                break;
            }
            Gioco(scelta);
            Menu();
            ClrScr();
        }while(scelta=1||scelta=2);



    }

    private static int Menu(){
        Scanner input= new Scanner(System.in);
        int scelta=2;
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
        if(scelta==1){

            Giocata= random.nextInt(0,6);
            System.out.println("Il giocatore 1 ha estratto: "+Giocata);
            Giocata1= random.nextInt(0,6);
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

        }
        else if(scelta==2){
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
