public class inheritence {
    public static void main(String args[]){
        fish shark=new fish();
        shark.color="BLUE";
        System.out.println(shark.color);
        shark.eats();
    }
   
    
    
    
}
class animal{
     String color;
     void eats(){
        System.out.println("It eats.");
     }
        void breathes(){
            System.out.println("Breathes");
        }
        void colour(String col){
            color=col;
        }
    
}
class fish extends animal{
        void swin(){
            System.out.println("It swims");
        }
        void fins(){
            System.out.println("It has fins");
        }
}
