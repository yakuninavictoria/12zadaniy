package Ex7.Domain;

public class Circle extends Figure{
    private Integer radius;

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Круг: \n" +
                "\tцвет = " + this.getColor() +
                "\n\tкоордината x = " + this.getxValue() +
                "\n\tкоордината y = " + this.getyValue() +
                "\n\tрадиус = " + this.radius + "\n";
    }
}
