public class mergeSort {
    public static void MergeSort(int arr[],int si,int ei){
        int mid=si+(ei-si)/2;//to find the mid of the array 
        //base condition
        if(si>=ei){
            return;
        }
        MergeSort(arr, si, mid);//dividing the left part
        MergeSort(arr, mid+1, ei);//for the right part
        merge(arr,si,mid,ei);

    }
    // public static void merge(String arr[],int si,int mid,int ei ){
    //     String temp[]=new String[ei-si+1];
    //     int i=si;
    //     int j=mid+1;
    //     int k=0;
    //     while(i<=mid && j<=ei){
    //         if(arr[i].compareTo(arr[j])<0){
    //             temp[k]=arr[i];
    //             i++;
    //             }else{
    //                 temp[k]=arr[j];
    //                 j++;
    //             }
    //             k++;
    //     }
    // }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;//fortemp array
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for leftover elements of the left array
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for leftover elements of the seconf array
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copying temp to the original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
       int arr[]={ 88,22,1,2,33,211};
       MergeSort(arr, 0, arr.length-1);
       printArray(arr);
    }
}
