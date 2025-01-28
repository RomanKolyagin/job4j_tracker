package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    void whenExeption() {
        IllegalArgumentException exception = assertThrows(
                        IllegalArgumentException.class,
                () -> {
                    Factorial.calc(-1);
                });
                            assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }

    @Test
    void whenNoException() {
        int number = 3;
        int expected = 6;
        int result = Factorial.calc(number);
        assertThat(expected).isEqualTo(result);
    }
}