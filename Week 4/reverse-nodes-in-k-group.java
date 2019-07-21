/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode p=dummy;
        int size=1;
        while(head!=null){
            if(size%k==0){
                p=reverse(p, head.next);
                head=p.next;
            }
            else head=head.next;
            size++;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode start, ListNode end){
        ListNode x = start.next;
        ListNode y = end;
        while(x!=end){
            ListNode temp = x.next;
            x.next=y;
            y=x;
            x=temp;
        }
        ListNode res=start.next;
        start.next=y;
        return res;
    }
}
