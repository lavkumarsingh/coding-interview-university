// https://leetcode.com/problems/decompress-run-length-encoded-list/
public class DecompressRLElist {
    public static void main(String args[]) {
        int nums[] = new int[] {1,1,2,3};
        int result[] = decompressRLElist(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            size = size + nums[i];
        }
        int result[] = new int[size];
        int index = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            while (freq > 0) {
                result[index] = (val);
                freq--;
                index++;
            }
        }
        return result;
    }
}