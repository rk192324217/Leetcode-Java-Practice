import java.util.*;

/*
TCS NQT Paper 4 Question 1

A fair sequence is a subsequence whose signs alternate:

+ - + - ...
or
- + - + ...

Find the maximum possible sum among all fair subsequences
having the maximum possible length.

Approach:
1. Group consecutive elements having the same sign.
2. Pick the maximum element from each group.
3. Add them together.

Time Complexity: O(N)
Space Complexity: O(1)
*/

public class p4q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long sum = 0;

        int currentMax = arr[0];

        for(int i = 1; i < n; i++) {

            boolean sameSign =
                (arr[i] > 0 && currentMax > 0) ||
                (arr[i] < 0 && currentMax < 0);

            if(sameSign) {

                currentMax = Math.max(currentMax, arr[i]);

            } else {

                sum += currentMax;
                currentMax = arr[i];

            }
        }

        sum += currentMax;

        System.out.println(sum);
    }
}