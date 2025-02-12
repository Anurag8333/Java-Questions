public class Merg {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {7,8,9,10};
        int size = arr1.length+arr2.length;
        int arr3[] = new int[size];
        int num = 0;
        for(int i=0; i<(size);i++){
           if(i<arr1.length){
            arr3[i] = arr1[i];
           }else{
            arr3[i] = arr2[num];
            num++;
           }
        }
        for (int a : arr3) {
            System.out.print(a+" ");
        }
    
    }
}
