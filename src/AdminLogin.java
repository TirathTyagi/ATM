import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin {
    public JPanel adminlogpan;
    private JTextField userfield;
    private JButton loginbutt;
    private JButton exitbutt;
    private JLabel adminres;
    private JPasswordField passfield;

    public AdminLogin() {

        loginbutt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userent = userfield.getText();
                String userval = "ADMIN";
                String passent = String.valueOf(passfield.getPassword());
                String passval = "ADMIN";
                if(userval.equals(userent))
                {
                    if(passval.equals(passent))
                    {
                        JFrame gk1 = new JFrame("ADMIN PAGE");
                        gk1.setContentPane(new AdminPage().adminpgpan);
                        gk1.setSize(1000,1000);
                        gk1.setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"INVALID PASSWORD");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"INVALID USERNAME");
                }
            }
        });
        exitbutt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame gg1 = new JFrame("LOGIN PAGE");
                gg1.setContentPane(new MainPanel().Main);
                gg1.setSize(500,500);
                gg1.setVisible(true);
            }
        });
    }
}
