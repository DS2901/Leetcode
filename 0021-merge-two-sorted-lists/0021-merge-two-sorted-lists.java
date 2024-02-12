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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
          List<Integer> mergedList = new ArrayList<>();

        // Insert elements from list1 into the merged list
        ListNode current = list1;
        while (current != null) {
            mergedList.add(current.val);
            current = current.next;
        }

        // Insert elements from list2 into the merged list
        current = list2;
        while (current != null) {
            mergedList.add(current.val);
            current = current.next;
        }

        // Sort the merged list
        Collections.sort(mergedList);

        // Create a new ListNode to represent the head of the sorted merged list
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int num : mergedList) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        // Return the sorted merged list
        return dummy.next;
        
    }
}