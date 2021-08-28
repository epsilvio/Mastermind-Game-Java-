import javax.swing.*;
import java.awt.*;

public class AnswerPanel {
    JPanel ansPanel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    public AnswerPanel(){
        this.ansPanel = new JPanel();
        this.label1 = new JLabel("■");
        this.label2 = new JLabel("■");
        this.label3 = new JLabel("■");
        this.label4 = new JLabel("■");
        this.label1.setForeground(Color.gray);
        this.label2.setForeground(Color.gray);
        this.label3.setForeground(Color.gray);
        this.label4.setForeground(Color.gray);
        this.ansPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
        ansPanel.setLayout(null);
        label1.setBounds(25,10,20,20);
        label2.setBounds(80,10,20,20);
        label3.setBounds(135,10,20,20);
        label4.setBounds(190,10,20,20);
        this.ansPanel.add(label1);
        this.ansPanel.add(label2);
        this.ansPanel.add(label3);
        this.ansPanel.add(label4);
    }
}
