import java.util.Scanner;
public class lenth {
    public static void main(String[] args){
       String name="Jack Parker";
       name =name.toLowerCase();
        System.out.println(name);
        String text ="My Name is nikhil";
        text=text.replace(" ", "_");
        System.out.println(text);
        System.out.println("enter the number :24");
        Scanner sc=new Scanner (System.in);
        int a= sc.nextInt();
        if(a>18){
            System.out.println("you can drive");
        }
        else{
            System.out.println("not drive");
        }

    }

    
}
