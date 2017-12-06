import javax.swing.*;

public class RunSubFrame {
    public RunSubFrame(String name,int word,int chr,String file){
        JFrame frame = new JFrame("TFC Smithing");
        SubFrame init = new SubFrame(name,word,chr,file);
        frame.setContentPane(init.main);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(550,370);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
