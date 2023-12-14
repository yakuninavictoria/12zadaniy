package Ex1.Factory;

import Ex1.Domain.Furniture;
import Ex1.Domain.Table;

public class TableFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        Table table = new Table();
        return table;
    }
}
