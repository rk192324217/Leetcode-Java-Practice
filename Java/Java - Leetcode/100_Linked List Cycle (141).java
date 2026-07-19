/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)return false;
        ListNode left=head;
        ListNode right=head;
        while(right!=null && right.next!=null){
            right=right.next.next;
            left=left.next;
            if(left==right){
                return true;
            }
        }
        return false;
    }
}