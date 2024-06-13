import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teacher_signup extends JFrame implements ActionListener
{
    JFrame frame;
    ImageIcon img = new ImageIcon("logo.png");
    JPanel panel;
    JLabel heading, name, email, password;
    JTextField name_field, email_field, pass_field;
    JButton re_btn;
    teacher_signup()
    {
        re_btn = new JButton("Back");
        re_btn.setBackground(Color.WHITE);
        re_btn.setForeground(new Color(0x2B911));
        re_btn.setVisible(true);
        re_btn.setFocusable(false);
        re_btn.setFont(new Font("Arial", Font.BOLD, 16));
        re_btn.addActionListener(this);

        //Heading in the right panel
        heading = new JLabel("Sign Up as a Student");
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Arial", Font.BOLD, 22));
        heading.setVisible(true);

        //"Name" Label
        name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setVisible(true);
        name.setForeground(Color.WHITE);

        //Name Field
        name_field = new JTextField();
        name_field.setVisible(true);

        //"Email" Label
        email = new JLabel("Email: ");
        email.setFont(new Font("Arial", Font.BOLD, 18));
        email.setVisible(true);
        email.setForeground(Color.WHITE);

        //Email Field
        email_field = new JTextField();
        email_field.setVisible(true);

        //"password" Label
        password = new JLabel("Password: ");
        password.setFont(new Font("Arial", Font.BOLD, 18));
        password.setVisible(true);
        password.setForeground(Color.WHITE);

        //Password Field
        pass_field = new JTextField();
        pass_field.setVisible(true);

        panel = new JPanel();
        panel.setVisible(true);
        panel.setBackground(new Color(0x2B911));
        panel.setLayout(null);

        panel.add(re_btn).setBounds(5,5,75,25);
        panel.add(heading).setBounds(120,120, 215, 30);
        panel.add(name).setBounds(50, 170, 100,30);

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
