class _7_11_naivePartition {

    public static void naivePartition(int[] arr, int low, int high, int pivot) {
        int temp[] = new int[high - low + 1];
        int k = 0;

        for(int i = low; i <= high; i++) {
            if(arr[i] <= pivot) {
                temp[k] = arr[i];
                k++;
            }
        }

        for(int i = low; i <= high; i++) {
            if(arr[i] > pivot) {
                temp[k] = arr[i];
                k++;
            }
        }

        for(int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 13, 6, 9, 12, 11, 8};

        naivePartition(arr, 0, 6, 8);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}