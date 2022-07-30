package calculator;

public class Main {

    public static void main(String[] args) {
        Calculator<Integer> calculator = new IntegerAdditionner();
        //Calculator<Integer> calculator = new IntegerSubstractor();
        //Calculator<Integer> calculator = new IntegerMultiplyer();
        //Calculator<Integer> calculator = new IntegerDivider();
        calculator.calculate();
    }
}