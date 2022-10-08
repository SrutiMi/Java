import java.util.*;
public class prefix_array {
    public static void Prefix(int num[]){
        
        //forming the prefix array
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        //finding out the max subarray sum
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int start=i,end=j;
                sum=i==0?prefix[end]:prefix[end]-prefix[start-1];
            }
            if(sum>max){
                 max=sum;
            }
        }
        System.out.println("The maximum sum is :"+max);
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        int numbers[]={1,-2,6,-1,3};
      Prefix(numbers);
      abc.close();
    }
}

