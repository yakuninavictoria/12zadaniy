package Ex2.Factory;

import Ex2.Domain.Chair;
import Ex2.Domain.MinChair;
import Ex2.Domain.MinTable;
import Ex2.Domain.Table;

public class MinFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new MinChair();
    }

    @Override
    public Table createTable() {
        return new MinTable();
    }
}
