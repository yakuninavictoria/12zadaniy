package Ex7.Builders;

import Ex7.Domain.Line;

public class LineBuilder implements Builder<Line> {
    private Line line;

    @Override
    public void reset() {
        line = new Line();
    }

    @Override
    public void setColor(String color) {
        line.setColor(color);
    }

    @Override
    public void setCoordinates(Integer xValue, Integer yValue) {
        line.setxValue(xValue);
        line.setyValue(yValue);
    }

    public void setLength(Integer length) {
        line.setLength(length);
    }

    @Override
    public Line getResult() {
        return line;
    }
}
