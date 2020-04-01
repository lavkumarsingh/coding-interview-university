import java.io.*;
import java.util.*;
import java.lang.*;

// https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams/0

public class CountAnagrams {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // test case
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String textS = br.readLine();
            String wordC = br.readLine();
            System.out.println(findAnagramsCount(textS, wordC));
        }
    }

    private static int findAnagramsCount(String textS, String wordC) {
        int count = 0;
        int windowSize = wordC.length();
        char[] wordCArr = wordC.toCharArray();
        Arrays.sort(wordCArr);

        for (int i = 0; i <= textS.length() - windowSize; i++) {
            String window = textS.substring(i, i + windowSize);
            char[] windowArr = window.toCharArray();
            Arrays.sort(windowArr);

            if (Arrays.equals(wordCArr, windowArr)) {
                count++;
            }
        }
        return count;
    }
}