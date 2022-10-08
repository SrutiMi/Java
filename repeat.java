//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

public class repeat {
    public static boolean Return(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
       int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
       System.out.println(Return(nums));
    }
}
