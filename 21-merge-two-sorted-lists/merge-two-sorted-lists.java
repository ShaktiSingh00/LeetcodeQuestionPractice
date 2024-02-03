/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 **/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp= new ListNode();
        ListNode newhead = temp;
        while(list1 != null && list2 != null)
        {
            if(list1.val < list2.val)
            {
                newhead.next=list1;
                list1=list1.next;
            }
            else
            {
                newhead.next=list2;
                list2=list2.next;
            }
            newhead=newhead.next;
        }
        
        if(list1 != null)
        {
            newhead.next=list1;
        }
        if(list2 != null)
        {
            newhead.next=list2;
        } 

        return temp.next; 
    }

}