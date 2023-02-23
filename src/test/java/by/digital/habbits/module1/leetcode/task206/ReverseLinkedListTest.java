package by.digital.habbits.module1.leetcode.task206;

import by.digital.habbits.module1.leetcode.task206.ReverseLinkedList.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    ReverseLinkedList.Solution solution = new ReverseLinkedList.Solution();

    @Test
    void test1() {
        ListNode given = listNode(List.of(1, 2, 3));
        var actual = solution.reverseList(given);
        assertEquals(List.of(3, 2, 1), toArrayList(actual));
    }

    private List<Integer> toArrayList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result;
    }

    private ListNode listNode(List<Integer> numbs) {
        if (numbs == null || numbs.isEmpty()) {
            return null;
        }
        var root = new ListNode(numbs.get(0));
        var node = root;
        for (int i = 1; i < numbs.size(); i++) {
            var current = new ListNode(numbs.get(i));
            node.next = current;
            node = current;
        }
        return root;
    }
}