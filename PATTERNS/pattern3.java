class p3{
    public static void main(String[] args) {
        int n =5;
        
        for(int i=1;i<=n;i++){
            int num = 65;    
            for(int k=n-i; k>=1;k--){
                System.out.print(" ");
            }
            if(i%2==0){
                for(int j=1;j<=i;j++){
                    char c = (char)num;
                    System.out.print(c+" ");
                    num++;
                }
            }
            else {
                    for(int j=i; j>=1;j--){
                        num+=j-1;
                        char d = (char)num;
                        System.out.print(d+" ");
                        num-=j-1;
                    }
                }
           
           System.out.println();
        }
    }
}