// this is instable sorting algoritm

public class _7_3_selectionSort {

    public static void swap(int arr[], int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,6,9,0,3,2,1};
        
        //--------------------------------------------
        // int temp[] = new int[arr.length];
        // for(int i = 0; i < arr.length; i++) {
            
        //     int minIdx = 0;
            
        //     for(int j = 0; j < arr.length; j++) {
                 
        //         if(arr[minIdx] > arr[j]) {
        //             minIdx = j;
        //         }
        //     }

        //     temp[i] = arr[minIdx];
        //     arr[minIdx] = Integer.MAX_VALUE;
        // }
        //time complexity O(n^2)
        //space complexity O(1)



        

        //--------------------------------------------
        for(int i = 0; i < arr.length; i++) {

            int minIdx = i;
            for(int j = i+1; j < arr.length; j++) {
                
                if(arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }

            swap(arr, i, minIdx);
        }
        //time complexity O(n^2)
        //space complexity O(1)
        
        //--------------------------------------------
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
