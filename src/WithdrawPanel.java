import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Exception;

class InsufficientFunds extends Exception
{
    InsufficientFunds(String s)
    {
        super(s);
    }
}
class NoATMFunds extends Exception
{
    NoATMFunds(String s)
    {
        super(s);
    }
}
public class WithdrawPanel extends MainBank {
    public JPanel WithPan;
    private JTextField WithAmt;
    private JButton WithBut;
    private JLabel WithRes;
    private JTextField ErField;
    private JButton WithSub;
    private JButton button1;
    int k =0;
    public WithdrawPanel() {
        add(WithPan);
        ErField.setVisible(false);
        WithSub.setVisible(false);
        WithRes.setVisible(false);
        WithBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amnt = Double.parseDouble(WithAmt.getText());
                try
                {
                    if(amnt > atmamount)
                    {
                        throw new NoATMFunds(" INSUFFICIENT FUNDS IN ATM");
                    }
                    else
                    {
                        try {
                            if (amnt > balance)
                            {
                                throw new InsufficientFunds(" INSUFFICIENT FUNDS IN ACCOUNT");
                            }
                            else {
                                Withdraw(amnt);
                                JOptionPane.showMessageDialog(null,"AMOUNT:"+amnt+" SUCCESSFULLY WITHDRAWN");
                            }
                        }
                        catch (InsufficientFunds e1)
                        {
                            JOptionPane.showMessageDialog(null,"ERROR ENCOUNTERED"+e1.getMessage());
                        }
                    }
                }
                catch(NoATMFunds e2)
                {
                    JOptionPane.showMessageDialog(null,"ERROR ENCOUNTERED: "+e2.getMessage()+"\nENTER YOUR NUMBER IN THE GIVEN BOX");
                    ErField.setVisible(true);
                    WithSub.setVisible(true);
                    WithRes.setVisible(true);

                }
            }
        });
        WithSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                phoney[i] = Long.parseLong(ErField.getText());;
                k++;
                for(int j = 0;j<10;j++)
                {
                    System.out.println(phoney[j]);
                }
                JOptionPane.showMessageDialog(null,"YOU MAY PROCEED TO THE NEARBY ATM(Around 2 Kms) OR WAIT FOR THE NOTIFICATION");
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
