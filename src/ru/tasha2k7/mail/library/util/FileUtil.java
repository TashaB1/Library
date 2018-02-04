package ru.tasha2k7.mail.library.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Ната on 02.02.2018.
 */
public class FileUtil {
    public void clearFile(String path) {
        if ((new File(path)).exists()) {
            try {
                FileWriter fstream1 = new FileWriter(path);// конструктор с одним параметром - для перезаписи
                BufferedWriter out1 = new BufferedWriter(fstream1); //  создаём буферезированный поток
                out1.write(""); // очищаем, перезаписав поверх пустую строку
                out1.close(); // закрываем
            } catch (Exception e) {
                System.err.println("Error in file cleaning: " + e.getMessage());
            }
        }
    }

    public void writeFile(String strJson, String path) {
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write(strJson);
        } catch (IOException ex) {
            Logger.getLogger(FileUtil.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteAllFilesFolder(String path) {
        for (File myFile : new File(path).listFiles())
            if (myFile.isFile()) myFile.delete();
    }
}
