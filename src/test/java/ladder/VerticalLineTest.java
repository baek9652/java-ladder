package ladder;

import ladder.ladderexceptions.IllegalHeightException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class VerticalLineTest {

    @Test
    @DisplayName("허용되지 않은 높이 입력값")
    void testInstance() {
        assertThatExceptionOfType(IllegalHeightException.class)
                .isThrownBy(
                        () -> new VerticalLine(0)
                );
    }
}
