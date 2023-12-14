package Ex4;

import Ex4.Adapters.OTFAdapter;
import Ex4.Adapters.TTFAdapter;
import Ex4.Adapters.WOFFAdapter;
import Ex4.Domain.*;

import java.util.Scanner;

public class Ex4Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Application application = new Application();

        System.out.println("Какой файл вы хотите подать программе?\n" +
                "1) TTF;\n" +
                "2) OTF;\n" +
                "3) WOFF;\n" +
                "4) WOFF2;");
        Integer select = scanner.nextInt();
        switch (select) {
            case 1:
                TTF fontTTF = new TTF();
                TTFAdapter ttfAdapter = new TTFAdapter(application);
                ttfAdapter.TTFToWOFF2(fontTTF);
                break;
            case 2:
                OTF fontOTF = new OTF();
                OTFAdapter otfAdapter = new OTFAdapter(application);
                otfAdapter.OTFToWOFF2(fontOTF);
                break;
            case 3:
                WOFF fontWOFF = new WOFF();
                WOFFAdapter woffAdapter = new WOFFAdapter(application);
                woffAdapter.WOFFToWOFF2(fontWOFF);
                break;
            case 4:
                WOFF2 fontWOFF2 = new WOFF2();
                application.render(fontWOFF2);
                break;
        }
    }
}
