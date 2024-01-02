public class _7_10_countInversionInArray {

    public static int countAndSort(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int res = 0;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        
        for(int i = 0; i < n1; i++) {
            arr1[i] = arr[left + i];
        }

        for(int j = 0; j < n2; j++) {
            arr2[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while(i < arr1.length && j < arr2.length) {
            
            if(arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                res += (n1 - i);
                j++;
            }

            k++;
        }

        while(i < arr1.length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

        return res;
    }

    public static int countAndMerge(int[] arr, int left, int right) {
        int res = 0;

        if(right > left) {
            int mid = left + (right - left)/2;

            //recursively calling for left and right half
            res += countAndMerge(arr, left, mid);
            res += countAndMerge(arr, mid + 1, right);

            res += countAndSort(arr, left, mid, right);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {20, 40, 50, 70, 5, 10, 15, 25};

        int res = countAndMerge(arr, 0, 7);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("total inversions are : " + res);
    }
}
