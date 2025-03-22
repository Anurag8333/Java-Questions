public class ReverseNum {
    
    public  static int reverseNumber(int n , int reverse){
        if(n == 0) return reverse;
        int remainder = n %10; 
        reverse = reverse * 10 + remainder;   
        return reverseNumber(n/10, reverse);
    }
  
    public static void main(String[] args) {
        int number = 123456;
        int reversed = reverseNumber(number, 0);
        System.out.println("Reversed Number: " + reversed);
    }
}
