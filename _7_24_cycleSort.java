class _7_24_cycleSort {

    public static void cycleSort(int[] arr) {
        for(int cs = 0; cs < arr.length - 1; cs++) {
            int pos = cs, item = arr[cs];
            // int dupl = cs;
            for(int i = cs+1; i < arr.length; i++) {
                if(arr[i] < item) {
                    pos++;
                }
            }
            int temp = arr[pos];
            arr[pos] = item;
            item = temp;

            while(pos != cs) {
                pos = cs;
                for(int i = cs+1; i < arr.length; i++) {
                    if(arr[i] <= item) {
                        pos++;
                    }
                }
                // if(arr[pos] == dupl) {
                //     pos++;
                // }
                temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {20, 40, 40, 50, 10, 50};
        
        cycleSort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}