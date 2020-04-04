// https://www.geeksforgeeks.org/move-zeroes-end-array-set-2-using-single-traversal/

public class MoveZeroes {
    public static void main(String args[]) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        int[] result = moveZeroes(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] moveZeroes(int[] nums) {
        int nonzeroNumIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[nonzeroNumIndex] = nums[i];
                nonzeroNumIndex++;
            }
        }
        
        for(int i = nonzeroNumIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}