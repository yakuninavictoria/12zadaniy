package Ex8.Domain;

public class Snapshot {
    private OperationSystem operationSystem;

    private String systemType;
    private Integer screenWidth;
    private Integer screenHeight;

    public Snapshot(OperationSystem operationSystem, String systemType, Integer screenWidth, Integer screenHeight) {
        this.operationSystem = operationSystem;

        this.systemType = systemType;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    public void restore() {
        operationSystem.setSystemType(systemType);
        operationSystem.setScreenWidth(screenWidth);
        operationSystem.setScreenHeight(screenHeight);
    }
}
