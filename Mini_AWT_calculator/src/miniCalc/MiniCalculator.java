package miniCalc;
import java.awt.*;
import java.awt.event.*;

public class MiniCalculator extends Frame implements ActionListener {
    private TextField num1Field, num2Field, resultField;
    private Choice operationChoice;
    private Button calculateButton;

    public MiniCalculator() {
        // Set up the frame
        setTitle("Mini Calculator");
        setSize(400, 200);
        setLayout(new GridLayout(5, 2));

        // Input fields for numbers
        add(new Label("Number 1:"));
        num1Field = new TextField();
        add(num1Field);

        add(new Label("Number 2:"));
        num2Field = new TextField();
        add(num2Field);

        // Operation choice
        add(new Label("Operation:"));
        operationChoice = new Choice();
        operationChoice.add("+");
        operationChoice.add("-");
        operationChoice.add("*");
        operationChoice.add("/");
        add(operationChoice);

        // Calculate button
        calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        // Result field
        add(new Label("Result:"));
        resultField = new TextField();
        resultField.setEditable(false);
        add(resultField);

        // Close window handler
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse numbers
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            String operation = operationChoice.getSelectedItem();

            // Perform operation
            double result;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        resultField.setText("Error: Division by 0");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    resultField.setText("Error: Invalid Operation");
                    return;
            }

            // Display result
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Error: Invalid Input");
        }
    }


}

