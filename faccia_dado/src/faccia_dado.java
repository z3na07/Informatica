import java.util.Scanner;
import java.util.Random;
public class faccia_dado {
    public static void main(String[] args) {
    int valoreFaccia;
    Scanner input = new Scanner(System.in);
    }
    private static void facceDado(int valorefaccia){

    }
    private static void Wait(){
        try{
            Thread.sleep(300);
        } catch(InterruptedException e) {
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
