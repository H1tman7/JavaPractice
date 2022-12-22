package practice24;
import java.io.IOException;

public class Factory {
    public static IDocument getDocument(ICreateDocument document) throws IOException {
        return document.createDocument();
    }
}
