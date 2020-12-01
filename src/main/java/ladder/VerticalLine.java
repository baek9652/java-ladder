package ladder;

import ladder.ladderexceptions.IllegalHeightException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VerticalLine {

    private final List<Joint> joints;

    public VerticalLine(int height) {
        Optional.of(height)
                .filter(value -> value >= 1)
                .orElseThrow(IllegalHeightException::new);

        joints = IntStream.range(0, height)
                .mapToObj(x -> new Joint())
                .collect(Collectors.toList());
    }
}
