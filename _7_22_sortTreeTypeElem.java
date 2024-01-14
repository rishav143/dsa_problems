public class _7_22_sortTreeTypeElem {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortThreeElem(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if(arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, high, mid);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 1, 1, 2};

        sortThreeElem(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
//time complexity O(n)
