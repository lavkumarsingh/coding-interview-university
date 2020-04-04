
public class MoveZeroes {
    public static void main(String args[]) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        int[] result = moveZeroes(nums);
        for (int num : result) {
            System.out.print(num);
        }
    }

    private static int[] moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            if (nums[i] == 0 && j < nums.length) {
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }
                if (j < nums.length && nums[j] != 0) {
                    // swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}