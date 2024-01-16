import java.util.Arrays;
import java.util.Scanner;

class Interval implements Comparable<Interval> {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int compareTo(Interval p) {
        return this.start - p.start;
    }
}

public class _7_23_mergeOverlappingIntervals {

    public static void printOverlappingIntervals(Interval[] arr) {
        Arrays.sort(arr);
        int res = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[res].end >= arr[i].start) {
                arr[res].start = Math.min(arr[res].start, arr[i].start);
                arr[res].end   = Math.max(arr[res].end,   arr[i].end);
            } else {
                res++; arr[res] = arr[i];
            }
        }

        for(int i = 0; i<=res; i++) {
            System.out.println(arr[i].start + " " + arr[i].end);
        }
    }
    public static void main(String[] args) {
        Interval[] arr = new Interval[5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[i] = new Interval(start, end);
        }

        printOverlappingIntervals(arr);
    }
}
// {(5,10), (3,15), (18,30), (2,7), (8,9)}
//time complexity is O(nlogn)