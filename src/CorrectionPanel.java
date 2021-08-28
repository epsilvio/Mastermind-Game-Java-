import javax.swing.*;
import java.awt.*;

public class CorrectionPanel {
    JPanel correctPanel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    public CorrectionPanel(){
        this.correctPanel = new JPanel(null);
        this.label1 = new JLabel("?");
        this.label2 = new JLabel("?");
        this.label3 = new JLabel("?");
        this.label4 = new JLabel("?");
        this.label1.setForeground(Color.gray);
        this.label2.setForeground(Color.gray);
        this.label3.setForeground(Color.gray);
        this.label4.setForeground(Color.gray);
        this.correctPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
        this.label1.setBounds(25,10,20,20);
        this.label2.setBounds(80,10,20,20);
        this.label3.setBounds(135,10,20,20);
        this.label4.setBounds(190,10,20,20);
        this.correctPanel.add(label1);
        this.correctPanel.add(label2);
        this.correctPanel.add(label3);
        this.correctPanel.add(label4);
    }
}
