public class _7_14_quicksortLomutoPartition {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j <= high; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i+1;
    }

    public static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int p = lomutoPartition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 32, 20, 25, 22, 50};

        quickSort(arr, 0, 5);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
//time complexity for quick sort is O(nlogn)
//worst case complexity is O(n^2)