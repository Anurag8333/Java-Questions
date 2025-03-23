public class Selection {

    public static void sort(int a []){
        for(int i=0; i<a.length; i++){
            int min = i;
            for (int j = i+1; j < a.length; j++) {
               if(a[min]>a[j]){
                min = j;
               } 
            }
            int temp = a[i];
            a[i] = a[min];
            a[min]= temp;
        }
    }

    public static void main(String[] args) {
        int a[] = {8,1,9,10,5,6,7};
        sort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
