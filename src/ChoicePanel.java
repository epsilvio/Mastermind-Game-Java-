import javax.swing.*;
import java.awt.event.ActionListener;

public class ChoicePanel {
    JPanel choicePanel;
    JComboBox choice1;
    JComboBox choice2;
    JComboBox choice3;
    JComboBox choice4;
    public ChoicePanel(){
        this.choicePanel = new JPanel(null);
        this.choice1 = new JComboBox();
        this.choice2 = new JComboBox();
        this.choice3 = new JComboBox();
        this.choice4 = new JComboBox();
        this.choice1.addItem("Blue");
        this.choice1.addItem("Orange");
        this.choice1.addItem("Black");
        this.choice1.addItem("Brown");
        this.choice1.addItem("Yellow");
        this.choice1.addItem("Green");
        this.choice2.addItem("Blue");
        this.choice2.addItem("Orange");
        this.choice2.addItem("Black");
        this.choice2.addItem("Brown");
        this.choice2.addItem("Yellow");
        this.choice2.addItem("Green");
        this.choice3.addItem("Blue");
        this.choice3.addItem("Orange");
        this.choice3.addItem("Black");
        this.choice3.addItem("Brown");
        this.choice3.addItem("Yellow");
        this.choice3.addItem("Green");
        this.choice4.addItem("Blue");
        this.choice4.addItem("Orange");
        this.choice4.addItem("Black");
        this.choice4.addItem("Brown");
        this.choice4.addItem("Yellow");
        this.choice4.addItem("Green");
        this.choice1.setBounds(0, 10, 60, 30);
        this.choice2.setBounds(65, 10, 60, 30);
        this.choice3.setBounds(130, 10, 60, 30);
        this.choice4.setBounds(195, 10, 60, 30);
        this.choicePanel.add(choice1);
        this.choicePanel.add(choice2);
        this.choicePanel.add(choice3);
        this.choicePanel.add(choice4);
    }
    public JComboBox getChoice1(ActionListener a) {
        int index;
        choice1.addActionListener(a);
        index = choice1.getSelectedIndex();

        return choice1;
    }
    public JComboBox getChoice2(ActionListener a) {
        return choice2;
    }
    public JComboBox getChoice3(ActionListener a) {
        return choice3;
    }
    public JComboBox getChoice4(ActionListener a) {
        return choice4;
    }
}
