package ladder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class JointStatusTest {

    @Test
    @DisplayName("사다리 조인트 종류 확인")
    void testThreeStatus() {
        assertThat(JointStatus.values().length)
                .isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    @DisplayName("왼쪽 막대가 오른쪽을 향했을 때 새로운 상태로의 변경 테스트")
    void testStatusChange(boolean change) {
        assertThat(JointStatus.nextStatus(JointStatus.RIGHT, change))
                .isEqualTo(JointStatus.LEFT);
    }

    @ParameterizedTest
    @MethodSource

}
