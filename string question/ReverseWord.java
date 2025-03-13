
public class ReverseWord {
    public static void main(String[] args) {
        //hello world 
        //olleh dlrow
        String s ="Hello World Anurag";
        String word = "";
        String rev ="";
        for (int i = 0; i < s.length(); i++) {
         if(s.charAt(i)!=' '){
            word =s.charAt(i)+ word;
         }
         else{
            rev=rev+word+" ";
            word="";
         }
        }
        rev=rev + word;
        
        System.out.println(rev);
    }
}
