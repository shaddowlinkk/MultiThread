import javax.swing.*;

public class SubFrame {
    public JPanel main;
    private JLabel chara;
    private JLabel word;
    private JLabel name;
    private JTextArea textArea1;

    public SubFrame(String _name,int _word,int _chr,String text){
        name.setText(name.getText()+_name);
        word.setText(word.getText()+_word);
        chara.setText(chara.getText()+_chr);
        textArea1.setText(text);
    }
}
