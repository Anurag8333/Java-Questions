public class Fibonacci {

    public static void fibonacci(int n,int a,int b){
        if(n<0) return;
        System.out.print(a+" ");
        int c = a+b;
         a= b;
         b = c;
        fibonacci(n-1,a,b);
    }

    public static void main(String[] args) {
        fibonacci(10,0,1);
    }
}
