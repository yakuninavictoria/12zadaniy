package Ex4.Adapters;

import Ex4.Domain.Application;
import Ex4.Domain.OTF;
import Ex4.Domain.WOFF2;

public class OTFAdapter {
    Application application;

    public OTFAdapter(Application application) {
        this.application = application;
    }

    public void OTFToWOFF2(OTF font) {
        //Допустим здесь otf переводится в woff2
        WOFF2 newFont = new WOFF2();
        application.render(newFont);
    }
}
