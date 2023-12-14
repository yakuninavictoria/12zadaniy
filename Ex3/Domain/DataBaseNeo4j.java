package Ex3.Domain;

public class DataBaseNeo4j implements DataBase{
    @Override
    public void test() {
        System.out.println("Подключен база данных Neo4j");
    }
}
