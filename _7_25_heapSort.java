/**
 * _7_25_headSort
 */
public class _7_25_heapSort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void maxHeapify(int[] arr, int i) {
        int largest = i, left = 2*i+1, right = 2*i+2;

        if(left < arr.length && arr[left] < arr[largest]) largest = left;
        if(right < arr.length && arr[right] < arr[largest]) largest = right;

        if(largest != i) {
            swap(arr, i, largest);
            maxHeapify(arr, largest);
        }
    }

    public static void buildHeap(int[] arr) {
        for(int i = (arr.length-2)/2; i>=0; i--) {
            maxHeapify(arr, i);
        }
    }

    public static void heapSort(int[] arr) {
        buildHeap(arr);
        for(int i = arr.length - 1; i >= 1; i--) {
            swap(arr, i, 0);
            maxHeapify(arr, 0);
        }
    }

    public static void main(String[] args) {
        int arr[] = {50, 10, 20, 30, 40};
        
        heapSort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//time complexity is O(nlogn)
