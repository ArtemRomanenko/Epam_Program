import java.text.Normalizer;

public class LocalCalculator implements CalculatorInterface {
    ConsoleReader consoleReader = new ConsoleReader();
    Formula formula = consoleReader.readNext();

    public Double combine(Double x, Double y) {
        double result = formula.getX()+formula.getY();
        System.out.println("result =" + result);
        return result;
    }

    public Double deduct(Double x, Double y) {
        return null;
    }

    public Double multiply(Double x, Double y) {
        return null;
    }

    public Double divide(Double x, Double y) {
        return null;
    }
}
