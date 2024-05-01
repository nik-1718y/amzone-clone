import java.util.Scanner;
public class class3 {
    public static void main(String[] args) {
        Scanner car=new Scanner (System .in);
        int num;
        int fact=1;
        System.out.println("enter the positive interger :");
        num =car.nextInt();
     //   System.out.println("multipication table of "+num);
       for(int i=1;i<=num;i++){
        fact*=i;
         // System.out.println(num+"*"+i+"="+(num*i));

       }
       System.out.println("Factorial :"+fact);
    }
    
}
