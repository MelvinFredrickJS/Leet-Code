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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        ArrayList<Integer>res=new ArrayList<>();
        while(temp!=null){
            res.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        Collections.sort(res);
        temp.val=res.get(0);
        temp=temp.next;
        int count=1;
        while( count<res.size()&& temp!=null){
            temp.val=res.get(count);
            count++;
            temp=temp.next;
        }
        return head;
    }
}