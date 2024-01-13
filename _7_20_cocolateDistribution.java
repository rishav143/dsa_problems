import java.util.Arrays;

public class _7_20_cocolateDistribution {

    public static int findMinDiff(int[] arr, int k) {
        if(k > arr.length) {
            return -1;
        }

        Arrays.sort(arr);
        
        int res = arr[k - 1] - arr[0];
        for(int i = 1; (i+k-1) < arr.length; i++) {
            res = Math.min(res, arr[i+k-1] - arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,6,7,8,0,4,3,7,4,9,5};
        int res = findMinDiff(arr, 3);
        System.out.print(res);
    }
}
//time complexity O(nlogn)