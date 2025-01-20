
import java.util.Scanner;

class Lucky{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Number :");
        int a = s.nextInt();
        boolean isDivisibleBy5 = a%5==0;

        switch (isDivisibleBy5?1:0) {
            case 1:
                System.out.println("Divisible by 5");
                break;

            case 0:
                System.out.println("Not divisible by 5");
                break;
                
            default:
                System.out.println("Enter valid Number");
        }
    }
}