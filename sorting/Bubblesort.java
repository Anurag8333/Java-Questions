public class Bubblesort {

    public static void sort(int []a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        } 
    }
    public static void main(String[] args) {
        int a[] ={7,5,9,8,7,5,4,2,1};
        sort(a);
        for (int i : a) {
            System.out.print(i+" "); 
        }
    }
}
