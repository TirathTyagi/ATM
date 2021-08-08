import com.sun.tools.javac.Main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JFrame {
    static int countdigi(long num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        return count;
    }
    public JPanel panel1;
    private JButton REGISTERButton;
    private JButton BACKButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;

    private JLabel moblab;
    private JLabel emlab;
    private JLabel pinlab;
    private JLabel acclab;
    private JLabel passlab;
    private JLabel conflab;
    private JLabel finalconf;
    private JPanel regpanel;
    static long[] atmpin = new long[10];
    static int i=0;
    static String[] userp = new String[10];
    static String[] passe = new String[10];
    static String em;
    static long ph;
    public RegisterPanel() {
        passwordField3.setEchoChar('*');
        passwordField2.setEchoChar('*');
        REGISTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass = String.valueOf(passwordField3.getPassword());
                String acc = textField2.getText();
                System.out.println(i);
                userp[i] = acc;
                passe[i] = pass;
                String conf = String.valueOf(passwordField2.getPassword());
                ph = Long.parseLong(textField3.getText());
                em = textField1.getText();
                long pin = Long.parseLong(String.valueOf(passwordField1.getPassword()));

                double digiph = countdigi(ph);
                double digipin = countdigi(pin);
                if (digiph == 10) {
                    moblab.setText("ACCEPTED");
                }
                else {
                    JOptionPane.showMessageDialog(null,"INVALID MOBILE NUMBER");
                }
                if (digipin == 6) {
                    pinlab.setText("ACCEPTED");
                    atmpin[i] = pin;
                }
                else {
                    JOptionPane.showMessageDialog(null,"PIN SHOULD BE 6 DIGITS");
                }
                if (em.contains(".com") && em.contains("@")) {
                    emlab.setText("ACCEPTED");
                }
                else {
                    JOptionPane.showMessageDialog(null,"EMAIL NOT VALID");
                }
                if (pass.equals(conf)) {
                    conflab.setText("PASSWORD MATCHED");
                    JOptionPane.showMessageDialog(null,"REGISTRATION SUCCESSFUL");
                }
                else {
                    JOptionPane.showMessageDialog(null,"PASSWORD NOT MATCHING");
                    JOptionPane.showMessageDialog(null,"CANNOT REGISTER");
                }
                i++;
            }


        });
        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame main = new JFrame("MAIN PANEL");
                main.setContentPane(new MainPanel().Main);
                main.setSize(700,700);
                main.pack();
                main.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame j3 = new JFrame("REGISTRATION PAGE");
        j3.setContentPane(new RegisterPanel().panel1);
        j3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j3.setSize(1000,1000);
        j3.pack();
        j3.setVisible(true);
    }
}
