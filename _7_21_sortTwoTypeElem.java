public class _7_21_sortTwoTypeElem {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortTwo(int[] arr, int low, int high) {
        int i = low - 1, j = high + 1;

        while(true) {
            do {
                i++;
            } while(arr[i] < 0);

            do {
                j--;
            } while(arr[j] > 0);

            if(i >= j) {
                return;
            }

            swap(arr, i, j);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -2, 7, 9, -9};
        
        sortTwo(arr, 0, 6);
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }   
}
