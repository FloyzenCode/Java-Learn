import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileAndDirectoryManager {

    public static void main(String[] args) {
        String sourcePath = "path/to/source"; // Путь исходного файла или директории
        String destinationPath = "path/to/destination"; // Путь целевой директории

        // Создание новой директории
        createDirectory("path/to/new/directory");

        // Удаление файла или директории
        deleteFileOrDirectory(sourcePath);

        // Копирование файла или директории
        copyFileOrDirectory(sourcePath, destinationPath);

        // Перемещение файла или директории
        moveFileOrDirectory(sourcePath, destinationPath);
    }

    public static void createDirectory(String path) {
        File directory = new File(path);

        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Директория создана: " + path);
            } else {
                System.out.println("Не удалось создать директорию: " + path);
            }
        }
    }

    public static void deleteFileOrDirectory(String path) {
        File fileOrDirectory = new File(path);

        if (fileOrDirectory.exists()) {
            if (fileOrDirectory.delete()) {
                System.out.println("Файл или директория удалены: " + path);
            } else {
                System.out.println("Не удалось удалить файл или директорию: " + path);
            }
        } else {
            System.out.println("Файл или директория не существует: " + path);
        }
    }

    public static void copyFileOrDirectory(String sourcePath, String destinationPath) {
        File source = new File(sourcePath);
        File destination = new File(destinationPath);

        try {
            if (source.isDirectory()) {
                copyDirectory(source, destination);
            } else {
                copyFile(source, destination);
            }
            System.out.println("Файл или директория скопированы из " + sourcePath + " в " + destinationPath);
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла или директории");
            e.printStackTrace();
        }
    }

    public static void copyFile(File source, File destination) throws IOException {
        FileInputStream inputStream = new FileInputStream(source);
        FileOutputStream outputStream = new FileOutputStream(destination);

        byte[] buffer = new byte[1024];
        int length;

        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }

        inputStream.close();
        outputStream.close();
    }

    public static void copyDirectory(File source, File destination) throws IOException {
        if (!destination.exists()) {
            destination.mkdirs();
        }

        String[] files = source.list();

        if (files != null) {
            for (String file : files) {
                File sourceFile = new File(source, file);
                File destinationFile = new File(destination, file);
                copyFileOrDirectory(sourceFile.getAbsolutePath(), destinationFile.getAbsolutePath());
            }
        }
    }

    public static void moveFileOrDirectory(String sourcePath, String destinationPath) {
        File source = new File(sourcePath);
        File destination = new File(destinationPath);

        if (source.renameTo(destination)) {
            System.out.println("Файл или директория перемещены из " + sourcePath + " в " + destinationPath);
        } else {
            System.out.println("Не удалось переместить файл или директорию из " + sourcePath + " в " + destinationPath);
        }
    }
}
