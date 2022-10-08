import java.util.*;
public class income{
    public static void main(String args[]){
        double income ,tax=0;
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter the income : ");
        income =abc.nextDouble();
        if(income<500000){
            tax=0;
        }else if(income>500000 && income <=1000000){
            tax=0.2*income;
        }else{
            tax= 0.3*income;
        }
        System.out.println("The tax is: "+tax);
        abc.close();
    }
  
}