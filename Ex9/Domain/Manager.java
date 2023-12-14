package Ex9.Domain;

import java.util.ArrayList;

public class Manager {
    private static Manager instance;

    private ArrayList<Window> windows;

    private Manager() {
        windows = new ArrayList<>();
    }

    public static Manager getInstance() {
        if (instance == null) {
            return new Manager();
        }
        return instance;
    }

    public void openWindow(Window window) {
        windows.add(window);
    }

    public void closeAllWindows() {
        if (!windows.isEmpty()) {
            windows.removeAll(windows);
            System.out.println("Все окна были закрыты");
        } else {
            System.out.println("Ни одно окно еще не было открыто!");
        }
    }

    public ArrayList<Window> getWindows() {
        return windows;
    }
}
