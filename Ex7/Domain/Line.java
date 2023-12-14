package Ex7.Domain;

public class Line extends Figure{
    private Integer length;

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Круг: \n" +
                "\tцвет = " + this.getColor() +
                "\n\tкоордината x = " + this.getxValue() +
                "\n\tкоордината y = " + this.getyValue() +
                "\n\tдлина = " + this.length + "\n";
    }
}
