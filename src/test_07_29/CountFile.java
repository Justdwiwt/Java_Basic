package test_07_29;

import java.io.File;
import java.util.Arrays;

public class CountFile {
    private static int javaCount = 0;
    private static int classCount = 0;

    public static void main(String[] args) {
        File file = new File("E:\\eclipse test");
        countFile(file);
        System.out.println("java: " + javaCount);
        System.out.println("class: " + classCount);
    }

    @SuppressWarnings("ConstantConditions")
    private static void countFile(File file) {
        if (file == null)
            throw new NullPointerException();
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            Arrays.stream(files).forEachOrdered(CountFile::countFile);
        } else if (file.getName().endsWith(".java")) javaCount++;
        else if (file.getName().endsWith(".class")) classCount++;
    }
}
