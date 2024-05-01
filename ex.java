import java.util.Scanner;
public class ex {
    public static void main (String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("enter the name");
        String str =a.nextLine();
        System.out.println("enter the marks");
        int f= a.nextInt();
        int b= a.nextInt();
        int c= a.nextInt();
        int d= a.nextInt();
        int e= a.nextInt();
        int sum=f+b+c+d+e;
        System.out.println(sum);
        float per=sum*100/500;
        System.out.println("percantage is");
        System.out.println(per);
    }
    
}
