public class _7_26_countSort {

    public static void countSort(int[] arr, int k) {
        int count[] = new int[k];
        //{1, 3, 0, 0, 2, 0, 0}
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //finding cumulative sum
        for(int i = 1; i < k; i++) {
            count[i] = count[i - 1] + count[i];
        }
        //{1, 4, 4, 4, 6, 6, 6}
        int output[] = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 1, 0, 1};
        countSort(arr, 7);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//time complexity O(n+k)
//it is stable algorithm
//space complexity is (n+k)
