import java.util.*;;
public class kadane_algorithm {
    public static void kadane(int num[]){
        int ms=Integer.MIN_VALUE,cs=0;  
        for(int i=0;i<num.length;i++){
             cs+=num[i];
             if(cs<0){
                cs=0;
             }
             ms=cs>ms?cs:ms;
         }
         System.out.print("The max sub array sum is : "+ms);
    }
     public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
      kadane(numbers);
      abc.close();
    }
}
