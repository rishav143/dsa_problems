class _7_9_unionOfTwoSortedArr {

    public static void union(int[] arr1, int[] arr2, int[] res) {
        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length) {
            if(i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if(j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if(arr1[i] < arr2[j]) {
                res[k++] = arr1[i];
                i++;
            } else if(arr1[i] > arr2[j]) {
                res[k++] = arr2[j];
                j++;
            } else {
                res[k++] = arr1[i];
                i++;
                j++;
            }
        }

        while(i < arr1.length) {
            if(i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
            } else {
                res[k++] = arr1[i];
                i++;
            }
        }

        while(j < arr2.length) {
            if(j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
            } else {
                res[k++] = arr2[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 10, 20, 20, 60, 70};
        int[] arr2 = {3, 20, 20, 20, 40};
        int totalSize = arr1.length + arr2.length;
        int[] res = new int[totalSize];

        union(arr1, arr2, res);

        for(int i = 0; i < totalSize; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
//time complexity is O(m + n)