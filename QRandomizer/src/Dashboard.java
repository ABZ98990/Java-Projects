import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame
{
    JFrame frame;
    ImageIcon img = new ImageIcon("logo.png");
    Dashboard()
    {
        frame = new JFrame("Dashboard");
        frame.setVisible(true);
        frame.setSize(960,580);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setIconImage(img.getImage());
        frame.setLocationRelativeTo(null);
    }
}
