package dsa_problem_solution;
public class _6_9_findingInfiniteArray {

    public static int binarySearch(int arr[], int x, int low, int high){
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                return mid;
            } else if(arr[mid] > x){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static int findPos(int arr[], int x){
        if(arr[0]==x){
            return 0;
        }
        int i=1;
        while(arr[i]<x){
            i=2*i;
        } 

        if(arr[i] == x){
            return i;
        } 

        return binarySearch(arr,x,i/2+1,i-1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,7,8,8,8,9,10,11,12,13,13,45};
        int idx = findPos(arr,9);
        System.out.println(idx);
    }
}