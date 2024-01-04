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
        // Implementation remains the same as in the previous code
    }

    private double performOperation(String operator) {
        // Implementation remains the same as in the previous code
    }

    public static void main(String[] args) {
        RPNCalculatorFrame calculatorFrame = new RPNCalculatorFrame();
    }
}
