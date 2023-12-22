import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2 
class Point implements Comparable<Point> {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p) {
        return this.x - p.x;
    }
}

public class _7_1_collectionSort {

    // 3 
    public static void main(String[] args) {
        // 1 reversing the order of arraylist
        // List<Integer> ls = new ArrayList<>();
        // ls.add(5);
        // ls.add(6);
        // ls.add(7);
        // Collections.sort(ls, Collections.reverseOrder());
        // System.out.print(ls);

        // 2 decending order using comprator function
        List<Point> list = new ArrayList<>();
        list.add(new Point(2, 9));
        list.add(new Point(5, 1));
        list.add(new Point(3, 9));
        Collections.sort(list);
        for(Point p : list) {
            System.out.println();
        }
    }
}
