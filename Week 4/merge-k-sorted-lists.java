/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=null, last=null;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((n1, n2) -> n1.val - n2.val);
        for(ListNode l : lists){
            if(l!=null)
                pq.add(l);
        }
        while(!pq.isEmpty()){
            ListNode top = pq.peek();
            pq.remove();
            if(top.next!=null)
                pq.add(top.next);
            if(head==null){
                head=top;
                last=top;
            }
            else{
                last.next=top;
                last=top;
            }
        }
        return head;
    }
}
