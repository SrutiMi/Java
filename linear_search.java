import java.util.*;
public class linear_search {
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        int numbers[]={13,56,44,33};
        int pos=linear(numbers,33);
        print(numbers);
        System.out.print("\nThe elment is found at "+(pos+1));
        abc.close();
    }
    public static int linear(int num[],int x){
             for(int i=0;i<num.length;i++){
                if(num[i]==x){
                    return i;
                }
             }
             return -1;
    }
    public static void print(int num[]){
           for(int i=0;i<num.length;i++){
              System.out.print(num[i]+",");
           }
    }
}
