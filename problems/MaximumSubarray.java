// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
// Kadane's algorithm
public class MaximumSubarray {
    public static void main(String args[]) {
        int nums1[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int nums2[] = new int[] { -1 };
        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
    }

    private static int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int num : nums) {
            maxEndingHere = maxEndingHere + num;
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}