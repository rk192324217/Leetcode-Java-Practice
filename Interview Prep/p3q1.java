
import java.util.*;

/*
TCS NQT Paper 3 Question 1

This vacation you went to visit the Golden House.

There are N rooms in this Golden House and its owner needs someone
to take care of the management of this house.

The owner created a puzzle to find an intelligent manager.

Each room contains some gold coins.

You have to choose:

1. One room from where you enter.
2. One room from where you exit.

Rules:

1. From a room you can either exit or move to the next room.
2. Whenever you visit a room, you collect all gold coins in it.
3. You cannot skip a room once you enter it.
4. The owner wants exactly K gold coins when you exit.
5. At least one solution always exists.

Task:

Given:
N = Number of rooms
K = Required number of gold coins
Array of gold coins in each room

Find:
Starting room number
Ending room number

If multiple solutions exist,
return the one with the smaller starting room number.

Room numbering starts from 1.

Example:

Input:
10 15

5 3 7 14 18 1 18 4 8 3

Output:
1 3

Explanation:

Rooms:
1  2  3  4  5  6  7  8  9  10
5  3  7 14 18  1 18  4  8   3

5 + 3 + 7 = 15

So rooms 1 to 3 form a valid answer.

Observation:

Find a continuous subarray whose sum equals K.

Pattern:
Sliding Window / Two Pointers

Time Complexity:
O(N)
 */
public class p3q1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int l = 0, r = 0;
        int tempSum = 0;
        while (l < n && r < n) {
            tempSum += nums[r++];
            if (tempSum == k) {
                break;
            }
            while (tempSum > k) {
                tempSum -= nums[l++];
            }
        }

        System.out.println((l + 1) + " " + r);

    }

}
