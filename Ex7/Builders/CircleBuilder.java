package Ex7.Builders;

import Ex7.Domain.Circle;

public class CircleBuilder implements Builder<Circle>{
    private Circle circle;

    @Override
    public void reset() {
        circle = new Circle();
    }

    @Override
    public void setColor(String color) {
        circle.setColor(color);
    }

    @Override
    public void setCoordinates(Integer xValue, Integer yValue) {
        circle.setxValue(xValue);
        circle.setyValue(yValue);
    }

    public void setRadius(Integer radius) {
        circle.setRadius(radius);
    }

    @Override
    public Circle getResult() {
        return circle;
    }
}
