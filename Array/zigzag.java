
public class zigzag {
    public static void main(String[] args) {
        
        int arr1[] ={1,2,3,4,5};
        int arr2[] ={6,7,8,9,10};
        int arr3[] = new int[arr1.length+arr2.length];
        // how to merge two array in zigzag manner
        int num =0;
        for (int i = 0; i < arr1.length; i++) {
          if(i<arr1.length){
            arr3[num] = arr1[i];
            num++;
          }
          if(i<arr2.length){
            arr3[num] = arr2[i];  
            num++; 
          }
        }

        for (int i = 0; i < (arr1.length+arr2.length); i++) {
            System.out.print(arr3[i]+" ");
        }
       
    }
}
