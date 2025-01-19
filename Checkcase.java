
import java.util.Scanner;

class Checkcase{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Word");
        char c = s.next().charAt(0);
        int asci = (int) c;
        String Convert;

        if(asci >= 97 && asci<=122){
            System.out.println("Lowercase");
            System.out.println("If you want to Convert  uppercase , Press U :");
           // s.next();
            Convert = s.next();
             if( Convert.equals("u") || Convert.equals("U")){
            asci -= 32;
            c = (char)asci;
            System.out.println(c);
        }
        }
        else if(asci>=65 && asci <= 90){
            System.out.println("Uppercase");
              System.out.println("If you want to Convert  lowercase , Press L :");
               Convert = s.next();
               if( Convert.equals("l") || Convert.equals("L")){
            asci += 32;
            c = (char)asci;
            System.out.println(c);
        }}
        
        else{
            System.out.println("Enter valid character");
        }

       
    }
}