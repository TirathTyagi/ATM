import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPage extends MainBank {
    public JPanel adminpgpan;
    private JTextField atmamt;
    private JButton addbutt;
    private JButton exitboi;
    private JLabel msgphone;
    private JLabel phonedisp;

    public AdminPage() {
        addbutt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amtadd = Double.parseDouble(atmamt.getText());
                if(amtadd > 0) {
                    atmamount = atmamount + amtadd;
                    msgphone.setText("SENDING NOTIFICATION TO: ");
                    for(int h = 0 ; h<phoney.length;h++)
                    {
                        phonedisp.setText(phoney[i]+"\n");
                    }
                }
            }
        });
    }
}
