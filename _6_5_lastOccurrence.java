package dsa_problem_solution;

public class _6_5_lastOccurrence {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,10,10,20,20,30,40,50,50,50};
		int x = 50;
		int idx = checkLastOccur(arr, x);
		System.out.print(idx);
	}

}
