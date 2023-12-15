package dsa_problem_solution;
public class _6_10_findingPeek {

    public static int findPeek(int arr[]){
        int low = 0, high=arr.length-1;
        while(low<=high){
            int mid = (high+low)/2;
            if( (mid == 0 || arr[mid-1]<=arr[mid]) && (mid == arr.length-1 || arr[mid+1]<=arr[mid])){
                return mid;
            } else if(arr[mid-1]>=arr[mid]){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,1,1,2,4,5,7};
        int res = findPeek(arr);
        System.out.println(res);
    }
}