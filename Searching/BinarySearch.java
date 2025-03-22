public class BinarySearch {
    
    public static int search(int []a,int n){
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid] == n){
                return mid;
            }
            else if(a[mid]>n){
                end = mid-1;
            }
            else if(a[mid]<n){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int b[] = {1,2,6,7,9,10};
        System.out.println(search(b,10));     
    }
}
