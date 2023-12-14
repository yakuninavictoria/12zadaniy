package Ex1.Factory;

import Ex1.Domain.Dresser;
import Ex1.Domain.Furniture;

public class DresserFactory implements FurnitureFactory{

    @Override
    public Furniture createFurniture() {
        Dresser dresser = new Dresser();
        return dresser;
    }
}
