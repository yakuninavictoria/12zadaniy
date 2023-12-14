package Ex2.Factory;

import Ex2.Domain.Chair;
import Ex2.Domain.ModernChair;
import Ex2.Domain.ModernTable;
import Ex2.Domain.Table;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
