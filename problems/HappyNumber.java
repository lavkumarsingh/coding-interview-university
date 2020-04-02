import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/happy-number/
public class HappyNumber {
    public static void main(String args[]) {
        System.out.println(isHappyNumber(19));
    }

    private static boolean isHappyNumber(int x) {
        List<Integer> nums = new ArrayList<>();
        while (x != 1) {
            x = getSquareSum(x);
            if (nums.contains(x)) {
                return false;
            }
            nums.add(x);
        }
        return true;
    }

    private static int getSquareSum(int x) {
        int result = 0;
        while (x > 0) {
            result = result + (x % 10) * (x % 10);
            x = x / 10;
        }
        return result;
    }
}