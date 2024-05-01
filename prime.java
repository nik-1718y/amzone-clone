import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sh =new Scanner(System.in);
        int a = sh.nextInt();
        int c=0;
        for(int i=2; i<a; i++){
            if(a %i==0){
              //  System.out.println(a+"not prime");
        c++;
            }
           // else{
             //   System.out.println(a+"prime");
            }
      //  }
        if(c==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

    }
    
}
