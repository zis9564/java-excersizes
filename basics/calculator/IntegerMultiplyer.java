package calculator;

import javax.naming.spi.DirStateFactory.Result;

public class IntegerMultiplyer extends AbstractCalculator<Integer> { 

    public IntegerMultiplyer() {
        super.FIRST_ARG_NAME = "multiplicand argument";
        super.SECOND_ARG_NAME = "multiplier argument";
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
        Integer result;
        try {
            result = Math.multiplyExact(a, b);
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
           System.out.println("Result is out of integer range.");
        }
    }
}