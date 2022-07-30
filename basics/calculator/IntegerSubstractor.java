package calculator;

public class IntegerSubstractor extends AbstractCalculator<Integer> {

    public IntegerSubstractor() {
        super.FIRST_ARG_NAME = "first number";
        super.SECOND_ARG_NAME = "second number";
    }

    @Override
    public boolean hasValidArgument() {
        return scanner.hasNextInt();
    }

    @Override
    public Integer getValueFromScanner() {
        return scanner.nextInt();
    }

    @Override
    public void printResultLine() {
        Long result = a.longValue() - b.longValue();
        if (result > Integer.MAX_VALUE
        || result < Integer.MIN_VALUE) {
            System.out.println("Result is out of integer range.");
        } else {
            System.out.println("Result = " + result);
        }
    }
}