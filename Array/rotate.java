public class rotate {

    public static void reverse(int []a,int st,int end){
            while(st<end){
             int temp =a[st];
             a[st]=a[end];
             a[end]=temp;
             st++;
             end--;
            }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        
        int k = 3; // number of rotation
        int n = arr.length-1; // array size
        k = k % n;
        if(k<0){
            k = k+n; 
        } 

        reverse(arr, 0, n);
        reverse(arr, 0, k-1);
        reverse(arr, k, n);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
