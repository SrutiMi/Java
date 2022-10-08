public class selection_sort {
    public static void selection(int num[]){
        int min=0,min_pos=0;
        for(int i=0;i<num.length-1;i++){
             min=num[i];
             min_pos=i;
             for(int j=i+1;j<num.length;j++){
                 if(num[j]<min){
                    min=num[j];
                    min_pos=j;
                 }
             }
            int temp=num[i];
            num[i]=min;
            num[min_pos]=temp;
        }
    }    
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String args[]){
        int num[]={5,4,1,3,2};
        selection(num);
        print(num);
    }
}
