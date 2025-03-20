
class Prime {

    public static boolean isPrime(int n, int i) {
        // Base cases
        if (n <= 2) {
            return n == 2; // 2 is prime, numbers less than 2 are not
        }
        if (n % i == 0) {
            return false; // If divisible by i, not prime
        }
        if (i * i > n) {
            return true; // If no divisors found till sqrt(n), it's prime
        }
        // Recursive case
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int number = 29; // Example number
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}