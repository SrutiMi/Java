import java.util.*;
public class buy_sell {
    public static int buySell(int prices[]){
        //we will buy the stocks only on that day when the stock price is the least ,it can be on any day and the profit will be calculated on the buying price
        int max=0;
        int buy=Integer.MAX_VALUE;//it is the variable to store the minimum price at which the stock should be bought
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit=prices[i]-buy;
                max=Math.max(max,profit);
            }else{
                buy=prices[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        abc.close();
        int prices[]={7,1,5,3,6,4};
        System.out.println(buySell(prices));
    }
}
