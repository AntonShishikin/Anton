import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MatchResults extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private JButton milanButton = new JButton("AC Milan");
    private JButton madridButton = new JButton("Real Madrid");
    private JLabel resultLabel = new JLabel("Result: 0 X 0");
    private JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    private JLabel winnerLabel = new JLabel("Winner: DRAW");

    public MatchResults() {
        super("Match Results");
        setSize(400, 200);
        setLayout(new GridLayout(5, 1));

        milanButton.addActionListener(e -> {
            milanScore++;
            updateScore("AC Milan");
        });

        madridButton.addActionListener(e -> {
            madridScore++;
            updateScore("Real Madrid");
        });

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updateScore(String team) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + team);
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new MatchResults();
    }
}
