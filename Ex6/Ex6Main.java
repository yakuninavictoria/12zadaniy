package Ex6;

import Ex6.Domain.Document;
import Ex6.Domain.GraphicDocument;
import Ex6.Domain.TableDocument;
import Ex6.Domain.TextDocument;

public class Ex6Main {
    public static void main(String[] args) {
        Document textDocument = new TextDocument();
        Document graphicDocument = new GraphicDocument();
        Document tableDocument = new TableDocument();

        textDocument.start();
        graphicDocument.start();
        tableDocument.start();
    }
}
