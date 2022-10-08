import java.util.*;
public class pass_fail {
    public static void main(String args[]){
    Scanner abc= new Scanner(System.in);
    int marks ;
    System.out.println("Enter the marks :");
    marks=abc.nextInt();
    String result=(marks>=33)?"Pass":"Fail";
    System.out.println(result);
    abc.close();
   }
}
