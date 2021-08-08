import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MainPanel extends RegisterPanel{
    public JPanel Main;
    private JLabel Username;
    private JLabel Password;
    private JButton login;
    private JTextField user;
    private JPasswordField pass1;
    private JButton reg;
    private JLabel res;
    private JLabel atmp;
    private JTextField atmtext;
    private JButton adminbut;
    private JButton EXITButton;
    static int pos;



    public MainPanel() {
        pass1.setEchoChar('*');
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String usere = user.getText();
                String passg = String.valueOf(pass1.getPassword());
                long atmpass = Long.parseLong(atmtext.getText());

                for(int h = 0;h<10;h++) {
                    if (userp[h].equals(usere)) {
                        if (passe[h].equals(passg)) {
                            if (atmpin[h] == atmpass) {
                                JFrame jf1 = new JFrame("MAIN PAGE");
                                jf1.setContentPane(new OpPanel().panelop);
                                jf1.setSize(1000, 1000);
                                jf1.pack();
                                jf1.setVisible(true);
                                pos = h;
                            } else {
                                JOptionPane.showMessageDialog(null,"INVALID ATM PIN");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null,"INVALID PASSWORD");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"INVALID USERNAME");
                    }
                }
            }
        });
        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame j2 = new JFrame("REGISTRATION PAGE");
                j2.setContentPane(new RegisterPanel().panel1);
                j2.setSize(1000,1000);
                j2.setVisible(true);
            }
        });
        adminbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame gg2 = new JFrame("ADMIN PAGE");
                gg2.setContentPane(new AdminLogin().adminlogpan);
                gg2.setSize(1000,1000);
                gg2.setVisible(true);
            }
        });
        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame f1 = new JFrame("LOGIN PAGE");
        f1.setContentPane(new MainPanel().Main);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(500,500);
        f1.pack();
        f1.setVisible(true);
    }
}
