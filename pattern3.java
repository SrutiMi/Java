import java.util.*;
public class pattern3 {
    public static void main(String args[]){
    Scanner abc= new Scanner(System.in);
    System.out.print("Eneter the value of n : ");
    int n= abc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    abc.close();
    }
}
