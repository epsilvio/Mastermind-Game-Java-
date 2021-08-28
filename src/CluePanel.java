import javax.swing.*;
import java.awt.*;

public class CluePanel {
    JPanel cluePanel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    public CluePanel(){
        this.cluePanel = new JPanel();
        this.label1 = new JLabel("■");
        this.label2 = new JLabel("■");
        this.label3 = new JLabel("■");
        this.label4 = new JLabel("■");
        this.label1.setForeground(Color.gray);
        this.label2.setForeground(Color.gray);
        this.label3.setForeground(Color.gray);
        this.label4.setForeground(Color.gray);
        this.cluePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        cluePanel.setLayout(null);
        label1.setBounds(10,8,15,15);
        label2.setBounds(20,8,15,15);
        label3.setBounds(10,18,15,15);
        label4.setBounds(20,18,15,15);
        this.cluePanel.add(label1);
        this.cluePanel.add(label2);
        this.cluePanel.add(label3);
        this.cluePanel.add(label4);
    }
}
