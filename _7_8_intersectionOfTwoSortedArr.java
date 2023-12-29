class _7_8_intersectionOfTwoSortedArr {

    public static void intersectionOfTwoSortArr(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length) {
            if(i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if(arr1[i] > arr2[j]) {
                j++;
            } else if(arr2[j] > arr1[i]) {
                i++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {2, 20, 20, 40, 60};
        int arr2[] = {10, 20, 20, 20, 40, 60};

        intersectionOfTwoSortArr(arr1, arr2);
    }
}