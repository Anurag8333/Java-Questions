//     1 
//    2 3 
//   4 5 6 
//  7 8 9 10 
// 11 12 13 14 15 

class p4{
    public static void main(String[] args) {
        int n =5;
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(num<=10){
                    System.out.print(" "+num+" ");
                }
                else{
                    System.out.print(num+" ");
                }
                num++;
            }
            System.out.println();
        }
    }
}