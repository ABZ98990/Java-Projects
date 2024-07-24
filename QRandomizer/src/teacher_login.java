import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class teacher_login extends JFrame implements ActionListener
{
    JFrame frame;
    ImageIcon img = new ImageIcon("logo.png");
    JPanel panel;
    JLabel heading, name, password;
    JTextField name_field, pass_field;
    JButton return_btn, login_btn;
    teacher_login()
    {
        return_btn = new JButton("Back");
        return_btn.setBackground(Color.WHITE);
        return_btn.setForeground(new Color(0x2B911));
        return_btn.setVisible(true);
        return_btn.setFocusable(false);
        return_btn.setFont(new Font("Arial", Font.BOLD, 16));
        return_btn.addActionListener(this);

        //Heading in the right panel
        heading = new JLabel("Teacher Login Page");
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


        //"password" Label
        password = new JLabel("Password: ");
        password.setFont(new Font("Arial", Font.BOLD, 18));
        password.setVisible(true);
        password.setForeground(Color.WHITE);

        //Password Field
        pass_field = new JTextField();
        pass_field.setVisible(true);

        //Teacher SignUp Button
        login_btn = new JButton("Login");
        login_btn.setVisible(true);
        login_btn.setFocusable(false);
        login_btn.setBackground(Color.WHITE);
        login_btn.setForeground(new Color(0x2B911));
        login_btn.setFont(new Font("Arial", Font.BOLD, 16));
        login_btn.addActionListener(this);


        panel = new JPanel();
        panel.setVisible(true);
        panel.setBackground(new Color(0x2B911));
        panel.setLayout(null);

        panel.add(return_btn).setBounds(5,5,75,25);
        panel.add(heading).setBounds(120,120, 250, 30);
        panel.add(name).setBounds(60, 170, 100,30);
        panel.add(name_field).setBounds(60,200,325, 30);
        panel.add(password).setBounds(60, 250, 100,30);
        panel.add(pass_field).setBounds(60,280,325, 30);


        panel.add(login_btn).setBounds(170,350,95,30);

        frame = new JFrame("Teacher Login Page");
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
        if (event.getSource() == login_btn)
        {
            try {
                File file_name = new File("./Teachers/" + name_field.getText() + ".txt");
                if (file_name.exists())
                {
                    BufferedReader reader = new BufferedReader(new FileReader("./Teachers/" + name_field.getText() + ".txt"));
                    String first = reader.readLine();
                    String last = null, line;
                    while ((line = reader.readLine())!= null)
                    {
                        last = line;
                    }
                    if (pass_field.getText().equals(last))
                    {
                        student_dashboard dashboard = new student_dashboard();
                        frame.dispose();
                    }
                    else
                    {
                        pass_field.setText("");
                        JOptionPane.showMessageDialog(this, "Incorrect Password!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else {
                    name_field.setText("");
                    JOptionPane.showMessageDialog(this,"Incorrect username!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
