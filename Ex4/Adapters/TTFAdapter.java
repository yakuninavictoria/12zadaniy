package Ex4.Adapters;

import Ex4.Domain.Application;
import Ex4.Domain.TTF;
import Ex4.Domain.WOFF2;

public class TTFAdapter {
    Application application;

    public TTFAdapter(Application application) {
        this.application = application;
    }

    public void TTFToWOFF2(TTF font) {
        //Допустим здесь ttf переводится в woff2
        WOFF2 newFont = new WOFF2();
        application.render(newFont);
    }
}
