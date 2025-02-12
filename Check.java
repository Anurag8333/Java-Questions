
import java.util.Scanner;

class Check {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any value on Keyboard : ");
        char a = s.next().charAt(0);
        int asci = (int) a;
        if (asci >= 65 && asci <= 90 || asci >= 97 && asci <= 122) {
            char c = (char) asci;
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                System.out.println("Vowels");
            } else {
                System.out.println("Consonents");
            }
        } else if (asci >= 48 && asci <= 57) {
            System.out.println("Numbers");
        } else {
            System.out.println("Special Character");
        }
        s.close();
    }
}
