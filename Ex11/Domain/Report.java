package Ex11.Domain;

public class Report implements Prototype<Report>{
    private String type;
    private String date;
    private String data;

    public Report(String type, String date, String data) {
        this.type = type;
        this.date = date;
        this.data = data;
    }

    @Override
    public Report clone() {
        return new Report(type, date, data);
    }

    @Override
    public String toString() {
        return "Report{" +
                "type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
