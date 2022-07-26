package entities_enums;

public enum WorkerLevel {
    JUNIOR(0),
    MID_LEVEL(1),
    SENIOR(2);

    private final int i;
    WorkerLevel(int i) {
        this.i = i;
    }

    public int getI() {
        return this.i;
    }

}
