/**
 * SpacialArray
 */
public class SpacialArray {

  public static boolean isSpecialArray(int[] nums) {
    // Check for arrays with only one element
    if (nums.length == 1) {
      return true;
    }

    // Iterate through the array to check adjacent elements
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] % 2 == nums[i + 1] % 2) {
        // If both numbers have the same parity, return false
        return false;
      }
    }

    // If all adjacent pairs have different parity, return true
    return true;
  }

  public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1};
        System.out.println(isSpecialArray(nums1)); // true

        // Example 2
        int[] nums2 = {2, 1, 4};
        System.out.println(isSpecialArray(nums2)); // true

        // Example 3
        int[] nums3 = {4, 3, 1, 6};
        System.out.println(isSpecialArray(nums3)); //false
}
}