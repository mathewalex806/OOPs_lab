import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHandling extends JFrame implements ActionListener
{
    JLabel jlab;
    EventHandling()
    {
        JFrame jfrm = new JFrame("An Event Example");
        jfrm.setLayout(new BorderLayout());
        jfrm.setSize(300,300);
        JButton jbtn1 = new JButton("OK");
        JButton jbn2 = new JButton("Cancel");
        jbtn1.addActionListener(this);
        jbn2.addActionListener(this);
        jfrm.add(jbtn1, BorderLayout.WEST);
        jfrm.add(jbn2, BorderLayout.EAST);
         jlab = new JLabel("Press any button");
        jfrm.add(jlab,BorderLayout.CENTER);
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();
        if (s == "OK")
        {
            jlab.setText("Ok Button pressed");
        }
        else
        jlab.setText("Cancel Button pressed");
    }
    public static void main(String args[])
    {
         new EventHandling();

    }

    
}