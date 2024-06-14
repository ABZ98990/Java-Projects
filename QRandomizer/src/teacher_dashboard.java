import javax.swing.*;
import java.awt.*;

public class teacher_dashboard extends JFrame
{
    JFrame frame;
    JPanel panel;
    JLabel question;
    ImageIcon img = new ImageIcon("logo.png");
    JButton logout_btn;
    teacher_dashboard()
    {
        logout_btn = new JButton("Logout now");
        logout_btn.setForeground(Color.WHITE);
        logout_btn.setVisible(true);
        logout_btn.setFocusable(false);
        logout_btn.setBackground(new Color(0x2B911));

        panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);

        panel.add(logout_btn).setBounds(10,10,100,30);

        frame = new JFrame("Dashboard");
        frame.setVisible(true);
        frame.setSize(960,580);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setIconImage(img.getImage());
        frame.setLocationRelativeTo(null);

        frame.add(panel).setBounds(0,0,960,580);
    }
}
