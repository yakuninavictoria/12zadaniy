package Ex7.Domain;

public abstract class Figure {
    private String color;
    private Integer xValue;
    private Integer yValue;

    public String getColor() {
        return color;
    }

    public Integer getxValue() {
        return xValue;
    }

    public Integer getyValue() {
        return yValue;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setxValue(Integer xValue) {
        this.xValue = xValue;
    }

    public void setyValue(Integer yValue) {
        this.yValue = yValue;
    }
}
