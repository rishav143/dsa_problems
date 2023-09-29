public class _6_11_twoPointerApproach {

    public static boolean findPair(int arr[],int x){
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==x){
                return true;
            } if(arr[i]+arr[j]>x){
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {20,30,40,50,60,70};
        if(findPair(arr,110)){
            System.out.println("Yes, we have a pair!");
        } else {
            System.out.println("No, We don't have any pair!");
        }
    }
}
