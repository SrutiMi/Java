import java.util.*;
public class calculator {
    public static void main(String args[]){
        int a,b;
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter the first number :");
        a=abc.nextInt();
        System.out.println("Enter the second number :");
        b=abc.nextInt();
        System.out.println("Enter the operator: ");
        char ch =abc.next().charAt(0);
        switch(ch){
            case '+':
                 System.out.println(a+b);
                 break;
            case '-':
                 System.out.println(a-b);
                 break;
            case '/':
                 System.out.println(a/b);
                 break;
            case '*':
                 System.out.println(a*b);
                 break;
            case '%':
                 System.out.println(a%b);
                 break;
            default:
                System.out.println("Wrong operator!");     
            
        }
        abc.close();
    }
}
