class Strg{
    public static int fact(int n){
        int fact = 1;
        for (int i = 0; i < n; i++) {
            fact = fact *(n-i);
        }
        return fact;
    }
    public static void isStrong(int n){
        int sum=0;
        int num =n;
       while(num>0){
        int v = num%10;
        sum+=fact(v);
        num/=10;
       } 
       if(sum==n){
        System.out.println("Strong Number");
       }
       else{
        System.out.println("Not strong");
       }

    }
    public static void main(String[] args) {
        isStrong(100);
    }
}