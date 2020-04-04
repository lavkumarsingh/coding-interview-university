import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.geeksforgeeks.org/array-rotation/
// Array Rotation

public class ArrayRotation {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // test cases
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(tk.nextToken());
            int d = Integer.parseInt(tk.nextToken());

            int arr[] = new int[n];

            StringTokenizer tkVals = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(tkVals.nextToken());
            }

            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[(d + x) % (arr.length)] + " ");
            }
            System.out.print("\n");
        }
    }
}