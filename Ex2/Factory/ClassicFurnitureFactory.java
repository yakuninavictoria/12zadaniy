package Ex2.Factory;

import Ex2.Domain.Chair;
import Ex2.Domain.ClassicChair;
import Ex2.Domain.ClassicTable;
import Ex2.Domain.Table;

public class ClassicFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
