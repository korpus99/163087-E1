package Z3;

import java.io.File;

public class zad3 {
    public static void main(String[] args) {
        String path ="src/Z3";
        String[] files = fileList(path, ".ppk");
        for (String s:files) {
            System.out.println(s);
        }
    }

    public static String[] fileList(String path, String extension) {
        File file = new File(path);
        return file.list(((dir, name) -> !name.endsWith(extension)));
    }
}
