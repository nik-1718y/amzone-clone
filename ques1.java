import java.util.Scanner;

import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        char operator;
        Double number1,number2,result;
        System.out.println("choose an operator:+,-,*,/");
        operator=s.next().charAt(0);
        System.out.println("enter first number :");
        number1=s.nextDouble();
        System.out.println("enter the second :");
        number2=s.nextDouble();
        switch(operator){
            case'+':
            result=number1+number2;
            System.out.println(number1 +"+"+ number2 +"="+ result);
            break;
             case'-':
            result=number1-number2;
            System.out.println(number1 +"-"+ number2 +"="+ result);
              break;
             case'*':
            result=number1*number2;
            System.out.println(number1 +"*"+ number2 +"="+ result);
              break;
             case'/':
            result=number1/number2;
            System.out.println(number1 +"/"+ number2 +"="+ result);
              break;
            default:
            System.out.println("invlid");

        }
        s.close();
    }}
       
    

