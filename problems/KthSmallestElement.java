import java.lang.*;
import java.util.*;
import java.io.*;

public class KthSmallestElement {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            int k = Integer.parseInt(br.readLine());
            System.out.println(findKthSmallestElement(k, arr));
        }
    }

    // O(nlogn)
    private static int findKthSmallestElement(int k, int[] arr) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}