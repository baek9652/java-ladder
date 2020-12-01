package ladder;

import ladder.ladderexceptions.IllegalHeightException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class VerticalLine {

    private final List<Joint> line;

    public VerticalLine(int height) {

        if (height < 1) {
            throw new IllegalHeightException();
        }

        line = new ArrayList<>();

        IntStream.range(0, height)
                .mapToObj(x -> line.add(Joint.NO_HORIZONTAL));
    }
}
