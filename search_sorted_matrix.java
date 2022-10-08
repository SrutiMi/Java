public class search_sorted_matrix {
    public static boolean sorted(int key,int matrix[][]){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("The element is found at: ("+ row+","+col+")");
                return true;
            }else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String args[]){
        int spiral[][]={{1,4,7},
                        {8,7,44},
                        {3,22,445}   };
        sorted(22,spiral);
     }

}
