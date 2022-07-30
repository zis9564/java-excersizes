package calculator;

import java.util.Scanner;

public abstract class AbstractCalculator<T extends Number> implements Calculator<T> {

    protected String FIRST_ARG_NAME;
    protected String SECOND_ARG_NAME;
    protected Scanner scanner;
    protected T a;
    protected T b;

    @Override
    public void calculate() {
        openScanner();
        if (a == null) {
            a = defineArgument(FIRST_ARG_NAME);
        } 
        if (b == null) {
            b = defineArgument(SECOND_ARG_NAME);
        }
        closeScanner();
        printResultLine();
    }

    @Override
    public T defineArgument(String argName) {
        printInputLine(argName);
        if (hasValidArgument()) {
            return getValueFromScanner();
        }
        return defineArgument(argName);
    }

    @Override
    public abstract boolean hasValidArgument();

    @Override
    public void printInputLine(String arg) {
        System.out.println("\nInput " +arg+ ":");
    }

    @Override
    public abstract void printResultLine();

    @Override
    public void openScanner() {
        scanner = new Scanner(System.in);
    }

    @Override
    public abstract T getValueFromScanner();

    @Override
    public void closeScanner() {
        scanner.close();
    }
}
