package Ex12.Domain;

import java.util.ArrayList;

public class Folder implements Component{
    private String name;
    private ArrayList<Component> innerSpace;

    public Folder(String name, ArrayList<Component> innerSpace) {
        this.name = name;
        this.innerSpace = innerSpace;
    }

    @Override
    public Integer count() {
        Integer sum = 0;
        for (Component c : innerSpace) {
            sum += c.count();
        }

        return sum;
    }
}
