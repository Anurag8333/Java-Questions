public class MergeSort {

    public static void merge(int []a,int low,int mid,int high){
        int [] mergedArr = new int[high-low+1];
        int ind1 = low;
        int ind2 = mid+1;
        int x =0;
        while(ind1<=mid && ind2<=high) { 
            if(a[ind1]<= a[ind2]){
                mergedArr[x++] = a[ind1++];
            }
            else{
                mergedArr[x++] = a[ind2++];
            }

        }
        while(ind1<=mid){
            mergedArr[x++] = a[ind1++];
        }
        while(ind2<=high){
            mergedArr[x++]= a[ind2++];
        }

        for(int i=0,j=low; i<mergedArr.length; i++,j++){
            a[j] = mergedArr[i];
        }
    }

    public static void mergeSort(int [] a,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(a, low, mid);
        mergeSort(a, mid+1, high);
        merge(a,low,mid,high);
    }   

    public static void main(String[] args) {
        int [] a ={1,5,4,3,2,9,9,7,6};
        int n =a.length-1; 
        mergeSort(a, 0, n);

        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
