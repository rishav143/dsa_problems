public class _7_27_radixSort {

    public static void radixSort(int[] arr) {
        //finding max
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        //calling number of digit time counting sort
        for(int exp = 1; max/exp > 0; exp = exp*10) {
            countingSort(arr, exp);
        }
    }

    public static void countingSort(int[] arr, int exp) {
        int count[] = new int[10];
        for(int i = 0; i < arr.length; i++) {
            count[(arr[i]/exp)%10]++;
        }
        for(int i = 1; i < 10; i++) {
            count[i] = count[i - 1] + count[i];
        }

        //taking additional output array for copying
        int output[] = new int[arr.length]; 
        for(int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i]/exp)%10] - 1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {319, 100, 50, 60, 200};
        radixSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
