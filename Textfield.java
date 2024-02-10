import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class Textfield extends JFrame implements ActionListener
{   
    
    JTextField jtf;
    JLabel jlab;
    Textfield()
    {
        JFrame jfrm = new JFrame("TextField implementation");
        jfrm.setSize(200,200);
        jfrm.setLayout(new FlowLayout());
        jtf = new JTextField(20);
        jlab = new JLabel("Sample text");
        jfrm.add(jlab);
        jtf.addActionListener(this);
        jfrm.setVisible(true);
        jfrm.add(jlab);
        jfrm.add(jtf);
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        jlab.setText(jtf.getText());
    }

    public static void main(String args[])
    {
        new Textfield();
    }
    
}
