//this algorithm is stable.

public class _7_4_insertionSort {
    public static void main(String[] args) {
        
        int arr[] = {1,4,6,3,8,9,0,1};
        for(int i = 1; i < arr.length; i++) {
            
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
//time complexity O(n^2) in worst case - O(n) in best case when array is already sorted
//space complexity O(1)
