package Ex5;

import Ex5.Domain.Customer;
import Ex5.Domain.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Яблоко", 100));
        products.add(new Product("Арбуз", 500));
        products.add(new Product("Банан", 50));

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Джон"));
        customers.add(new Customer("Элизабет"));
        customers.add(new Customer("Майкл"));

        products.get(0).getEvents().subscribe(Event.DISCOUNT, customers.get(2));
        products.get(1).getEvents().subscribe(Event.DISCOUNT, customers.get(0));
        products.get(1).getEvents().subscribe(Event.DISCOUNT, customers.get(1));
        products.get(1).getEvents().subscribe(Event.DISCOUNT, customers.get(2));
        products.get(2).getEvents().subscribe(Event.DISCOUNT, customers.get(2));

        Integer select = -1;
        while (select != 0) {
            System.out.println("Что вы хотите сделать?\n" +
                    "1) Просмотреть список товаров;\n" +
                    "2) Установить скидку на товар;\n" +
                    "0) Выйти из программы;");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    for (Integer i = 0; i < products.size(); i++) {
                        System.out.println(i+1 + ") " + products.get(i).getTitle() + " - " + products.get(i).getPrice() + " руб");
                    }
                    break;
                case 2:
                    System.out.println("На какой товар вы хотите установить скидку?");
                    select = scanner.nextInt();
                    System.out.println("Какую скидку вы хотите установить? (%)");
                    Integer discount = scanner.nextInt();

                    System.out.println("На товар \"" + products.get(select-1).getTitle() + "\" установлена скидка " + discount + "%");

                    products.get(select-1).setDiscount(discount);

                    select = -1;
                    break;
            }
        }
    }
}
