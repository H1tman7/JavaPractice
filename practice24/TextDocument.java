package practice24;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextDocument implements IDocument{

    public TextDocument() throws IOException {
        Files.createFile(Path.of("C:\\Users\\Mikhail\\Documents\\source\\repos\\NewPracs\\src\\practice24\\text.txt"));
        System.out.println("Был создан txt файл");
    }
}
