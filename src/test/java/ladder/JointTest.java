package ladder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class JointTest {

    @Test
    @DisplayName("생성 테스트(인자 없을 때)")
    void testInstanceWhenNoArguments() {
        assertThat(new Joint()).isEqualTo(new Joint(JointStatus.NO_HORIZONTAL));
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    @DisplayName("상태 변경 테스트, 좌측 사다리 상태가 RIGHT 일 때 LEFT 로 무조건 변환 하는 게 필요 함")
    void testChangeStatus(boolean shouldChange) {
        Joint sample = new Joint();
        sample.changeStatus(new Joint(JointStatus.RIGHT), true, shouldChange);

        assertThat(sample).isEqualTo(new Joint(JointStatus.LEFT));
    }
}
