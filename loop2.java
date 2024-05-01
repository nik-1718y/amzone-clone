import java.util.Scanner ;
public class loop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
         System.out.println("enter the number :");
        int c= sc.nextInt();
        int i=1;
        int fact =1;
        while(i<=c){
            fact *=i;
            System.out.println("factorial"+fact);
            i++;
        }
    }
    
}
