package com.robotcollisions;
import java.util.*;
public class robotCollisions {
    public static void main(String[] args) {
        int[] positions = {3, 5, 2, 6};
        int[] healths = {10, 10, 15, 12};
        String directions = "RLRL";
        List<Integer> list = survivedRobotsHealths(positions, healths, directions);
        System.out.println(list);
    }
    public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions){
        int n = positions.length;
        List<int[]> lists = new ArrayList<>();
        for(int i = 0; i < n; i++){
            lists.add(new int[]{positions[i], healths[i], directions.charAt(i), i});
        }
        Collections.sort(lists, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();
        for(int[] list : lists){
            if(list[2] == 'R' || stack.isEmpty() || stack.peek()[2] == 'L'){
                stack.push(list);
                continue;
            }
            if(list[2] == 'L'){
                boolean add = true;
                while(!stack.isEmpty() && stack.peek()[2] == 'R' && add){
                    int last_health = stack.peek()[1];
                    if(list[1] > last_health){
                        stack.pop();
                        list[1] -= 1;
                    }else if(list[1] < last_health){
                        stack.peek()[1] -= 1;
                        add = false;
                    } else {
                        stack.pop();
                        add = false;
                    }
                }
                if(add){
                    stack.push(list);
                }
            }
        }
        List<int[]> resultList = new ArrayList<>(stack);
        resultList.sort(Comparator.comparingInt(a -> a[3]));

        List<Integer> result = new ArrayList<>();
        for (int[] robot : resultList) {
            result.add(robot[1]);
        }
        return result;
    }

}
