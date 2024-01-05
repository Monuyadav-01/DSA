package BinarySearch;

public class FindPages {

    // finding start index of array
    // this is maximum of array

    public static int max(int A[]) {
        int max = Integer.MIN_VALUE;
        for (int a : A) {
            max = Math.max(a, max);
        }
        return max;
    }

    public static int sum(int A[]) {
        int sum = 0;
        for (int a : A) {
            sum = sum + a;
        }
        return sum;
    }

    public static int findPages(int[] A, int N, int M) {
        // Your code here

        int start = max(A);
        int end = sum(A);

        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int pages = 0;
            int students = 1;
            for (int i = 0; i < N; i++) {
                pages += A[i];
                if (pages > mid) {
                    students++;
                    pages = A[i];
                }

            }
            if (students <= M) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int A[] = { 12, 34, 67, 90 };
        System.out.println(max(A));
        System.out.println(sum(A));

        int M = 2;
        int N = A.length;
        System.out.println(findPages(A, N, M));
    }
}
