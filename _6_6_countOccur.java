package dsa_problem_solution;

public class _6_6_countOccur {

	public static int firstOccur(int arr[], int x){
		int low = 0;
		int high = arr.length-1;
		while(low<=high){
			int mid = (low+high)/2;
			if(arr[mid] < x){
				low = mid +1;
			} else if(arr[mid] > x){
				high = mid - 1;
			}
			else {
				if(mid == 0 || arr[mid]!=arr[mid-1]){
					return mid;
				} else {
					high = mid -1;
				}
			}
		}
		return -1;
	}
	
	public static int checkLastOccur(int arr[], int x){
		int low = 0;
		int high = arr.length-1;
		while(low<=high){
			int mid = (low+high)/2;
			if(arr[mid]>x){
				high = mid -1;
			}else if(arr[mid]<x) {
				low = mid + 1;
			}
			else{
				if(mid==arr.length-1 || arr[mid]!=arr[mid+1]){
					return mid;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}
	
	public static int countOccur(int arr[], int x){
		int first = firstOccur(arr,x);
		if(first==-1){
			return 0;
		} else {
			return checkLastOccur(arr,x) -  first + 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,10,10,20,20,30,40,50};
		int x = 20;
		System.out.print(countOccur(arr,x));
	}
}
