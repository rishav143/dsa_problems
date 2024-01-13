public class _7_18_kthSmallElement {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = high;
        int i = low - 1, j = low;

        while(j <= high) {
            if(arr[j] < arr[pivot]) {
                i++;
                swap(arr, i, j);
            }

            j++;
        }
        
        swap(arr, i+1, pivot);
        return i+1;
    }

    public static int kSmallest(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        
        while(low < high) {
            int p = partition(arr, low, high);

            if(p == k - 1) {
                return arr[p];
            }else if(k < p) {
                high = p - 1;
            }else {
                low = p + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 32, 20, 25, 22, 50};

        int element = kSmallest(arr, 3);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print(element);
    }
}
