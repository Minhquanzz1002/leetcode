package leetcode.med.lc2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionLC2Test {
    @Test
    void addTwoNumbersTest1() {
        SolutionLC2 solution = new SolutionLC2();
        ListNode l1 = createList(2, 4, 3);
        ListNode l2 = createList(5, 6, 4);

        ListNode actual = solution.addTwoNumbers(l1, l2);
        ListNode expected = createList(7, 0, 8);

        assertListEquals(actual, expected);
    }

    @Test
    void addTwoNumbersTest2() {
        SolutionLC2 solution = new SolutionLC2();
        ListNode l1 = createList(0);
        ListNode l2 = createList(0);

        ListNode actual = solution.addTwoNumbers(l1, l2);
        ListNode expected = createList(0);

        assertListEquals(actual, expected);
    }

    @Test
    void addTwoNumbersTest3() {
        SolutionLC2 solution = new SolutionLC2();
        ListNode l1 = createList(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = createList(9, 9, 9, 9);

        ListNode actual = solution.addTwoNumbers(l1, l2);
        ListNode expected = createList(8, 9, 9, 9, 0, 0, 0, 1);

        assertListEquals(actual, expected);
    }

    private ListNode createList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    private void assertListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }

        Assertions.assertNull(expected);
        Assertions.assertNull(actual);
    }
}
