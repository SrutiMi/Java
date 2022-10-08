public class spiral {
    public static void matrix(int matrix[][]){
        int startRow=0,startCol=0,endRow=matrix.length-1,endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
             }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" "); 
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                    }
                System.out.print(matrix[endRow][j]+" ");
                }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String args[]){
        int spiral[][]={{1,4,7},
                        {8,7,44},
                        {3,22,445}   };
        matrix(spiral);
     }


}
