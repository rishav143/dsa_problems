public class _7_13_hoarePartition {

    public static void swap(int[] arr, int i, int j) {
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

    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 1, 3, 6};

        int idx = hoarePartition(arr, 0, 5);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print(idx);
    }
}
