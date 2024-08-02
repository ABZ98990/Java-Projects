import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class teacher_dashboard extends JFrame implements ActionListener
{
    boolean check = true;
    JFrame frame;
    JPanel panel;
    JLabel q_label, ans_label;
    JTextField q_text, ans_text;
    ImageIcon img = new ImageIcon("logo.png");
    JButton logout_btn, add_btn, save_btn;
    teacher_dashboard()
    {
        logout_btn = new JButton("Logout now");
        logout_btn.setForeground(Color.WHITE);
        logout_btn.setVisible(true);
        logout_btn.setFocusable(false);
        logout_btn.setBackground(new Color(0x2B911));
        logout_btn.addActionListener(this);

        q_label = new JLabel("Add a Question:");
        q_label.setFont(new Font("Arial", Font.BOLD, 22));
        q_label.setVisible(true);
        q_label.setForeground(new Color(0x2B911));

        q_text = new JTextField();
        q_text.setFont(new Font("Arial", Font.PLAIN, 22));
        q_text.setVisible(true);
        q_text.setForeground(new Color(0x2B911));

        add_btn = new JButton("Add");
        add_btn.setForeground(Color.WHITE);
        add_btn.setVisible(true);
        add_btn.setFocusable(false);
        add_btn.setBackground(new Color(0x2B911));
        add_btn.setFont(new Font("Arial", Font.PLAIN, 20));
        add_btn.addActionListener(this);

        ans_label = new JLabel("Answer: ");
        ans_label.setFont(new Font("Arial", Font.BOLD, 22));
        ans_label.setVisible(true);
        ans_label.setForeground(new Color(0x2B911));

        ans_text = new JTextField();
        ans_text.setFont(new Font("Arial", Font.PLAIN, 22));
        ans_text.setVisible(true);
        ans_text.setForeground(new Color(0x2B911));

        panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);

        panel.add(logout_btn).setBounds(10,10,100,30);
        panel.add(q_label).setBounds(30, 100,500,35);
        panel.add(q_text).setBounds(30,140,700,35);
        panel.add(add_btn).setBounds(750,240, 100,35);
        panel.add(ans_label).setBounds(30,200,225, 30);
        panel.add(ans_text).setBounds(30,240,700,35);

        frame = new JFrame("Dashboard");
        frame.setVisible(true);
        frame.setSize(960,580);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setIconImage(img.getImage());
        frame.setLocationRelativeTo(null);

        frame.add(panel).setBounds(0,0,960,580);
    }
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == logout_btn)
        {
            Welcome win = new Welcome();
            frame.dispose();
        }
        if (event.getSource() == add_btn)
        {
            try (BufferedWriter q_writer = new BufferedWriter(new FileWriter("./QnA/questions.txt", true));
                 BufferedWriter ans_writer = new BufferedWriter(new FileWriter("./QnA/answers.txt", true)))
            {
                if (!check)
                {
                    q_writer.write("\n");
                    ans_writer.write("\n");
                }
                // The 'true' argument in FileWriter enables appending mode
                q_writer.write(q_text.getText());
                ans_writer.write(ans_text.getText());
                q_text.setText("");
                ans_text.setText("");
                check = false;
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
