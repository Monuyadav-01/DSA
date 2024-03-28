import java.util.ArrayList;
import java.util.List;

public class ProblemNo57 {
    // public static int[][] insert(int[][] intervals, int[] newInterval) {
    // List<int[]> merge = new ArrayList<>();
    // for (int interval[] : intervals) {
    // // before the new interval
    // if (interval[1] < interval[0]) {
    // merge.add(interval);
    // }
    // // after the new interval
    // else if (interval[0] > newInterval[1]) {
    // merge.add(newInterval);
    // newInterval = interval;
    // }

    // // overlapping the problem
    // else {
    // newInterval[0] = Math.min(newInterval[0], newInterval[0]);
    // newInterval[1] = Math.min(newInterval[1], newInterval[1]);
    // }
    // }
    // // add the last interval, which is either the original newInterval
    // merge.add(newInterval);
    // return merge.toArray(new int[merge.size()][2]);
    // }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergedIntervals = new ArrayList<>();

        for (int[] interval : intervals) {

            // Before the new interval
            if (interval[1] < newInterval[0]) {
                mergedIntervals.add(interval);
            }
            // After the new interval
            else if (interval[0] > newInterval[1]) {
                mergedIntervals.add(newInterval);
                newInterval = interval; // Update newInterval to current, as it will be added in order afterwards
            }
            // Overlapping intervals
            else {
                // Merge with newInterval by updating its start and end as needed
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        // Add the last interval, which is either the original newInterval or the one
        // merged with others
        mergedIntervals.add(newInterval);

        return mergedIntervals.toArray(new int[mergedIntervals.size()][2]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 6, 9 } };
        int[] newInterval = { 2, 5 };
        int[][] ans = insert(intervals, newInterval);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }
}
