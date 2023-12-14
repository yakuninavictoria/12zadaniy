package Ex1.Factory;

import Ex1.Domain.Chair;
import Ex1.Domain.Furniture;

public class ChairFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        Chair chair = new Chair();
        return chair;
    }
}
