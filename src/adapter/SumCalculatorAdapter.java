package adapter;

import client.SumCalculatorNew;
import legacy.SpaceSeparatedSumCalculator;
import legacy.SumCalculator;

import java.io.*;

public class SumCalculatorAdapter implements SumCalculatorNew {

    SumCalculator sumCalculator;

    public SumCalculatorAdapter(){
        sumCalculator=new SpaceSeparatedSumCalculator();
    }

    @Override
    public int calculateSumNotSeparated(File file) throws IOException {
        FileInputStream fileStream = new FileInputStream(file);
        int content;
        String fileBody="";
        while ((content = fileStream.read()) != -1) {
            char character=(char) content;
            if(character=='~')character=' ';
            fileBody += character;
        }
        File tempFile = File.createTempFile("data", ".txt");
        FileWriter fileWriter = new FileWriter(tempFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(fileBody);
        bufferedWriter.close();
        return sumCalculator.calculateSumSpaceSeparated(tempFile);
    }
}
