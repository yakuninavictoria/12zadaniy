package Ex7.Builders;

import Ex7.Domain.Rectangle;

public class RectangleBuilder implements Builder<Rectangle>{
    private Rectangle rectangle;


    @Override
    public void reset() {
        rectangle = new Rectangle();
    }

    @Override
    public void setColor(String color) {
        rectangle.setColor(color);
    }

    @Override
    public void setCoordinates(Integer xValue, Integer yValue) {
        rectangle.setxValue(xValue);
        rectangle.setyValue(yValue);
    }

    public void setWidth(Integer width) {
        rectangle.setWidth(width);
    }

    public void setHeight(Integer height) {
        rectangle.setHeight(height);
    }

    @Override
    public Rectangle getResult() {
        return rectangle;
    }
}
