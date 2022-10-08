public class print_no_using_recursion {
    public static void main(String args[]){
       Incprint(5);
    }
    public static void Decprint(int no){
        if(no==1){
            System.out.print(no);
            return;
        }
        System.out.println(no+" ");   
        Decprint(no-1);
    }
    public static void Incprint(int no){
        if(no==1){
            System.out.print(no+" ");
            return;
        }
        Incprint(no-1);
        System.out.print(no+" ");
    }
}
