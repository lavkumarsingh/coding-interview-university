package bitmanipulation;

// https://leetcode.com/problems/single-number/
// If we take XOR of zero and some bit, it will return that bit
// a ^ 0 = a
// If we take XOR of two same bits, it will return 0
// a ^ a = 0
// a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b
// So we can XOR all bits together to find the unique number.

public class SingleNumber {
    public static void main(String args[]) {
        int arr[] = new int[] {1, 2, 2, 1, 3};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int x : nums) {
            result = result ^ x;
        }
        return result;
    }
}
