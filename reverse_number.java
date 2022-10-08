import java.util.*;
public class reverse_number {
   public static void main(String[] args) {
       Scanner abc =new Scanner(System.in);    
       System.out.print("Enter the number to be reversed:");
       int num =abc.nextInt();
       // First we have to find the length of the number 
       int len=0,temp=num,reverse=0;
       while(temp>0){
           len++;
           temp/=10;
       }
       //finding the reverse of the number 
       temp=num;
       while(temp>0){
            reverse+=(temp%10)*(int)(Math.pow(10, len-1));
            len--;
            temp/=10;
       }
       System.out.println("The reverse of the number "+num+" is "+reverse);
       abc.close();
    }
}
