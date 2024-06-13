import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teacher_login extends JFrame implements ActionListener
{
    JFrame frame;
    ImageIcon img = new ImageIcon("logo.png");
    JPanel panel;
    JButton re_btn;
    teacher_login()
    {
        re_btn = new JButton("Back");
        re_btn.setBackground(Color.WHITE);
        re_btn.setForeground(new Color(0x2B911));
        re_btn.setVisible(true);
        re_btn.setFocusable(false);
        re_btn.setFont(new Font("Arial", Font.BOLD, 16));
        re_btn.addActionListener(this);


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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setIconImage(img.getImage());
        frame.setLocationRelativeTo(null);

        frame.add(panel).setBounds(0,0,453,680);
    }
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == re_btn)
        {
            Welcome win = new Welcome();
            frame.dispose();
        }
    }
}