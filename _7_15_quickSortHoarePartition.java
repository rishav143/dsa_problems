public class _7_15_quickSortHoarePartition {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int hoarePartition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;

        while(true) {
            do {
                i++;
            } while(arr[i] < pivot);

            do {
                j--;
            } while(arr[j] > pivot);

            if(i >= j) {
                return j;
            }

            swap(arr, i, j);
        }
    }

    public static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int p = hoarePartition(arr, low, high);
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
//lomuto and hoare partition are not stable algorithms
//best case for quick sort is T(n) = 2T(n/2) + theta(n) 
//worst case is T(n) = T(n - 1) + theta(n)
//if division is 100 - 900  right side is the deepest and our work reduce on the down side n*log(10/9)
//on an average it is nlog(n)