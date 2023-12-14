package Ex8.Domain;

import java.util.ArrayList;

public class History {
    private OperationSystem operationSystem;

    private ArrayList<Snapshot> history;

    public History(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;

        history = new ArrayList<>();
    }

    public void makeBackup() {
        history.add(operationSystem.createSnapshot());
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.remove(history.size()-1).restore();
        } else {
            System.out.println("Настройки системы еще не были сохранены!");
        }
    }
}
