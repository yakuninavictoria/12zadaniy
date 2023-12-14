package Ex12.Domain;

public class File implements Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public Integer count() {
        return 1;
    }
}
