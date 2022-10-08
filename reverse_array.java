public class reverse_array {
    public static void main(String args[]){
        int numbers[]={13,56,44,33,78,56,48};
        print(numbers);
        reverse(numbers);
        System.out.println();
        print(numbers);
    }
    public static void print(int num[]){
        for(int i=0;i<num.length;i++){
           System.out.print(num[i]+",");
        }
 }
    public static void reverse(int num[]){
        int start=0,end=num.length-1;
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
}
