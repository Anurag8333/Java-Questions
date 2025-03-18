
public class InsertionSort {
    public static void main(String[] args) {
       int arr[] = {10,7,5,4,8,1};
      //insertion sort
      
      for (int i = 1; i < arr.length; i++) {
          int temp = arr[i];
          int j = i;
          while(j>0 && temp<arr[j-1]){
            arr[j]=arr[j-1];
            j--;
          }
          arr[j]=temp;
      }
      for (int i : arr) {
        System.out.print(i+" ");
      }
    }
}
