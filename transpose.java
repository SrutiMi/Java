public class transpose {
    public static void transp(int arr[][],int B[][]){
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                B[j][i]=arr[i][j];
            }
        }
    }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int spiral[][]={{1,4,7},
                        {8,7,44},
                           };
        int B[][]=new int[spiral[0].length][spiral.length];
        transp(spiral,B);
        print(B);
     }
}
