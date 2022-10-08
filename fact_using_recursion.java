public class fact_using_recursion {
    public static void main(String args[]){
    System.out.print( factorial(6));
    }
    public static int factorial(int no){
         if(no==0){
            return 1;
         }
         return no*factorial(no-1);
    }
}
