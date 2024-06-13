import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener
{
    JFrame frame;
    ImageIcon img = new ImageIcon("logo.png");
    JPanel panel_one, panel_two;
    JLabel p2_heading, p1_heading, name, email, password, teacher_login_text;
    JTextField name_field, email_field, pass_field;
    JButton sup_btn, teacher_login_btn;
    Window()
    {
        //USER mode text for left panel
        teacher_login_text = new JLabel("If you wish to log in as a Teacher,");
        teacher_login_text.setVisible(true);
        teacher_login_text.setBackground(null);
        teacher_login_text.setForeground(Color.WHITE);
        teacher_login_text.setFont(new Font("Arial", Font.BOLD, 16));

        //"password" Label
        password = new JLabel("Password: ");
        password.setFont(new Font("Arial", Font.BOLD, 18));
        password.setVisible(true);
        password.setForeground(new Color(0X2B911));

        //"Email" Label
        email = new JLabel("Email: ");
        email.setFont(new Font("Arial", Font.BOLD, 18));
        email.setVisible(true);
        email.setForeground(new Color(0x2B911));

        //"Name" Label
        name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setVisible(true);
        name.setForeground(new Color(0x2B911));

        //Password Field
        pass_field = new JTextField();
        pass_field.setVisible(true);

        //Email Field
        email_field = new JTextField();
        email_field.setVisible(true);

        //Name Field
        name_field = new JTextField();
        name_field.setVisible(true);

        //Heading in the left panel
        p1_heading = new JLabel("Welcome, User!");
        p1_heading.setForeground(Color.white);
        p1_heading.setFont(new Font("Arial", Font.BOLD, 22));

        //Heading in the right panel
        p2_heading = new JLabel("Sign Up as a Student");
        p2_heading.setForeground(new Color(0x2B911));
        p2_heading.setFont(new Font("Arial", Font.BOLD, 22));
        p2_heading.setVisible(true);

        //signUp Button
        sup_btn = new JButton("Sign Up");
        sup_btn.setVisible(true);
        sup_btn.setFocusable(false);
        sup_btn.setBackground(new Color(0x2B911));
        sup_btn.setForeground(Color.WHITE);
        sup_btn.setFont(new Font("Arial", Font.BOLD, 16));
        sup_btn.addActionListener(this);

        //Teacher Login Button
        teacher_login_btn = new JButton("Click Me!");
        teacher_login_btn.setVisible(true);
        teacher_login_btn.setFocusable(false);
        teacher_login_btn.setBackground(new Color(0x2702B911, true));
        teacher_login_btn.setBorder(null);
        teacher_login_btn.setForeground(Color.WHITE);
        teacher_login_btn.setFont(new Font("Arial", Font.BOLD, 16));
        teacher_login_btn.addActionListener(this);

        //Left side panel
        panel_one = new JPanel();
        panel_one.setBackground(new Color(0x2B9F11));
        panel_one.setLayout(null);

        //Adding Fields in the left panel
        panel_one.add(p1_heading).setBounds(120,135,215,30);
        panel_one.add(teacher_login_text).setBounds(40,200,250,30);
        panel_one.add(teacher_login_btn).setBounds(315,200,90,30);

        //right side Panel
        panel_two = new JPanel();
        panel_two.setLayout(null);

        //Adding Fields in the right panel
        panel_two.add(p2_heading).setBounds(190,135,234,30);
        panel_two.add(name).setBounds(85,200,100,30);
        panel_two.add(name_field).setBounds(185, 200, 234,30);
        panel_two.add(email).setBounds(85,250,100,30);
        panel_two.add(email_field).setBounds(185,250,234,30);
        panel_two.add(password).setBounds(85, 300, 234, 30);
        panel_two.add(pass_field).setBounds(185, 300, 234, 30);
        panel_two.add(sup_btn).setBounds(225,350,95,30);

        //Creating frame window
        frame = new JFrame("Welcome!");
        frame.setSize(1000,680);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setIconImage(img.getImage());
        frame.setLocationRelativeTo(null);
        //Adding panels to the frame window
        frame.add(panel_one).setBounds(0,0,453,680 );
        frame.add(panel_two).setBounds(453,0,547,680);
    }
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == sup_btn)
        {
            Dashboard db = new Dashboard();
            this.dispose();
        }
        if (event.getSource() == teacher_login_btn)
        {
            teacher_login page = new teacher_login();
            this.dispose();
        }
    }
}
