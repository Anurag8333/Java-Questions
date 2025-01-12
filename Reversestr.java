class Reversestr{
    public static void main(String[] args) {
        String word = "Code with Anurag Singh";
        String reverse = "";

        for(int i=0; i<word.length();i++){
            reverse = word.charAt(i)+reverse;
        }

        System.out.println("Reverse String : "+reverse);
    }
}