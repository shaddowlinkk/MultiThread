import javax.swing.*;

public class SubFrame {
    public JPanel main;
    private JLabel chara;
    private JLabel word;
    private JLabel name;
    public SubFrame(String _name,int _word,int _chr){
        name.setText(name.getText()+_name);
        word.setText(word.getText()+_word);
        chara.setText(chara.getText()+_chr);
    }
}
