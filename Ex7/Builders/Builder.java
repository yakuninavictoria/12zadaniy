package Ex7.Builders;

public interface Builder<T> {
    public void reset();
    public void setColor(String color);
    public void setCoordinates(Integer xValue, Integer yValue);
    public T getResult();
}
