public class remove_duplicate_using_recursion {
    public static void duplicate(String str,int idx,StringBuilder newStr,boolean map[]){
        //Base condition 
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //work
        char curr=str.charAt(idx);
        if(map[curr-'a']==true){
            //character already present in the string
             duplicate(str, idx+1, newStr, map);
        }else{
            map[curr-'a']=true;
            duplicate(str, idx+1, newStr.append(curr), map);
        }
    }
    public static void main(String args[]){
        duplicate("apnnacollege", 0, new StringBuilder(""), new boolean[26]);
    }
}
