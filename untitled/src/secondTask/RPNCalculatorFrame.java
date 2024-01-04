package secondTask;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RPNCalculatorFrame extends JFrame {
    private JTextField displayField;
    private JTextField inputField;
    private JPanel buttonGrid;
    private JButton[] buttons;
    private Stack<Double> numberStack = new Stack<>();
    private StringBuilder expressionBuilder = new StringBuilder();

    public RPNCalculatorFrame() {
        this.setTitle("RPN Calculator");
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);

        displayField = new JTextField(30);
        displayField.setEditable(true);
        this.add(displayField, "North");

        inputField = new JTextField(30);
        inputField.setEditable(false);
        this.add(inputField, "South");

        buttonGrid = new JPanel();
        buttonGrid.setLayout(new GridLayout(5, 7, 3, 3));

        String[] buttonLabels = {
                "C", "/", "*", "Back", "7", "8", "9", "-",
                "4", "5", "6", "+", "1", "2", "3", "%",
                "0", ".", "=", "Space"
        };

        buttons = new JButton[buttonLabels.length];
        ButtonListener listener = new ButtonListener();

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(listener);
            configureButtonAppearance(buttons[i], buttonLabels[i]);
            buttonGrid.add(buttons[i]);
        }

        this.add(buttonGrid);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void configureButtonAppearance(JButton button, String label) {
        button.setBackground(Color.LIGHT_GRAY);
        if (label.equals("=")) button.setBackground(Color.RED);
        else if (CalculatorUtils.isNumeric(label)) button.setBackground(Color.WHITE);
        else if (label.equals("Back")) button.setBackground(Color.GRAY);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            processCalculatorInput(command);
            inputField.setText(expressionBuilder.toString());
        }
    }

    private void processCalculatorInput(String command) {
        if (CalculatorUtils.isNumeric(command)) {
            double number = Double.parseDouble(command);
            numberStack.push(number);
            expressionBuilder.append(command);
        } else if (CalculatorUtils.isOperator(command)) {
            if (numberStack.size() >= 2) {
                double result = performOperation(command);
                numberStack.push(result);
                expressionBuilder.append(" ").append(command);
            }
        } else if (command.equals("=")) {
            if (!numberStack.isEmpty()) {
                double result = numberStack.pop();
                displayField.setText(CalculatorUtils.getPrettyNumber(Double.toString(result)));
                expressionBuilder.append(" = ").append(CalculatorUtils.getPrettyNumber(Double.toString(result)));
            }
        }else if (command.equals("Back")) {
            if (!numberStack.isEmpty()) {
                numberStack.pop();
                if (!numberStack.isEmpty()) {
                    double result = numberStack.peek();
                    displayField.setText(CalculatorUtils.getPrettyNumber(Double.toString(result)));

                    int lastSpaceIndex = expressionBuilder.lastIndexOf(" ");
                    if (lastSpaceIndex != -1) {
                        expressionBuilder.delete(lastSpaceIndex, expressionBuilder.length());
                    } else {
                        expressionBuilder.setLength(0); // Reset the builder if no space is found
                    }
                } else {
                    displayField.setText("");
                    expressionBuilder.setLength(0);
                }
            }
        }
        else if (command.equals("C")) {
            numberStack.clear();
            displayField.setText("");
            expressionBuilder.setLength(0);
        } else if (command.equals("Back")) {
            if (!numberStack.isEmpty()) {
                numberStack.pop();
                if (!numberStack.isEmpty()) {
                    double result = numberStack.peek();
                    displayField.setText(CalculatorUtils.getPrettyNumber(Double.toString(result)));
                    int lastSpaceIndex = expressionBuilder.lastIndexOf(" ");
                    expressionBuilder.delete(lastSpaceIndex, expressionBuilder.length());
                } else {
                    displayField.setText("");
                    expressionBuilder.setLength(0);
                }
            }
        }
    }


    private double performOperation(String operator) {
        if (numberStack.size() < 2) {
            return 0;
        }

        double secondOperand = numberStack.pop();
        double firstOperand = numberStack.pop();

        switch (operator) {
            case "+":
                return firstOperand + secondOperand;
            case "-":
                return firstOperand - secondOperand;
            case "*":
                return firstOperand * secondOperand;
            case "/":
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    displayField.setText("Error: Division by Zero");
                    return 0;
                }
            default:
                displayField.setText("Error: Invalid Operation");
                return 0;
        }
    }


    public static void main(String[] args) {
        RPNCalculatorFrame calculatorFrame = new RPNCalculatorFrame();
    }
}
