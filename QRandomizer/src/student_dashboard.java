import javax.swing.*;

public class student_dashboard extends JFrame
{
    JFrame frame;
    ImageIcon img = new ImageIcon("logo.png");
    student_dashboard()
    {
        frame = new JFrame("Dashboard");
        frame.setVisible(true);
        frame.setSize(960,580);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setIconImage(img.getImage());
        frame.setLocationRelativeTo(null);
    }
}