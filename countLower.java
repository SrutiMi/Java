// Count how many times lowercase vowels occurred in a String entered by the user.
public class countLower { 
    public static void main(String args[]){
        String str="Hello My Name is Sruti";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i)) &&(str.charAt(i)=='A'||str.charAt(i)=='a'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='I'||str.charAt(i)=='i'||str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='U'||str.charAt(i)=='u')){
                count++;
            }
        }
        System.out.print(count);
    }
}
