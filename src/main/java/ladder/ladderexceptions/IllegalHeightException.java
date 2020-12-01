package ladder.ladderexceptions;

public class IllegalHeightException extends IllegalArgumentException {

    public IllegalHeightException() {
        super("허용되지 않은 값입니다.");
    }

}
