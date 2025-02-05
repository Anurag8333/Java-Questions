
import java.util.Scanner;

//2025
// 20+25
// (45)^2
class techno{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = s.nextInt();
      if(istech(n)){
        System.out.println("Tech Number");
      } 
      else{
        System.out.println("Not Tech number");
      } 
    }

    public static int count(int n){
        int count=0;
        int num=n;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

    public static boolean istech(int n){
        int count =count(n);
        if(count%2==0){
            int num1=n/100;
            int num2=n%100;
            int sum = num1+num2;
            int product = 1;
            for(int i=1;i<=2;i++){
                product*=sum;
            }

        return product == n;
        }       
           return false;
    }
}