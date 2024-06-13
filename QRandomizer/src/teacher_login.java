import javax.swing.*;
import java.awt.*;

public class teacher_login
{
    JFrame frame;
    ImageIcon img = new ImageIcon("logo.png");
    JPanel panel;
    teacher_login()
    {
        panel = new JPanel();
        panel.setVisible(true);
        panel.setBackground(new Color(0x2B911));


        frame = new JFrame("Dashboard");
        frame.setVisible(true);
        frame.setSize(453,680);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setIconImage(img.getImage());
        frame.setLocationRelativeTo(null);

        frame.add(panel);
    }
}