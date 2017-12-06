import javax.swing.*;

public class RunSubFrame {
    public RunSubFrame(String name,int word,int chr){
        JFrame frame = new JFrame("TFC Smithing");
        SubFrame init = new SubFrame(name,word,chr);
        frame.setContentPane(init.main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,170);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
