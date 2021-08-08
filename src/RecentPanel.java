import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecentPanel extends MainBank{
    public JPanel recmain;
    private JLabel rec1;
    private JLabel rec2;
    private JLabel rec3;
    private JButton REFRESHButton;
    private JButton BACKTOMENUButton;

    public RecentPanel() {
        add(recmain);
        REFRESHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rec1.setText("1) "+rectran[i-1]+" BALANCE: "+bal[i-1]);
                rec2.setText("2) "+rectran[i-2]+" BALANCE: "+bal[i-2]);
                rec3.setText("3) "+rectran[i-3]+" BALANCE: "+bal[i-3]);
            }
        });
        BACKTOMENUButton.addActionListener(new ActionListener() {
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
