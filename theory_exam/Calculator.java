import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator extends JFrame implements ActionListener
{
    JLabel result;
    JTextField text1;
    JTextField text2;
    JTextField jtf;
    Calculator()
    {
        JFrame jfrm = new JFrame("Calculator");
        jfrm.setSize(200,300);
        jfrm.setVisible(true);
        JLabel jlab = new JLabel("Calculator");
        jfrm.setLayout(new FlowLayout());
        jfrm.add(jlab);

         text1 = new JTextField(20);
         text2 = new JTextField(20);
         jtf.addActionListener(this);

        jfrm.add(text1);
        jfrm.add(text2);

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        plus.addActionListener(this);
        minus.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();
        switch (s)
        {
            case "+":
                jtf.setText(String.valueOf(Integer.parseInt(text1.getText()) + Integer.parseInt(text2.getText())));
                break;
            case "-":
                jtf.setText(String.valueOf(Integer.parseInt(text1.getText()) - Integer.parseInt(text2.getText())));
                break;
            case "*":
                jtf.setText(String.valueOf(Integer.parseInt(text1.getText()) * Integer.parseInt(text2.getText())));
                break;
            case "/":
                jtf.setText(String.valueOf(Integer.parseInt(text1.getText()) / Integer.parseInt(text2.getText())));
                break;
        }
    }

    public static void main(String args[])
    {
        new Calculator();
    }
    
}
