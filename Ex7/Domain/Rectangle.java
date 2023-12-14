package Ex7.Domain;

public class Rectangle extends Figure{
    private Integer width;
    private Integer height;

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Круг: \n" +
                "\tцвет = " + this.getColor() +
                "\n\tкоордината x = " + this.getxValue() +
                "\n\tкоордината y = " + this.getyValue() +
                "\n\tширина = " + this.width +
                "\n\tвысота = " + this.height + "\n";
    }
}
