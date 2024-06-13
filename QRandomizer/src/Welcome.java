import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame implements ActionListener
{
    JFrame frame;
    ImageIcon img = new ImageIcon("logo.png");
    JPanel panel_one, panel_two;
    JLabel p2_heading, p1_heading, name, email, password, teacher_login_text, teacher_signup_text, note1, note2;
    JTextField name_field, email_field, pass_field;
    JButton student_signup_btn, teacher_login_btn, teacher_signup_btn;
    Welcome()
    {
        //Left side panel
        panel_one = new JPanel();
        panel_one.setBackground(new Color(0x2B9F11));
        panel_one.setLayout(null);

        //Heading in the left panel
        p1_heading = new JLabel("Welcome, User!");
        p1_heading.setForeground(Color.white);
        p1_heading.setFont(new Font("Arial", Font.BOLD, 22));

        //TEACHER Login text for left panel
        teacher_login_text = new JLabel("If you wish to Log In as a Teacher, Click Below");
        teacher_login_text.setVisible(true);
        teacher_login_text.setForeground(Color.WHITE);
        teacher_login_text.setFont(new Font("Arial", Font.BOLD, 16));

        //Teacher Login Button
        teacher_login_btn = new JButton("Login");
        teacher_login_btn.setVisible(true);
        teacher_login_btn.setFocusable(false);
        teacher_login_btn.setBackground(Color.WHITE);
        teacher_login_btn.setForeground(new Color(0x2B911));
        teacher_login_btn.setFont(new Font("Arial", Font.BOLD, 16));
        teacher_login_btn.addActionListener(this);

        //TEACHER SignUp text for left panel
        teacher_signup_text = new JLabel("If you wish to Sign In as a Teacher, Click Below");
        teacher_signup_text.setVisible(true);
        teacher_signup_text.setForeground(Color.WHITE);
        teacher_signup_text.setFont(new Font("Arial", Font.BOLD, 16));

        //Teacher SignUp Button
        teacher_signup_btn = new JButton("Sign Up");
        teacher_signup_btn.setVisible(true);
        teacher_signup_btn.setFocusable(false);
        teacher_signup_btn.setBackground(Color.WHITE);
        teacher_signup_btn.setForeground(new Color(0x2B911));
        teacher_signup_btn.setFont(new Font("Arial", Font.BOLD, 16));
        teacher_signup_btn.addActionListener(this);

        //Adding Fields in the left panel
        panel_one.add(p1_heading).setBounds(150,135,215,30);
        panel_one.add(teacher_login_text).setBounds(60,200,380,30);
        panel_one.add(teacher_login_btn).setBounds(190,240,95,30);
        panel_one.add(teacher_signup_text).setBounds(60,300,380,30);
        panel_one.add(teacher_signup_btn).setBounds(190,340,95,30);



        //right side Panel
        panel_two = new JPanel();
        panel_two.setLayout(null);

        //Heading in the right panel
        p2_heading = new JLabel("Sign Up as a Student");
        p2_heading.setForeground(new Color(0x2B911));
        p2_heading.setFont(new Font("Arial", Font.BOLD, 22));
        p2_heading.setVisible(true);

        //"Name" Label
        name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setVisible(true);
        name.setForeground(new Color(0x2B911));

        //Name Field
        name_field = new JTextField();
        name_field.setVisible(true);

        //"Email" Label
        email = new JLabel("Email: ");
        email.setFont(new Font("Arial", Font.BOLD, 18));
        email.setVisible(true);
        email.setForeground(new Color(0x2B911));

        //Email Field
        email_field = new JTextField();
        email_field.setVisible(true);

        //"password" Label
        password = new JLabel("Password: ");
        password.setFont(new Font("Arial", Font.BOLD, 18));
        password.setVisible(true);
        password.setForeground(new Color(0X2B911));

        //Password Field
        pass_field = new JTextField();
        pass_field.setVisible(true);

        //Student SignUp Button
        student_signup_btn = new JButton("Sign Up");
        student_signup_btn.setVisible(true);
        student_signup_btn.setFocusable(false);
        student_signup_btn.setBackground(new Color(0x2B911));
        student_signup_btn.setForeground(Color.WHITE);
        student_signup_btn.setFont(new Font("Arial", Font.BOLD, 16));
        student_signup_btn.addActionListener(this);

        //Line 1 of Footnote for username creation in the right panel
        note1 = new JLabel("Note: The username must not contain special characters");
        note1.setFont(new Font("Arial", Font.PLAIN, 16));
        note1.setVisible(true);
        note1.setForeground(new Color(0x2B911));
        //Line 2 of footnote
        note2 = new JLabel("or spaces except Underscore ( _ ) or Hyphens ( - ).");
        note2.setFont(new Font("Arial", Font.PLAIN, 16));
        note2.setVisible(true);
        note2.setForeground(new Color(0x2B911));

        //Adding Fields in the right panel
        panel_two.add(p2_heading).setBounds(190,135,234,30);
        panel_two.add(name).setBounds(85,200,100,30);
        panel_two.add(name_field).setBounds(185, 200, 234,30);
        panel_two.add(email).setBounds(85,250,100,30);
        panel_two.add(email_field).setBounds(185,250,234,30);
        panel_two.add(password).setBounds(85, 300, 234, 30);
        panel_two.add(pass_field).setBounds(185, 300, 234, 30);
        panel_two.add(student_signup_btn).setBounds(225,350,95,30);
        panel_two.add(note1).setBounds(70,515,500,120);
        panel_two.add(note2).setBounds(110,530,500,120);


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
        if (event.getSource() == student_signup_btn)
        {
            Dashboard db = new Dashboard();
            frame.dispose();
        }
        if (event.getSource() == teacher_login_btn)
        {
            teacher_login page = new teacher_login();
            frame.dispose();
        }
        if (event.getSource() == teacher_signup_btn)
        {
            teacher_signup page = new teacher_signup();
            frame.dispose();
        }
    }
}