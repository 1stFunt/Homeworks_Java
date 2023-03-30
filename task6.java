// Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат

import java.io.File;

public class task6 {
    public static void main(String[] args) {
        File folder = new File(".");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                String extension = getFileExtension(file);
                System.out.println("Расширение файла: " + extension);
            }
        }
    }

    public static String getFileExtension(File file) {
        String extension = "";
        String name = file.getName();
        int lastIndexOfDot = name.lastIndexOf(".");
        if (lastIndexOfDot > 0 && lastIndexOfDot < name.length() - 1) {
            extension = name.substring(lastIndexOfDot + 1);
        }
        return extension;
    }
}