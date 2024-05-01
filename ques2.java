import java.net.SocketTimeoutException;
import java.rmi.StubNotFoundException;
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
   Scanner s= new Scanner (System .in);
   System.out.println("enter the first number :");
   int a=s.nextInt();
   System.out.println("enter the second number :");
   int b=s.nextInt();
   if(a>b){
    System.out.println("maximum number is"+a);
   }
   else if(a<b){
    System.out.println("maximum number is"+b);
   }
   else{
    System.out.println("both are equal");
   }

}
}

