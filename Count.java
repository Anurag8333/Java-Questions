class Count{
    public static void main(String[] args) {
      String words = "Hello  My Name is Anurag Singh";
      int number = words.split("\\s+").length;
      System.out.println(number);  
    } 
}