package pro.sky.ticket9;
import java.io.File;
import java.io.FileNotFoundException;

public class Task {
    public static void check(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        if (file.isDirectory()) {
            throw new IllegalArgumentException(file.getPath() + " is a directory");
        }
    }
    public static void checkFile(String path) {
        File file = new File(path);
        try {
            check(file);
        } catch (FileNotFoundException|IllegalArgumentException e) {
            System.out.println("Файл по пути " + path + " не найден");
        }
        System.out.println("Проверка завершена");
    }
}
