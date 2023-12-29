// package dsa_problem_solution;

// public class allocateMinimumPages {

//     public static int sumOfN(int arr[], int a, int b){
//         int sum = 0; 
//         for(int i=a; i<=b; i++) {
//             sum+=arr[i];
//         }
//         return sum;
//     }

//     public static int minPages(int arr[], int n, int k) {
//         if(k == 1) {
//             return sumOfN(arr, 0, n-1);
//         }
//         if(n == 1) {
//             return arr[0];
//         }
//         int res = Integer.MAX_VALUE;
//         for(int i=1; i<n; i++) {
//             res = Math.min(res, Math.max(minPages(arr, i, k-1), sumOfN(arr, i, n-1)));
//         }
//         return res;
//     }

//     public static void main(String args[])  {
//         int arr[] = {10,5,30,1,2,5,10,10};
//         int k = 3;
//         int res = minPages(arr, arr.length, k);
//         System.out.print(res);
//     }
// }

//binary approach for solving the minimum of the maximum solution in nlog(sum) times

public class allocateMinimumPages {

    public static boolean isFeasable(int arr[], int n, int mid, int k) {
        int req = 1, sum = 0;
        for(int i = 0; i < n; i++){
            if(sum + arr[i] > mid) {
                req++;
                sum+=arr[i];
            } else {
                sum+=arr[i];
            }
        }
        return req<=k;
    }

    public static int minPages(int arr[], int n, int k) {

        //finding low as max from array and high is the sum of all the elements
        int sum = 0, max = 0;
        for(int i=0; i<n; i++) {
            sum+=arr[i];
            max = Math.max(max, arr[i]);
        }

        //finding result using binary appraoch
        int low = max, high = sum;
        int res = -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(isFeasable(arr, n, mid, k))  {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
    public static void main(String args[])  {
        int arr[] = {10,5,20};
        int k = 2;
        int res = minPages(arr, arr.length, k);
        System.out.print(res);
    }
}