package ladder;

import java.util.Objects;

public class Joint {

    private JointStatus status;

    public Joint() {
        this(JointStatus.NO_HORIZONTAL);
    }

    public Joint(JointStatus status) {
        this.status = status;
    }

    public void changeStatus(Joint leftSideJoint, boolean isRightmost, boolean shouldChange) {
        if (isRightmost) {
            shouldChange = false;
        }

        JointStatus effectingStatus = leftSideJoint == null ? JointStatus.NO_HORIZONTAL : leftSideJoint.status;

        this.status = JointStatus.nextStatus(effectingStatus, shouldChange);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Joint joint = (Joint) o;
        return status == joint.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }
}
