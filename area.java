import java.util.*;
public class area {
    public static void main(String args[]){
    Scanner abc=new Scanner(System.in);
    float radius= abc.nextFloat();
    float area= 3.14f*radius*radius;//here we have written f with 3.14 because we have declared all the variables as float, comp considers all decimal number as double unless specified
    System.out.println(area);
    abc.close();
   }
}
