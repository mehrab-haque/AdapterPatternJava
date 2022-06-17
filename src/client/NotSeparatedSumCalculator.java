package client;

import adapter.SumCalculatorAdapter;

import java.io.File;
import java.io.IOException;

public class NotSeparatedSumCalculator implements SumCalculatorNew {

    private SumCalculatorAdapter sumCalculatorAdapter;

    public NotSeparatedSumCalculator(){
        this.sumCalculatorAdapter= new SumCalculatorAdapter();
    }

    @Override
    public int calculateSumNotSeparated(File file) throws IOException {
        return sumCalculatorAdapter.calculateSumNotSeparated(file);
    }
}
