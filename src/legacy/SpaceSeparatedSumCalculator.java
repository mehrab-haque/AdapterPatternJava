package legacy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class SpaceSeparatedSumCalculator implements SumCalculator{
    @Override
    public int calculateSumSpaceSeparated(File file) throws IOException {
        FileInputStream fileStream = new FileInputStream(file);
        int content;
        String fileBody="";
        while ((content = fileStream.read()) != -1) {
            fileBody += (char) content;
        }
        int sum=0;
        String[] integerTokens=fileBody.split(" ");
        for(String s:integerTokens)
            sum+=Integer.parseInt(s);
        return sum;
    }
}
