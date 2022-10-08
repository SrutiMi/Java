import java.util.*;
public class trapped_water {
    public static int trapped(int height[]){
        //To calculate left max boundary
        int n=height.length;
        int leftMax[]=new int [n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //To calculate right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0;i<n;i++){
            //water level=min(leftmax bound,rightmax bound)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

            //trapped water=water level-height[i]
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        int height[]={4,2,0,6,3,2,5};
      System.out.println(trapped(height));
      abc.close();
    }
}
