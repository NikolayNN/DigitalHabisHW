package by.digital.habbits.exp.parametirizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class JUnit5DataProviderExample {

    private final Sum summator = new Sum();

    @ParameterizedTest
    @MethodSource("method1DataProvider")
    public void method1(int expected, int param1, int param2) {
        assertEquals(expected, summator.sum(param1, param2));
    }

    static Stream<Arguments> method1DataProvider() {
        return Stream.of(
                arguments(10, 7, 3),
                arguments(15, 10, 5)
        );
    }
}