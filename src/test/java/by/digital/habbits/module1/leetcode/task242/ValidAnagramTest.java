package by.digital.habbits.module1.leetcode.task242;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ValidAnagramTest {

    ValidAnagram.SolutionSort solution = new ValidAnagram.SolutionSort();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void solutionSort(String given1, String given2, boolean expected) {
        boolean actual = solution.isAnagram(given1, given2);
        assertEquals(expected, actual);
    }

    ValidAnagram.SolutionCounter solutionCounter = new ValidAnagram.SolutionCounter();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void solutionCounter(String given1, String given2, boolean expected) {
        boolean actual = solutionCounter.isAnagram(given1, given2);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("anagram", "nagaram", true),
                arguments("rat", "cat", false),
                arguments("a", "ab", false)
        );
    }
}