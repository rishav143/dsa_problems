public class _7_7_mergeSort {

    public static void mergeSortArray(int[] res, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        
        for(int i = 0; i < n1; i++) {
            arr1[i] = res[low + i];
        }

        for(int j = 0; j < n2; j++) {
            arr2[j] = res[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;
        while(i < arr1.length && j < arr2.length) {
            
            if(arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }

            k++;
        }

        while(i < arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if(high > low) {
            int mid = low + (high - low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            mergeSortArray(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int arr[] ={1,3,5,3,2,8,9,0,1};
        
        mergeSort(arr, 0, arr.length - 1);
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
