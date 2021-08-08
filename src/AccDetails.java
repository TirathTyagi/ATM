import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccDetails extends MainBank{
    public JPanel accpanel;
    private JButton Checkdet;
    private JLabel accbal;
    private JLabel phonedet;
    private JLabel emdet;
    private JLabel passdet;
    private JLabel atmdet;
    private JLabel userdet;
    private JLabel userout;
    private JLabel atmout;
    private JLabel passout;
    private JLabel emailout;
    private JLabel phoneout;
    private JLabel accout;
    private JButton button1;

    public AccDetails() {
        add(accpanel);
        Checkdet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userout.setText(userab);
                passout.setText(pass);
                emailout.setText(em);
                phoneout.setText(String.valueOf(ph));
                atmout.setText(String.valueOf(pinny));
                accout.setText(String.valueOf(balance));
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jl = new JFrame("MAIN MENU");
                jl.setContentPane(new OpPanel().panelop);
                jl.setSize(1000,1000);
                jl.setVisible(true);
            }
        });
    }
}
