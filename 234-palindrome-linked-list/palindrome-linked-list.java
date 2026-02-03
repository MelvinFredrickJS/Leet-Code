/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode rev=new ListNode(temp.val);
        ListNode mover=rev;
        temp=temp.next;
        while(temp!=null){
            ListNode res=new ListNode(temp.val);
            mover.next=res;
            mover=res;
            temp=temp.next;
        }
        temp=head;
        ListNode temp1=rev;
        ListNode prev=null;
        while(temp1!=null){
            ListNode front=temp1.next;
            temp1.next=prev;
            prev=temp1;
            temp1=front;
        }
        temp1=prev;
        while(temp!=null && temp1!=null){
            if(temp.val!=temp1.val){
                return false;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        return true;
    }
}