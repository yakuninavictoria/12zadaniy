package Ex9;

import Ex9.Domain.Manager;
import Ex9.Domain.Window;

import java.util.Scanner;

public class Ex9Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Manager manager = Manager.getInstance();

        Integer select = -1;
        while (select != 0) {
            System.out.println("Что вы хотите сделать?\n" +
                    "1) Открыть новой окно\n" +
                    "2) Закрыть все окна\n" +
                    "3) Вывести на экран названия всех окон\n" +
                    "0) Выйти из программы");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Введите название окна: ");
                    scanner.nextLine();
                    manager.openWindow(new Window(scanner.nextLine()));
                    break;
                case 2:
                    manager.closeAllWindows();
                    break;
                case 3:
                    for (Window w : manager.getWindows()) {
                        System.out.println(w.getName());
                    }
                    break;
            }
        }
    }
}
