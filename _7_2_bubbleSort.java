package dsa_problem_solution;

class _7_2_bubbleSort {

    public static void swap(int[] arr, int i) {

        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    public static void bubbleSort(int[] arr) {

        //number of passes
        for(int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;
            //check adjecent element if out of order then swap
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j);
                    swapped = true;
                }
            }

            if(swapped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
    
        int arr[] = {40, 50, 60, 10};
        bubbleSort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    
    }

}