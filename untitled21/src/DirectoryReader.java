import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryReader {
    public static List<String> getFirstFiveFiles(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        List<String> fileList = new ArrayList<>();

        if (files != null) {
            for (int i = 0; i < Math.min(files.length, 5); i++) {
                fileList.add(files[i].getName());
            }
        }

        return fileList;
    }
}
