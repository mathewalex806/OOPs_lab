import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TrafficLight extends JFrame implements ActionListener {
    private JButton redButton, yellowButton, greenButton;
    private JPanel lightPanel;

    public TrafficLight() {
        setTitle("Traffic Light");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        lightPanel = new JPanel();
        lightPanel.setBackground(Color.BLACK);
        add(lightPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        redButton = new JButton("Red");
        yellowButton = new JButton("Yellow");
        greenButton = new JButton("Green");

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            lightPanel.setBackground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            lightPanel.setBackground(Color.YELLOW);
        } else if (e.getSource() == greenButton) {
            lightPanel.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}
