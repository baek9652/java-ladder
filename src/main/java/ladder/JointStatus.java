package ladder;

public enum JointStatus {
    LEFT,
    RIGHT,
    NO_HORIZONTAL;

    public static JointStatus nextStatus(JointStatus leftSide, boolean shouldChange){
        if (leftSide == RIGHT)
            return LEFT;

        if (shouldChange)
            return RIGHT;

        return NO_HORIZONTAL;
    }
}
