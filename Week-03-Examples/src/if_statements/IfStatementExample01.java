package if_statements;

public class IfStatementExample01 {
    public static void main(String[] args) {

            int a = 10;
            int b = 20;
            int c = 30;

            /* if(a==b){
                System.out.println("A ve B sayıları birbirine eşittir. ");
            }else {
                System.out.println("A ve B sayıları birbirine eşit değil.");
            }
            */

          /*
        if(b==c) {
              System.out.println("B ve C eşittir.");
          }
          else if(a > c)
          {
              System.out.println("A büyüktür C'den.");
          }
          else {
              System.out.println("B ve C eşit değildir.");
          }
        */

        if((a<c) && (a<b)) {

            System.out.println("B en küçük sayıdır.");

        }else if((c<a) && (c<b)) {

            System.out.println("C en küçük sayıdır.");

        }else {

            System.out.println("B en küçük sayıdır.");

        }

    }
}
