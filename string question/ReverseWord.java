
public class ReverseWord {
    public static void main(String[] args) {
        //hello world 
        //olleh dlrow
        String s ="Hello World Anurag";
        String b = "";
        for (int i = 0; i < s.length(); i++) {
         if(s.charAt(i)!=' '){
            b =b+s.charAt(i);
         }
         else{
            for (int j = b.length()-1; j>=0; j--) {
                    System.out.print(b.charAt(j));               
            }
            System.out.print(" ");
            b="";
         }
        }
        for (int j = b.length()-1; j>=0; j--) {
            System.out.print(b.charAt(j));               
    } 
    }
}
