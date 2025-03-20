public class ReverseNum {
    
    public static int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        int remainder = n % 10;
        reversed = reversed * 10 + remainder;
        return reverseNumber(n / 10, reversed);
    }
    
    public static void main(String[] args) {
        int number = 123;
        int reversed = reverseNumber(number, 0);
        System.out.println("Reversed Number: " + reversed);
    }
}
