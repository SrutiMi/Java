import java.util.*;
public class palindrome {
    public static void palin(int num){
        int rev=0,temp=num;
        while(temp>0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(rev==num){
            System.out.print("This number is a palindrome") ;
        }else{
            System.out.print("Not a palindrome.");
        }
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=abc.nextInt();
        palin(num);
        abc.close();
    }
}
