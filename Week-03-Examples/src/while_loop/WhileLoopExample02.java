package while_loop;

import java.util.Random;
import java.util.Scanner;

public class WhileLoopExample02 {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
       // int mindNumber = 5;
        int usersMindNumber;
        int sayac =0;
        System.out.println("aklımda tuttuğum sayıyı bulabilir misin?");

        Random rastgele = new Random();
        int rastgeleSayi = rastgele.nextInt(6)+1;
        //System.out.println(rastgeleSayi);



        while(true) {
            System.out.println("haydi 1 tahmin!!!!!!!!");
            usersMindNumber = scanner.nextInt();
            sayac++;
            if(rastgeleSayi == usersMindNumber) {
                break;
            }

        }

        System.out.println("eveet akklımdaki sayı : " + rastgeleSayi + " dı !! :)");
        System.out.println(sayac + ".denemede buldun");





    }
}
