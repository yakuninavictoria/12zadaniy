package Ex4.Adapters;

import Ex4.Domain.Application;
import Ex4.Domain.WOFF;
import Ex4.Domain.WOFF2;

public class WOFFAdapter {
    Application application;

    public WOFFAdapter(Application application) {
        this.application = application;
    }

    public void WOFFToWOFF2(WOFF font) {
        //�������� ����� woff ����������� � woff2
        WOFF2 newFont = new WOFF2();
        application.render(newFont);
    }
}
