import java.util.*;
import java.io.*;
/**
 * kClosestPointToOrigin973
 */
public class kClosestPointToOrigin973 {

    public static void main(String[] args) {
       kClosestPointToOrigin973 sol = new kClosestPointToOrigin973();
       int[][] points = {{1, 3}, {-2, 2}, {2, -2}};
       int k = 2;
       int[][] closest = sol.kClosest(points, k);
       for(int[] point : closest){
        System.out.println(Arrays.toString(point));
       }

    }
    public int[][] kClosest(int[][] points, int k){
        int[] origin = {0, 0};
        PriorityQueue<int[]> pq = new PriorityQueue<>(k, (a, b) -> {
            double distance1 = Math.sqrt((a[0] - origin[0])*(a[0] - origin[0]) + (a[1] - origin[1])*(a[1] - origin[1]));
           double distance2 = Math.sqrt((b[0] - origin[0])*(b[0] - origin[0]) + (b[1] - origin[1])*(b[1] - origin[1]));
           return Double.compare(distance1,distance2);
        });
        //Add points to the priority queue
        for(int[] point : points){
            pq.add(point);
        }
        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++){
            res[i] = pq.poll();
        }
        return res;
    }
}