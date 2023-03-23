public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }

        ListNode tortoise = head;
        ListNode hare = head.next;
        int count = 0;

        while(hare != null) {
            count++;

            if (tortoise == hare) {
                return true;
            }

            if(count % 2 == 0) {
                tortoise = tortoise.next;
            }

            hare = hare.next;
        }

        return false;
    }
}