import javax.swing.*;

public class MasterMind {
    JFrame mainFrame;
    AnswerPanel[] MAP;
    CluePanel[] CAP;
    ChoicePanel CP;
    ButtonPanel BP;
    CorrectionPanel CorP;
    int y_axis = 10;
    public MasterMind(){
        this.mainFrame = new JFrame("MasterMind");
        mainFrame.setLayout(null);
        mainFrame.setLocation(400, 0);
        mainFrame.setSize(350, 700);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        MAP = new AnswerPanel[10];
        for(int a = 0; a < 10; a++){
            MAP[a] = new AnswerPanel();
            MAP[a].ansPanel.setBounds(20, y_axis, 220, 40);
            mainFrame.add(MAP[a].ansPanel);
            y_axis += 45;
        }
        y_axis = 10;
        CAP = new CluePanel[10];
        for(int a = 0; a < 10; a++){
            CAP[a] = new CluePanel();
            CAP[a].cluePanel.setBounds(250, y_axis, 40, 40);
            mainFrame.add(CAP[a].cluePanel);
            y_axis += 45;
        }
        CP = new ChoicePanel();
        CP.choicePanel.setBounds(20, y_axis, 300, 40);
        mainFrame.add(CP.choicePanel);
        y_axis += 45;
        BP = new ButtonPanel();
        BP.btnPanel.setBounds(20, y_axis, 300, 40);
        mainFrame.add(BP.btnPanel);
        y_axis += 45;
        CorP = new CorrectionPanel();
        CorP.correctPanel.setBounds(20, y_axis, 220, 40);
        mainFrame.add(CorP.correctPanel);
    }
    public static void main(String[]args){
        MasterMind displayMain = new MasterMind();

    }
}
