

public class ReverseStr {

    public static String rev(String s,int length){
        length--;
        String r ="";
        if(length<0){
            return "";
        }
        r=rev(s,length);
        r = s.charAt(length)+r;
        return r;
    }
   public static void main(String[] args) {
        String s = "hello my name is anurag";
     System.out.println(rev(s, s.length()));
   } 
}
