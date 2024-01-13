import java.lang.Math;
import java.util.Arrays;

public class _7_19_minimumDiffInArray {

    public static int findMinDiff(int[] arr) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int i = 1; i < arr.length; i++) {
            res = Math.min(res, Math.abs(arr[i] - arr[i - 1]));
        }

        return res;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 0};
        int res = findMinDiff(arr);
        System.out.print(res);
    }
}
//time complexity O(nlogn)
