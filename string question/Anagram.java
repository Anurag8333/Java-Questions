public class Anagram {
    
    public static void sort(char []a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                 char temp =a[j];
                 a[j]= a[j+1];
                 a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
            String s1 = "silent";
            String s2 = "listen";
        // check the string is anagram or not ?
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();

            char [] s= s1.toCharArray();
            char [] b= s2.toCharArray();
            sort(s);
            sort(b);

            String s3 =new String(s);
            String s4 =new String(b);

            if(s3.equals(s4)){
                System.out.println("Anagram String");
            }
            else{
                System.out.println("Not Anagram String");
            }

            
    }
}
