package practice24;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageDocument implements IDocument{

    public ImageDocument() throws IOException {
        Files.createFile(Path.of("C:\\Users\\Mikhail\\Documents\\source\\repos\\NewPracs\\src\\practice24\\image.png"));
        System.out.println("Был создан png файл");
    }
}
