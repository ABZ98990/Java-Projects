import javax.swing.*;
import java.awt.*;

public class teacher_signup
{
    JFrame frame;
    ImageIcon img = new ImageIcon("logo.png");
    JPanel panel;
    JButton re_btn;
    teacher_signup()
    {
        re_btn = new JButton("Back");
        re_btn.setBackground(Color.WHITE);
        re_btn.setForeground(new Color(0x2B911));
        re_btn.setVisible(true);
        re_btn.setFocusable(false);
        re_btn.setFont(new Font("Arial", Font.BOLD, 16));


        panel = new JPanel();
        panel.setVisible(true);
        panel.setBackground(new Color(0x2B911));
        panel.setLayout(null);

        panel.add(re_btn).setBounds(5,5,75,25);


        frame = new JFrame("Teacher Sign Up");
        frame.setVisible(true);
        frame.setSize(453,680);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setIconImage(img.getImage());
        frame.setLocationRelativeTo(null);

        frame.add(panel).setBounds(0,0,453,680);
    }
}
