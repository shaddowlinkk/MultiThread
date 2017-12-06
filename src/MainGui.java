import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainGui {
    private JTextField textField1;
    private JButton find;
    public JPanel main;


    public MainGui() {
        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scanner in=null;
                try {
                    in = new Scanner(new File(textField1.getText()));
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }

                while (in.hasNext()){
                    Runnable r = new countThread(in.nextLine());
                    Thread t= new Thread(r);
                    t.start();
                }

            }
        });
    }
}
