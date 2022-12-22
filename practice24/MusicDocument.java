package practice24;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MusicDocument implements IDocument{

    public MusicDocument() throws IOException {
        Files.createFile(Path.of("C:\\Users\\Mikhail\\Documents\\source\\repos\\NewPracs\\src\\practice24\\audio.mp3"));
        System.out.println("Был создан mp3 файл");
    }
}

