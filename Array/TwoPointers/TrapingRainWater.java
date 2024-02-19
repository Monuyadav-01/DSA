public class TrapingRainWater {

    // public static int rain(int[] height)
    // {

    // }

    public static int[] leftMax(int arr[]) {
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Math.max(arr[i], arr1[i]);
        }
        return arr1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        int ans[] = leftMax(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
