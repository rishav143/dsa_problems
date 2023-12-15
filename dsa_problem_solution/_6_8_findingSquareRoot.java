package dsa_problem_solution;
public class _6_8_findingSquareRoot {

    public static int findSquareRoot(int x){
        int low = 1, high=x, ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            int sqrt = mid*mid;
            if(sqrt == x){
                return mid;
            } else if(sqrt > x){
                high = mid-1;
            } else{
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int res = findSquareRoot(17);
        System.out.print("square root is : "+res);
    }
}