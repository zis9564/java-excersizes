package calculator;

public interface Calculator<T extends Number> {

    void calculate();
    T defineArgument(String argName);
    boolean hasValidArgument();
    void printInputLine(String arg);
    void printResultLine();
    void openScanner();
    T getValueFromScanner();
    void closeScanner();
    
}