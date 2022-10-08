import java.util.*;
public class smallest {
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        int numbers[]={13,56,44,0,33};
        small(numbers);
        abc.close();
    }
    public static void small(int numb[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<numb.length;i++){
            if(small>numb[i]){
                small=numb[i];
            }
        }
        System.out.print("The smallest number is "+small);
    }
}
