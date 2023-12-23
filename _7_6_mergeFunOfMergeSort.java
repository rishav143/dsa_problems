public class _7_6_mergeFunOfMergeSort {

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

        int i = 0, j = 0, k = 0;
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

    public static void main(String[] args) {

        int res[] = {10, 15, 20, 11, 12};
        int low = 0, mid = 2, high = 4;

        mergeSortArray(res, low, mid, high);

        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
