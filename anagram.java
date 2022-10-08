import java.util.Arrays;
public class anagram {
    public static void main(String args[]){
        String str1="Racer";
        String str2="Care";
        //converting them into lower case so that we don't have to check for the case 
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
             char str1Array[]=str1.toCharArray();
             char str2Array[]=str2.toCharArray();
             Arrays.sort(str1Array);
             Arrays.sort(str2Array);
             if(Arrays.equals(str1Array,str2Array)){
                System.out.print("Anagrams");
             }else{
                System.out.println("Not an anagram");
             }
        }else{
            System.out.println("Not an anagram");
        }

    }
}
