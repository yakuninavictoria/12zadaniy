package Ex1;

import Ex1.Domain.Furniture;
import Ex1.Factory.ChairFactory;
import Ex1.Factory.DresserFactory;
import Ex1.Factory.FurnitureFactory;
import Ex1.Factory.TableFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FurnitureFactory chairFactory = new ChairFactory();
        FurnitureFactory dresserFactory = new DresserFactory();
        FurnitureFactory tableFactory = new TableFactory();

        ArrayList<Furniture> furnitureList = new ArrayList<>();

        Integer select = -1;
        while (select != 0) {
            System.out.println("Что вы хотите сделать:\n" +
                    "1) Создать стул;\n" +
                    "2) Создать стол;\n" +
                    "3) создать шкаф;\n" +
                    "4) Вывести созданные объекты на экран\n" +
                    "0) Выйти из программы");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    Furniture chair = chairFactory.createFurniture();
                    furnitureList.add(chair);
                    break;
                case 2:
                    Furniture table = tableFactory.createFurniture();
                    furnitureList.add(table);
                    break;
                case 3:
                    Furniture dresser = dresserFactory.createFurniture();
                    furnitureList.add(dresser);
                    break;
                case 4:
                    for (Furniture f : furnitureList) {
                        f.show();
                    }
            }
        }
    }
}
