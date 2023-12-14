package Ex11;

import Ex11.Domain.Report;

public class Ex11Main {
    public static void main(String[] args) {
        Report report = new Report("PDF", "03.12.2023", "Hello World");
        System.out.println(report.toString());
        Report report1 = report.clone();
        System.out.println(report1.toString());
    }
}
