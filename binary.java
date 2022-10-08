public class binary{
    public static int binarySearch(int a[],int num){
        int start=0,end=a.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==num){
                return mid;
            }else if(a[mid]<num){
                start=mid+1;
               }else{
                   end=mid-1;
               }
        }
        return -1;
    }
    public static void main(String args[]){
        int a[]={12,34,45,66,89};
        System.out.print((binarySearch(a, 4)));

    }
}
