public class count_7_array {
    public static void count(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==7){
                count++;
            }
          }
        }
        System.out.print("The nimber of times 7 occurred is:"+count);
    }
    public static void main(String args[]){
        int spiral[][]={{1,4,7},
                        {8,7,44},
                        {3,7,445}   };
        count(spiral);
     }

}
