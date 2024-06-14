import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class teacher_dashboard extends JFrame implements ActionListener
{
    int count = 1;
    JFrame frame;
    JPanel panel;
    JLabel q_label, count_label;
    JTextField q_text;
    ImageIcon img = new ImageIcon("logo.png");
    JButton logout_btn, q_btn, save_btn;
    teacher_dashboard()
    {
        logout_btn = new JButton("Logout now");
        logout_btn.setForeground(Color.WHITE);
        logout_btn.setVisible(true);
        logout_btn.setFocusable(false);
        logout_btn.setBackground(new Color(0x2B911));
        logout_btn.addActionListener(this);

        q_label = new JLabel("Add a new Question:");
        q_label.setFont(new Font("Arial", Font.BOLD, 22));
        q_label.setVisible(true);
        q_label.setForeground(new Color(0x2B911));

        q_text = new JTextField();
        q_text.setFont(new Font("Arial", Font.BOLD, 22));
        q_text.setVisible(true);
        q_text.setForeground(new Color(0x2B911));

        q_btn = new JButton("Add");
        q_btn.setForeground(Color.WHITE);
        q_btn.setVisible(true);
        q_btn.setFocusable(false);
        q_btn.setBackground(new Color(0x2B911));
        q_btn.setFont(new Font("Arial", Font.PLAIN, 20));
        q_btn.addActionListener(this);

        count_label = new JLabel("Question Count: " + count);
        count_label.setFont(new Font("Arial", Font.BOLD, 22));
        count_label.setVisible(true);
        count_label.setForeground(new Color(0x2B911));

        panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);

        panel.add(logout_btn).setBounds(10,10,100,30);
        panel.add(q_label).setBounds(30, 100,500,35);
        panel.add(q_text).setBounds(30,140,700,35);
        panel.add(q_btn).setBounds(750,140, 100,35);
        panel.add(count_label).setBounds(30,225,225, 30);

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
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == logout_btn)
        {
            Welcome win = new Welcome();
            frame.dispose();
        }
        if (event.getSource() == q_btn)
        {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("./QnA/q_"+count+".txt"));
                if (count < 2)
                {
                    writer.write(q_text.getText());
                    q_text.setText("");
                }
                else
                {
                    writer.write("\n" + q_text.getText());
                    q_text.setText("");
                }
                writer.close();
                count +=1;
                frame.repaint();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
