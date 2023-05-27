import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

public class Main {
    public static void main(String[] args) {
        String dirname = "\\MyDir"; // your directory
        System.out.println("Tree directory, starting in " + dirname + ":\n");
        try {
            Files.walkFileTree(Path.of(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("Error Input-Output!");
        }
    }
}