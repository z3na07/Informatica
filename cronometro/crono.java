import java.util.Scanner;
public class crono {
    public static void main(String[] args) {
        String S,P; //s=start,p=stop
        int contatoreCent, sec, min;
        Scanner input=new Scanner(System.in);
        contatoreCent=0;
        sec=0;
        min=0;
        System.out.println("Cronometro digitale  inserire S per farlo partire");
        S=input.nextLine();
        if(S.equals("S")){
            while(S.equals("S")){
                Wait();
                contatoreCent++;
                if(contatoreCent==100){
                    sec++;
                    contatoreCent=0;
                    if (sec==60){
                        min++;
                        sec=0;
                    }
                }

            }
        }
        else{
            System.out.println("Carattere inserito errato");

        }


    }
    private static void Wait(){
        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
