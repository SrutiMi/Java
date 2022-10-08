public class shortest_path {
    public static float path(String path1){
            int x=0,y=0;
            for(int i=0;i<path1.length();i++){
                if(path1.charAt(i)=='S'){
                    y--;
                 }
                 if(path1.charAt(i)=='N'){
                    y++;
                 }
                 if(path1.charAt(i)=='W'){
                    x--;
                 }
                 if(path1.charAt(i)=='E'){
                    x++;
                 }
            }
            return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String args[]){
        String path1="WNEENESENNN";
        System.out.print(path(path1));
    }
}
