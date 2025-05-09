import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E1 extends JFrame implements ActionListener {
    private JLabel counterLabel;
    private JButton clickButton;
    private int count = 0;

    public E1() {
        setTitle("Click Counter");
        Font font = new Font("Segoe UI", Font.BOLD, 15);

        counterLabel = new JLabel("Clicks: 0", SwingConstants.CENTER);
        counterLabel.setFont(font);

        clickButton = new JButton("Click Me");
        clickButton.setFont(font);
        clickButton.addActionListener(this);

        setLayout(new BorderLayout());
        add(counterLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);

        setSize(400, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        counterLabel.setText("Clicks: " + count);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E1().setVisible(true));
    }
}
