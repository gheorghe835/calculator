import calculator.*;

public class Main {
    public static void main(String[] args) {

        ComplexNumber num1 = new ComplexNumber(4, 5);
        ComplexNumber num2 = new ComplexNumber(2, 3);

        ComplexOperation addOperation = new Addition();
        ComplexOperation mulOperation = new Multiplication();
        ComplexOperation divOperation = new Division();

        Logger logger = Logger.getInstance();

        ComplexNumber resultAdd = addOperation.execute(num1, num2);
        logger.log("Addition result: " + resultAdd);

        ComplexNumber resultMul = mulOperation.execute(num1, num2);
        logger.log("Multiplication result: " + resultMul);

        ComplexNumber resultDiv = divOperation.execute(num1, num2);
        logger.log("Division result: " + resultDiv);
    }
}