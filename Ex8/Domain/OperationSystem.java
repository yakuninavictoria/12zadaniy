package Ex8.Domain;

public class OperationSystem {
    private String systemType;
    private Integer screenWidth;
    private Integer screenHeight;

    public OperationSystem(String systemType, Integer screenWidth, Integer screenHeight) {
        this.systemType = systemType;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public void setScreenWidth(Integer screenWidth) {
        this.screenWidth = screenWidth;
    }

    public void setScreenHeight(Integer screenHeight) {
        this.screenHeight = screenHeight;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this, systemType, screenWidth, screenHeight);
    }

    @Override
    public String toString() {
        return "OperationSystem{" +
                "systemType='" + systemType + '\'' +
                ", screenWidth=" + screenWidth +
                ", screenHeight=" + screenHeight +
                '}';
    }
}
