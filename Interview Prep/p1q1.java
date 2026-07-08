/*
TCS NQT Paper 1 Question 1

Given two strings A and B of same length.

Operation:

1. Choose any subset of positions.
2. Find smallest character among chosen positions.
3. Replace every chosen character by that smallest character.

Find minimum operations required to convert A into B.

If impossible print -1.

Observation:

We can only reduce characters.

Possible:
d -> a
c -> b

Impossible:
a -> b
b -> c

Approach:

1. Compare A and B character by character.
2. If A[i] < B[i] => impossible => -1.
3. Store all required transformations.
4. Process letters from z to a.
5. Count minimum reductions.
*/
import java.util.*;

public class p1q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();

        for(int i = 0; i < n; i++) {

            if(A[i] < B[i]) {
                System.out.println(-1);
                return;
            }
        }

        int operations = 0;

        for(char ch = 'z'; ch >= 'a'; ch--) {

            char smallest = '{';

            for(int i = 0; i < n; i++) {

                if(A[i] == ch && A[i] != B[i]) {
                    smallest = (char)Math.min(smallest, B[i]);
                }
            }

            if(smallest == '{')
                continue;

            operations++;

            for(int i = 0; i < n; i++) {

                if(A[i] == ch && B[i] <= smallest) {
                    A[i] = smallest;
                }
            }
        }

        System.out.println(operations);
    }
}