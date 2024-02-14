import java.util.ArrayList;
import java.util.Collections;

class _7_28_bucketSort {

    public static void bucketSort(int[] arr, int k) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        max++;
        
        //creating the k number of bucket
        ArrayList<ArrayList<Integer>> bkt = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            bkt.add(new ArrayList<>());
        }
        
        //putting element in the bucket
        for(int i = 0; i < arr.length; i++) {
            bkt.get((k*arr[i])/max).add(arr[i]);
        }

        //sort the k bucket
        for(int i = 0; i < k; i++) {
            Collections.sort(bkt.get(i));
        }

        int index = 0;
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < bkt.get(i).size(); j++) {
                arr[index++] = bkt.get(i).get(j);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 40, 20, 24, 11, 2, 1};
        bucketSort(arr, 4);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//time complexity in best case is O(n) - bucket is equal to number of element in the array
//if we use insertion sort in worst case - O(nlogn)
//on an average is O(nlogn)
//space complexity is 