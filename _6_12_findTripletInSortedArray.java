package dsa_problem_solution;

public class _6_12_findTripletInSortedArray {

    public static boolean findPair(int arr[],int x,int idx){
        int i=idx, j=arr.length-1;
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

    public static boolean isTriplet(int arr[],int x){
        for(int i=0; i<arr.length-2; i++){
            if(findPair(arr, x, i+1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {20,30,40,50,60,70};
        if(isTriplet(arr,110)){
            System.out.println("Yes, we have a pair!");
        } else {
            System.out.println("No, We don't have any pair!");
        }
    }
}
