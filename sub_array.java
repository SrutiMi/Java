import java.util.*;
public class sub_array {
    public static void subarray(int num[]){
         int ts=0,max_sum=Integer.MIN_VALUE,min_sum=Integer.MAX_VALUE,sum=0;
        for(int i=0;i<num.length;i++){//for getting the start point
           for(int j=i;j<num.length;j++){//for getting the end point
               for(int l=i;l<=j;l++){// to print the subarrays
                    System.out.print(num[l]+",");
                    sum+=num[l];
                    
               }
               ts++;
               System.out.println();
               System.out.println("Sum is :"+sum);
               if(sum<min_sum){
                min_sum=sum;
               }
               if(sum>max_sum){
                  max_sum=sum;
               }
               sum=0;
           }
        }
        System.out.println("The maximum sum is : "+max_sum);
        System.out.println("The minimum sum is : "+min_sum);
        System.out.println("The total number of subarray are :"+ts);
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        int numbers[]={1,-2,6,-1,3};
      subarray(numbers);
      abc.close();
    }
}

