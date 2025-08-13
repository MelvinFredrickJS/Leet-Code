/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node;
        ListNode front=temp.next;
        temp.val=front.val;
        temp.next=temp.next.next;
        front.next=null;
    }
}