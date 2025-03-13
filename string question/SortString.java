public class SortString {
    public static void main(String[] args) {
        String s ="My name is Anurag Singh";
        s= s.toLowerCase();
        char []c = s.toCharArray();
        
        for(int i=0; i<c.length;i++){
            for(int j=0; j<c.length-i-1;j++){
                if(c[j]>c[j+1]){
                    char temp =c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
        for(char i:c){
            System.out.print(i+" ");
        }
    }
}
