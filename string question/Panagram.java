public class Panagram {
    public static void main(String[] args) {
        String s= "Abcdefghijklmnopqrstuvwxyz";
        s = s.toLowerCase();
        int count[] = new int[123]; 
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        boolean res = false;
        for(int i=97; i<=122; i++){
            if(count[i]>0){
                res = true;
            }
            else{
                res=false;
                break;
            }
        }
        if(res == true){
            System.out.println("Panagram");
        }
        else{
            System.out.println("Not Panagram");
        }
    }
}
