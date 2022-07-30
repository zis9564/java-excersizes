package calculator;

public class IntegerDivider extends AbstractCalculator<Integer> { 

    private Integer tempValue;
    
    public IntegerDivider() {
        super.FIRST_ARG_NAME = "dividend";
        super.SECOND_ARG_NAME = "divisor";
    }

    @Override
    public boolean hasValidArgument() {
        if (scanner.hasNextInt()) {
            return checkDivisorByZero();
        }
        return false;
    }

    private boolean checkDivisorByZero() {
        tempValue = scanner.nextInt();
        if (a != null && tempValue == 0) {
            System.out.println("Division by zero is not allowed.");
            return false;
        }
        return true;
    }

    @Override
    public Integer getValueFromScanner() {
        return tempValue; // special solution for the division operation
    }

    @Override
    public void printResultLine() {
        System.out.println("Result = " +  a.doubleValue() / b.doubleValue());
    }
}
