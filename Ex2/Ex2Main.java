package Ex2;

import Ex2.Domain.Chair;
import Ex2.Domain.Table;
import Ex2.Factory.ClassicFurnitureFactory;
import Ex2.Factory.FurnitureFactory;
import Ex2.Factory.MinFurnitureFactory;
import Ex2.Factory.ModernFurnitureFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FurnitureFactory classicFurnitureFactory = new ClassicFurnitureFactory();
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        FurnitureFactory minFurnitureFactory = new MinFurnitureFactory();

        ArrayList<Chair> chairs = new ArrayList<>();
        ArrayList<Table> tables = new ArrayList<>();

        Integer select = -1;
        while (select != 0) {
            System.out.println("Что вы хотите сделать?\n" +
                    "1) Создать стул;\n" +
                    "2) Создать стол;\n" +
                    "3) Вывести все созданные стулья на экран;\n" +
                    "4) вывести все созданные столы на экран;\n" +
                    "0) Выйти из программы;");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    Chair chair;
                    System.out.println("В каком стиле?\n" +
                            "1) Классическом;\n" +
                            "2) Современном;\n" +
                            "3) Минимализм;\n" +
                            "0) Выйти в предыдущее меню;");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            chair = classicFurnitureFactory.createChair();
                            chairs.add(chair);
                            break;
                        case 2:
                            chair = modernFurnitureFactory.createChair();
                            chairs.add(chair);
                            break;
                        case 3:
                            chair = minFurnitureFactory.createChair();
                            chairs.add(chair);
                            break;
                        case 0:
                            select = -1;
                    }
                    break;
                case 2:
                    Table table;
                    System.out.println("В каком стиле?\n" +
                            "1) Классическом;\n" +
                            "2) Современном;\n" +
                            "3) Минимализм;\n" +
                            "0) Выйти в предыдущее меню;");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            table = classicFurnitureFactory.createTable();
                            tables.add(table);
                            break;
                        case 2:
                            table = modernFurnitureFactory.createTable();
                            tables.add(table);
                            break;
                        case 3:
                            table = minFurnitureFactory.createTable();
                            tables.add(table);
                            break;
                        case 0:
                            select = -1;
                    }
                    break;
                case 3:
                    for (Chair c : chairs) {
                        c.show();
                    }
                    break;
                case 4:
                    for (Table t : tables) {
                        t.show();
                    }
                    break;
            }
        }
    }
}
