public class pairs {
    public static void pairing(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+" , "+num[j]+")");
            }
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        pairing(numbers);
    }
}