package Ex6.Domain;

public abstract class Document {
    public void start() {
        load();
        update();
        save();
        close();
    }
    public abstract void update();

    public void load() {
        System.out.println("Документ загружен");
    }

    public void save() {
        System.out.println("Документ сохранен");
    }

    public void close() {
        System.out.println("Документ закрыт\n");
    }
}
