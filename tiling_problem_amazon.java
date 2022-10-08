public class tiling_problem_amazon {
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fmn1=tiling(n-1);
        //horizontal choice
        int fmn2=tiling(n-2);
        return fmn1+fmn2;
    }
    public static void main(String args[]){
        System.out.println(tiling(4));
    }
}
