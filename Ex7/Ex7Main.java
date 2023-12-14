package Ex7;

import Ex7.Builders.CircleBuilder;
import Ex7.Builders.LineBuilder;
import Ex7.Builders.RectangleBuilder;
import Ex7.Domain.Figure;

import java.util.Scanner;

public class Ex7Main {
    public static void main(String[] args) {
        CircleBuilder circleBuilder= new CircleBuilder();
        LineBuilder lineBuilder = new LineBuilder();
        RectangleBuilder rectangleBuilder = new RectangleBuilder();

        Scanner scanner = new Scanner(System.in);

        Figure figure;

        System.out.println("Какую фигуру вы хотите создать?\n" +
                "1) круг;\n" +
                "2) прямоугольник;\n" +
                "3) линию;");
        Integer select = scanner.nextInt();

        System.out.print("Введите цвет: ");
        scanner.nextLine();
        String color = scanner.nextLine();
        System.out.print("Введите координату x: ");
        Integer x = scanner.nextInt();
        System.out.print("Введите координату y: ");
        Integer y = scanner.nextInt();

        switch (select) {
            case 1:
                circleBuilder.reset();
                circleBuilder.setColor(color);
                circleBuilder.setCoordinates(x, y);
                System.out.print("Введите радиус: ");
                circleBuilder.setRadius(scanner.nextInt());
                figure = circleBuilder.getResult();
                System.out.println(figure.toString());
                break;
            case 2:
                rectangleBuilder.reset();
                rectangleBuilder.setColor(color);
                rectangleBuilder.setCoordinates(x, y);
                System.out.print("Введите ширину: ");
                rectangleBuilder.setWidth(scanner.nextInt());
                System.out.print("Введите высоту: ");
                rectangleBuilder.setHeight(scanner.nextInt());
                figure = rectangleBuilder.getResult();
                System.out.println(figure.toString());
                break;
            case 3:
                lineBuilder.reset();
                lineBuilder.setColor(color);
                lineBuilder.setCoordinates(x, y);
                System.out.print("Введите длину: ");
                lineBuilder.setLength(scanner.nextInt());
                figure = lineBuilder.getResult();
                System.out.println(figure.toString());
                break;
        }
    }
}
