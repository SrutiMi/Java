// There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed 
// to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array 
//  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] 
// might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   
// if it is not in nums.You must write an algorithm with O(log n) runtime complexity
public class check_target {
      public static int search(int nums[],int target){
        int start=0,end=nums.length-1;
        int pos=0,i=0;
        while( (i+1)<nums.length && nums[i]<nums[i+1] ){
             pos=i;
             i++;
        }
        if(target<nums[pos]){
            start=pos+1;
             }else if(target==nums[pos]){
                return pos;
             }else{
                end=pos-1;
             }
        //doing binary search
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                 start=mid+1;
            }
        }
        return -1;

      }
    public static void main(String args[]){
        int nums[] = {4,  5, 6, 7, 0, 1, 2}, target = 3;
        System.out.println(search(nums, target));
    }
}
