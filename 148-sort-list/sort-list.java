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
        ListNode r=new ListNode(res.get(0));
        ListNode rmover=r;
        for(int i=1;i<res.size();i++){
            ListNode ans=new ListNode(res.get(i));
            rmover.next=ans;
            rmover=ans;
        }
        return r;
    }
}