package Ex3.Domain;

public class Application {
    private DataBase dataBase;

    public Application(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }
}
