import java.util.*;
public class inverted_rotated_pyramid {
    public static void pyramid(int row){
        for(int i=1;i<=row;i++){
            
                for(int sp=1;sp<=row-i;sp++){
                    System.out.print(" ");
                }
                for(int star=1;star<=i;star++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.print("enter the no of rows:");
        int n=abc.nextInt();
        pyramid(n);
        abc.close();
    }
}
