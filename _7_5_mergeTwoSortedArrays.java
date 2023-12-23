public class _7_5_mergeTwoSortedArrays {

    public static void mergeSortArray(int[] arr1, int[] arr2, int totalSize, int[] res) {

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
        int arr1[] = {10,20,30,40,50};
        int arr2[] = {5,15,20,25,30,45};

        int totalSize = arr1.length + arr2.length;
        int res[] = new int[totalSize];

        mergeSortArray(arr1, arr2, totalSize, res);

        for(int i = 0; i < totalSize; i++) {
            System.out.print(res[i] + " ");
        }
        // time complexity is O(m + n)
        // Aux space is O(n)
        //-----------------------------
    }
}
