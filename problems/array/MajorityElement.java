import java.util.*;

// https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public static void main(String args[]) {
        int[] nums = new int[] { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxKey = 0;
        int maxValue = 0;
        for (int num : nums) {
            Integer mapEntryVal = map.get(num);
            int key = num;
            int value = 1;
            if (mapEntryVal != null) {
                value = mapEntryVal + 1;
                map.put(num, value);
            } else {
                map.put(num, 1);
            }

            if (value > maxValue) {
                maxKey = key;
                maxValue = value;
            }
        }
        return maxKey;
    }
}