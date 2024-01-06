public class ShipPackeges {

    static int load(int arr[], int cap) {
        int n = arr.length;
        int day = 1;
        int load = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] + load > cap) {
                day++;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }
        return day;

    }

    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here

        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < N; i++) {
            start = Math.max(arr[i], start);
            end = end + arr[i];
        }
        while (start <= end) {
            int mid = start + (end - start);
            int load = load(arr, mid);

            if (load <= D) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 10 };
        int N = arr.length;
        int D = 3;
        System.out.println(
                leastWeightCapacity(arr, N, D));
    }
}
