import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpPanel extends Frame {
    private JButton depbut;
    private JButton withbut;
    private JButton recbut;
    private JButton accbut;
    public JPanel panelop;
    private JButton SIGNOUTButton;

    public OpPanel() {
        add(panelop);
        SIGNOUTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              JFrame jd1 = new JFrame("LOGIN PAGE");
              jd1.setContentPane(new MainPanel().Main);
              jd1.setSize(500,500);
              jd1.setVisible(true);
            }
        });
        depbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Dep = new JFrame("DEPOSIT PAGE");
                Dep.setContentPane(new DepositPanel().DepPanel);
                Dep.setSize(500,500);
                Dep.setVisible(true);
            }
        });
        withbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JFrame Wit = new JFrame("WITHDRAW PAGE");
               Wit.setContentPane(new WithdrawPanel().WithPan);
               Wit.setSize(1000,1000);
               Wit.setVisible(true);
            }
        });
        accbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JFrame acc1 = new JFrame("ACCOUNT DETAILS PAGE");
               acc1.setContentPane(new AccDetails().accpanel);
               acc1.setSize(1000,1000);
               acc1.setVisible(true);
            }
        });
        recbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame rectr = new JFrame("RECENT TRANSACTIONS");
                rectr.setContentPane(new RecentPanel().recmain);
                rectr.setSize(1000,1000);
                rectr.setVisible(true);
            }
        });
    }
}
