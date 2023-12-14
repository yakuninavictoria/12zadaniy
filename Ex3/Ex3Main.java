package Ex3;

import Ex3.Domain.*;

import java.util.Scanner;

public class Ex3Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Application application = new Application(new DataBaseSQL());   //База данных по умолчанию

        System.out.println("Выберите базу данных на которой будет работать ваше приложение:\n" +
                "1) SQL;\n" +
                "2) NoSQL;\n" +
                "3) Neo4j;");
        Integer select = scanner.nextInt();
        switch (select) {
            case 1:
                DataBase dataBaseSQL = new DataBaseSQL();
                application = new Application(dataBaseSQL);
                break;
            case 2:
                DataBase dataBaseNoSQL = new DataBaseNoSQL();
                application = new Application(dataBaseNoSQL);
                break;
            case 3:
                DataBase dataBaseNeo4j = new DataBaseNeo4j();
                application = new Application(dataBaseNeo4j);
                break;
        }
        application.getDataBase().test();
    }
}
