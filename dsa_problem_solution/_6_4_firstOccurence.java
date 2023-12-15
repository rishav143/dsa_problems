package dsa_problem_solution;

public class _6_4_firstOccurence {
	
	public static void main(String[] args){
		int arr[] = {10,10,10,20,20,30,40,50};
		int x = 40;
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
					System.out.print("first occ is at : "+mid);
					return;
				} else {
					high = mid -1;
				}
			}
		}
		System.out.print("no element found!");
	}
}
