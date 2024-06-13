import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class teacher_signup extends JFrame implements ActionListener
{
    JFrame frame;
    ImageIcon img = new ImageIcon("logo.png");
    JPanel panel;
    JLabel heading, name, email, password, note1, note2;
    JTextField name_field, email_field, pass_field;
    JButton return_btn, signup_btn;
    teacher_signup()
    {
        return_btn = new JButton("Back");
        return_btn.setBackground(Color.WHITE);
        return_btn.setForeground(new Color(0x2B911));
        return_btn.setVisible(true);
        return_btn.setFocusable(false);
        return_btn.setFont(new Font("Arial", Font.BOLD, 16));
        return_btn.addActionListener(this);

        //Heading in the right panel
        heading = new JLabel("Sign Up as a Teacher");
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

        //Teacher SignUp Button
        signup_btn = new JButton("Sign Up");
        signup_btn.setVisible(true);
        signup_btn.setFocusable(false);
        signup_btn.setBackground(Color.WHITE);
        signup_btn.setForeground(new Color(0x2B911));
        signup_btn.setFont(new Font("Arial", Font.BOLD, 16));
        signup_btn.addActionListener(this);

        //Line 1 of Footnote for username creation in the right panel
        note1 = new JLabel("Note: The username must not contain special characters");
        note1.setFont(new Font("Arial", Font.PLAIN, 16));
        note1.setVisible(true);
        note1.setForeground(Color.WHITE);
        //Line 2 of footnote
        note2 = new JLabel("or spaces except Underscore ( _ ) or Hyphens ( - ).");
        note2.setFont(new Font("Arial", Font.PLAIN, 16));
        note2.setVisible(true);
        note2.setForeground(Color.WHITE);

        panel = new JPanel();
        panel.setVisible(true);
        panel.setBackground(new Color(0x2B911));
        panel.setLayout(null);

        panel.add(return_btn).setBounds(5,5,75,25);
        panel.add(heading).setBounds(120,120, 250, 30);
        panel.add(name).setBounds(50, 180, 100,30);
        panel.add(name_field).setBounds(150,180,225, 30);
        panel.add(email).setBounds(50, 235, 100,30);
        panel.add(email_field).setBounds(150,235,225, 30);
        panel.add(password).setBounds(50, 290, 100,30);
        panel.add(pass_field).setBounds(150,290,225, 30);

        panel.add(note1).setBounds(30,515,500,120);
        panel.add(note2).setBounds(73,530,500,120);
        panel.add(signup_btn).setBounds(170,370,95,30);

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
        if (event.getSource() == return_btn)
        {
            Welcome win = new Welcome();
            frame.dispose();
        }
        if (event.getSource() == signup_btn)
        {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("teacher_" + name_field.getText() + ".txt"));
                writer.write(name_field.getText());
                writer.write("\n" + email_field.getText());
                writer.write("\n" + pass_field.getText());
                writer.close();
                JOptionPane.showMessageDialog(this, "Credentials have been stored!", "Successful", JOptionPane.PLAIN_MESSAGE);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
