import java.util.*;
public class decimal_binary {
    public static int dec_bin(int n){
        int temp=n,pow=0,bin=0;
        while(temp>0){
            bin+=temp%2*(int)Math.pow(10 , pow);
            pow++;
            temp/=2;
        }
        return bin;
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.print("Enter the decimal number:");
        int n=abc.nextInt();
        System.out.print("The decimal equivalent of "+n+" is "+(dec_bin(n)));
        abc.close();
    }
}
