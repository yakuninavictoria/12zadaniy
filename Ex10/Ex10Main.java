package Ex10;

import Ex10.Domain.LibraryManager;

import java.util.Scanner;

public class Ex10Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LibraryManager libraryManager = new LibraryManager();

        Integer select = -1;
        while (select != 0) {
            System.out.println("Что вы хотите сделать?\n" +
                    "1) Найти книгу\n" +
                    "2) Сделать заказа\n" +
                    "3) Проверить книгу на наличие\n" +
                    "0) Выйти вон");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    libraryManager.searchBook();
                    break;
                case 2:
                    libraryManager.makeOrder();
                    break;
                case 3:
                    libraryManager.checkBook();
                    break;
            }
        }
    }
}
