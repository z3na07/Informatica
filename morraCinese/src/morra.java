import java.util.Scanner;
public class morra {
    public static void main(String[] args) {
        //dichiarazione variabili
        String scelta, scelta1;
        //creazione Scanner
        Scanner input= new Scanner(System.in);
        //Presa in input dei valori
        System.out.println("Inserire in base alla propria scelta: A per carta, S per sasso e D per forbici");
        scelta= input.next();
        //Pulizia console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //Richiesta secondo valore
        System.out.println("Inserire in base alla propria scelta: J per carta, K per sasso e L per forbici");
        scelta1=input.next();
         if(scelta.equals("A") && scelta1.equals("L")){
             System.out.println("Forbici Vince!!");

         }
        else if(scelta.equals("A") && scelta1.equals("K")){
            System.out.println("Carta Vince!!");

        }
         else if(scelta.equals("A") && scelta1.equals("J")){
             System.out.println("Pari!!");

         }
         else if(scelta.equals("S") && scelta1.equals("K")){
             System.out.println("Pari!!");

         }
         else if(scelta.equals("S") && scelta1.equals("L")){
             System.out.println("Sasso Vince!!");

         }
         else if(scelta.equals("S") && scelta1.equals("J")){
             System.out.println("Carta Vince!!");

         }
         else if(scelta.equals("D") && scelta1.equals("J")){
             System.out.println("Forbici Vince!!");

         }
         else if(scelta.equals("D") && scelta1.equals("K")){
             System.out.println("Sasso Vince!!");

         }
         else if(scelta.equals("D") && scelta1.equals("L")){
             System.out.println("Pari!!");

         }




    }

    }

