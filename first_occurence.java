public class first_occurence {
    public static void main(String args[]){
        int arr[]={2,7,6,5};
       System.out.println(first(arr,0,5)) ;
    }
    public static int first(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr,i+1,key);
    }
}
