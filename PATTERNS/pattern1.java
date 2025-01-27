   /*
    a a a a a 
    b b b b 
    c c c 
    d d 
    e 
   */
   
   class p1{
      public static void main(String[] args){
         int num = 97; int n=5;
         for(int i=n;i>=1;i--){
            char c= (char)num;
            for(int j=1;j<=i;j++){
               System.out.print(c+" ");
            }
            System.out.println();
            num++;
         }
      }
   }