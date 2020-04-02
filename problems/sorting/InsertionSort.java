package sorting;

public class InsertionSort {
    public static void main(String args[]) {
        int[] arr = new int[] {5, 2, 1, 8, 6, 3};
        int[] sorted = sort(arr);
        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }

    // insertion sorting algorithm
    private static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];

            while(j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}