package ladder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputParser {

    private InputParser() {
    }

    public static List<String> parseRawInput(String input) {
        return Arrays.stream(input.split(","))
                .collect(Collectors.toList());
    }
}
