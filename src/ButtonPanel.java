import javax.swing.*;

public class ButtonPanel {
    JPanel btnPanel;
    JButton submit;
    JButton exit;
    public ButtonPanel(){
        this.btnPanel = new JPanel(null);
        this.submit = new JButton("Submit");
        this.exit = new JButton("Exit");
        this.submit.setBounds(0, 10, 80, 30);
        this.exit.setBounds(100, 10, 80, 30);
        this.btnPanel.add(submit);
        this.btnPanel.add(exit);
    }
}
