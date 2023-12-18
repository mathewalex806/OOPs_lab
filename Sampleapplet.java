import java.awt.*;
import java.applet.*;
/*
<applet code="Sampleapplet" width=300 height=50>
</applet>
*/
public class Sampleapplet extends Applet{
String msg;
public void init()
{
setBackground(Color.cyan);
setForeground(Color.red);
}
public void paint(Graphics g) {
msg ="Welcome to first applet";
g.drawString(msg, 10, 30);
}
}