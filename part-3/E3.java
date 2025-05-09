import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E3 extends JFrame implements ActionListener {
    private JPanel colorPanel;
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;

    public E3() {
        setTitle("Theme Color Selector");

        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");

        redButton.setActionCommand("RED");
        greenButton.setActionCommand("GREEN");
        blueButton.setActionCommand("BLUE");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "RED":
                colorPanel.setBackground(Color.RED);
                break;
            case "GREEN":
                colorPanel.setBackground(Color.GREEN);
                break;
            case "BLUE":
                colorPanel.setBackground(Color.BLUE);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E3().setVisible(true));
    }
}
