public class CalculatorMain {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        CalculatorInterface calculatorInterface = new LocalCalculator();//ask user about which calculator he want to use
        do {
            Formula formula = reader.readNext();
            if (formula.getSign() == "+".charAt(0))
                calculatorInterface.combine(formula.getX(), formula.getY());
            if (formula.getSign() == "-".charAt(0))
                calculatorInterface.deduct(formula.x, formula.y);
            if (formula.getSign() == "*".charAt(0))
                calculatorInterface.multiply(formula.x,formula.y);
            if (formula.getSign() == "/".charAt(0))
                calculatorInterface.divide(formula.x,formula.y);
            System.out.println(formula.result);


        } while (reader.hasNext());



    }
}
