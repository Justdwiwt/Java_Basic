package test_07_29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CountJavaFile {
    private static int count = 0;

    public static void main(String[] args) {
        File file = new File("E:\\eclipse test");
        countJavaLine(file);
        System.out.println(count);
    }

    @SuppressWarnings("ConstantConditions")
    private static void countJavaLine(File file) {
        if (file == null) throw new NullPointerException();
        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            Arrays.stream(fs).forEachOrdered(CountJavaFile::countJavaLine);
        } else if (file.getName().endsWith(".java"))
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                while (reader.readLine() != null)
                    count++;
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
