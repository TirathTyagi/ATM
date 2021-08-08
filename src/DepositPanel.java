import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepositPanel extends MainBank{
    public JPanel DepPanel;
    private JTextField DepMoney;
    private JButton DepBut;
    public JLabel DepRes;
    private JButton button1;

    public DepositPanel() {
        add(DepPanel);
        DepBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amt = Double.parseDouble(DepMoney.getText());
                Deposit(amt);
                JOptionPane.showMessageDialog(null,"AMOUNT: "+amt+" SUCCESSFULLY DEPOSITED");
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






