package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] test = {{1,4},{4,5}};
//        int[] ans = merge_two(new int[]{1,4},new int[]{4,5});
//        System.out.println(is_overlap(new int[]{1,4},new int[]{4,5}));
        int [][] test_2 = {{1,3},{2,6},{8,10},{15,18}};

        int[][] ans = merge(test_2);
        System.out.println();
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];

            if (interval[0] <= currentEnd) { // Overlapping intervals
                currentInterval[1] = Math.max(currentEnd, interval[1]);
            } else { // Disjoint intervals
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    /** need a smarter way to traverse array **/
    //    public static int[][] merge(int[][] intervals) {
//        List ans = new ArrayList<>();
//        for (int i = 0; i < intervals.length - 1; i++) {
//            int[] inspect = intervals[i];   // int arr to be inspected
//            int[] next = intervals[i+1];
//            if (is_overlap(inspect, next)){
//                ans.add(merge_two(inspect, next));
//                i++;
//            } else if (i == intervals.length - 1){
//                ans.add(intervals[i+1]);
//                break;
//            } else {
//                ans.add(inspect);
//            }
//        }
//        int[][] ansArray = new int[ans.size()][];
//        for (int i = 0; i < ans.size(); i++) {
//            ansArray[i] = (int[]) ans.get(i);
//        }
//        return ansArray;
//    }
    public static boolean is_overlap(int[] one, int[] two){
        return one[one.length - 1] >= two[0];
    }

    public static int[] merge_two(int[] one, int[] two){
        return new int[]{one[0], two[two.length-1]};
    }
}
