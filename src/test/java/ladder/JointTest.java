package ladder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JointTest {

    @Test
    @DisplayName("사다리 조인트 종류 확인")
    void testThreeStatus() {
        assertThat(Joint.values().length)
                .isEqualTo(3);
    }
}
