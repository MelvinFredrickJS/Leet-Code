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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        if(temp==null){
            return null;
        }else if(temp.next==null){
            return temp;
        }
        ListNode odd=new ListNode(temp.val);
        ListNode oddmover=odd;
        temp=temp.next;
        ListNode even=new ListNode(temp.val);
        ListNode evemover=even;
        temp=temp.next;
        int count=1;
        while(temp!=null){
            if(count%2==0){
                ListNode eve=new ListNode(temp.val);
                evemover.next=eve;
                evemover=eve;
            }else{
                ListNode od=new ListNode(temp.val);
                oddmover.next=od;
                oddmover=od;
            }
            count++;
            temp=temp.next;
        }
        evemover=even;
        oddmover.next=evemover;
        oddmover=odd;
        return oddmover;
    }
}