package calculator;

public class IntegerAdditionner extends AbstractCalculator<Integer> {

    public IntegerAdditionner() {
        super.FIRST_ARG_NAME = "first addendum";
        super.SECOND_ARG_NAME = "second addendum";
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
        Long result = Long.sum(a.longValue(), b.longValue());
        if (result > Integer.MAX_VALUE
        || result < Integer.MIN_VALUE) {
            System.out.println("Result is out of integer range.");
        } else {
            System.out.println("Result = " + result);
        }
    }
}