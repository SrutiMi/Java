public class solution {
    public static int firstUniqChar(String s) {
        int value=-1;
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i+1;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                  count++;
                }
            }if(i==0){
                System.out.println(count);
            }
            if(count==0){
                value=i;
                break;
             }
        }
       return value;
    }
    public static void main(String args[]){
      //System.out.println(firstUniqChar("aabb"))  ;
    }
}