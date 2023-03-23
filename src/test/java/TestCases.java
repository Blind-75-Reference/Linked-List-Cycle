import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        boolean expected = false;

        Assertions.assertEquals(expected, solution.hasCycle(list));
    }

    @Test
    public void testCase2() {
        ListNode list = new ListNode(1);
        ListNode tail = new ListNode(4, list);
        list.next = new ListNode(2, new ListNode(3, tail));
        boolean expected = true;

        Assertions.assertEquals(expected, solution.hasCycle(list));
    }

    @Test
    public void testCase3() {
        ListNode head = new ListNode(1);
        ListNode tail = new ListNode(4);
        ListNode cycle = new ListNode(2, new ListNode(3, tail));

        head.next = cycle;
        tail.next = cycle;


        boolean expected = true;

        Assertions.assertEquals(expected, solution.hasCycle(head));
    }
}
