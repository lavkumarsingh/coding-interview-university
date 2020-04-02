package sorting;

public class SelectionSort {
    public static void main(String args[]) {
        int[] arr = new int[] { 5, 2, 1, 8, 6, 3 };
        int[] sorted = sort(arr);
        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }

    // selection sorting algorithm
    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}