package Ex2.Factory;

import Ex2.Domain.Chair;
import Ex2.Domain.Table;

public interface FurnitureFactory {
    public Chair createChair();
    public Table createTable();
}
