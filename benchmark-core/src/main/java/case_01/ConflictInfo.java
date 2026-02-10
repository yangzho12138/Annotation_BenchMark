package case_01;

public class ConflictInfo {
    private boolean isConflict = false;
    private boolean isReplaceable = true;

    public ConflictInfo() {

    }

    public boolean isConflict() {
        return isConflict;
    }

    public boolean isReplaceable() {
        return isReplaceable;
    }

    public void setIsConflict(boolean isConflict) {
        this.isConflict = isConflict;
    }

    public void setReplaceable(boolean isReplaceable) {
        this.isReplaceable = isReplaceable;
    }
}
