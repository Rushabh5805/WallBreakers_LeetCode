/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return null;
        ListNode current = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even!=null&&even.next!=null){
            current.next=even.next;
            current=current.next;
            even.next=current.next;
            even=even.next;
        }
        current.next=evenHead;
        return head;
    }
}
