package Ex8;

import Ex8.Domain.History;
import Ex8.Domain.OperationSystem;

import java.util.Scanner;

public class Ex8Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OperationSystem os = new OperationSystem("Windows", 1920, 1080);
        History history = new History(os);

        Integer select = -1;
        while (select != 0) {
            System.out.println("Что вы хотите сделать?\n" +
                    "1) Изменить операционную систему;\n" +
                    "2) Изменить разрешение экрана\n" +
                    "3) Сохранить настройки системы\n" +
                    "4) Восстановить настройки системы\n" +
                    "5) Вывести на экран настройки системы\n" +
                    "0) Выйти из приложения");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Введите название ОС: ");
                    scanner.nextLine();
                    os.setSystemType(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Введите ширину экрана: ");
                    os.setScreenWidth(scanner.nextInt());
                    System.out.print("Введите высоту экрана: ");
                    os.setScreenHeight(scanner.nextInt());
                    break;
                case 3:
                    history.makeBackup();
                    break;
                case 4:
                    history.undo();
                    break;
                case 5:
                    System.out.println(os.toString());
                    break;
            }
        }
    }
}
