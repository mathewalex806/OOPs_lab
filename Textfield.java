import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class Textfield extends JFrame implements ActionListener
{   
    
    JTextField jtf,jtf1;
    JLabel jlab;
    Textfield()
    {
        JFrame jfrm = new JFrame("TextField implementation");
        jfrm.setSize(200,200);
        jfrm.setLayout(new FlowLayout());
        jfrm.setVisible(true);

        jlab = new JLabel("Sample text");
        jfrm.add(jlab);

        jtf = new JTextField(20);
        jfrm.add(jlab);
        jfrm.add(jtf);

        jtf1 = new JTextField(20);
        jfrm.add(jlab);
        jfrm.add(jtf1);
        
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        plus.addActionListener(this);
        minus.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        
        jfrm.add(plus);
        jfrm.add(minus);
        jfrm.add(mul);
        jfrm.add(div);

        
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();
        switch (s)
        {
            case ("+"):
                int i = Integer.parseInt(jtf.getText());
                int j = Integer.parseInt(jtf1.getText());
                jlab.setText(String.valueOf(i+j));
                break;

            case ("-"):
            int i1 = Integer.parseInt(jtf.getText());
            int j1 = Integer.parseInt(jtf1.getText());
            jlab.setText(String.valueOf(i1-j1));
            break;

            case ("*"):
                int i2 = Integer.parseInt(jtf.getText());
                int j2 = Integer.parseInt(jtf1.getText());
                jlab.setText(String.valueOf(i2*j2));
                break;
            
                case ("/"):
                int i3 = Integer.parseInt(jtf.getText());
                int j3 = Integer.parseInt(jtf1.getText());
                jlab.setText(String.valueOf(i3/j3));
                break;

        }
    }

    public static void main(String args[])
    {
        new Textfield();
    }
    
}
