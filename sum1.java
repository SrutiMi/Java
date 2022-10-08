import java .util.*;
public class sum1{
    public static void main(String args[]){
        int i=0,sum=0;
        Scanner abc= new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n= abc.nextInt();
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("The sum of the first "+n+" natural numbers is "+sum);
        abc.close();
    }
}