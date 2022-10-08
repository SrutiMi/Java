public class friends_pairing {
    public static int friendPairing(int n){//n is the number of friends 
        //base condition
        if(n==1||n==2){
            return n;
        }
        return friendPairing(n-1)+(n-1)*friendPairing(n-2);
    }
    public static void main(String args[]){
        System.out.println(friendPairing(3));
    }
}
