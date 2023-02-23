package by.digital.habbits.module1.leetcode.task344;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString.Solution solution = new ReverseString.Solution();

    @Test
    void test1() {
        var given = new char[]{'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(given);
        assertEq("olleh", given);
    }

    @Test
    void test2() {
        var given = new char[]{'g', 'o', 'o', 'd', 'b', 'y', 'e'};
        solution.reverseString(given);
        assertEq("eybdoog", given);
    }

    private void assertEq(String expected, char[] actual) {
        assertEquals(expected, new String(actual));
    }
}