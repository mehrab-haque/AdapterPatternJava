import client.NotSeparatedSumCalculator;
import client.SumCalculatorNew;
import legacy.SpaceSeparatedSumCalculator;
import legacy.SumCalculator;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //legacy class test
        SumCalculator sumCalculator=new SpaceSeparatedSumCalculator();
        File file=new File("src/res/spacedInput.txt");
        int sum=sumCalculator.calculateSumSpaceSeparated(file);
        System.out.println(sum);

        //adapter class test
        SumCalculatorNew sumCalculatorNew=new NotSeparatedSumCalculator();
        File newFile=new File("src/res/nottedInput.txt");
        int newSum=sumCalculatorNew.calculateSumNotSeparated(newFile);
        System.out.println(newSum);
    }
}
