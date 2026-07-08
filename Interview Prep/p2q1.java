import java.util.*;
/*
TCS NQT Paper 2 Question 1

Alice starts by giving a digit to Friend 1.

Each friend passes the digit to the next friend.

Array D represents the digit understood by each friend.

D[i] = digit understood by ith friend.

Find how many friends either:
1. Understood incorrectly
OR
2. Communicated incorrectly

Observation:

Friend 1's digit is considered the original digit.

Count how many friends have a digit different from D[0].

Example:

Input:
5
1 2 3 2 2

Output:
4

Explanation:
Original digit = 1

Friends with different digits:
2,3,2,2

Count = 4
*/

public class p2q1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] friends=new int[n];
        for(int i=0;i<n;i++){
            friends[i]=sc.nextInt();
        }
        int orgNum=friends[0];
        int count=0;

        for(int j : friends){
            if(j!=orgNum){
                count++;
            }
        }
        System.out.println("The number of misundertood friends are:"+count);

    }
}
