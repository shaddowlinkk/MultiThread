import javax.swing.*;

public class run {
    public static void main(String[] args){
        JFrame frame = new JFrame("TFC Smithing");
        MainGui init = new MainGui();
        frame.setContentPane(init.main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,170);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
