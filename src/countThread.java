import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class countThread  implements Runnable{
public String FileName;
public countThread(String _FileName){
    FileName=_FileName;
}
    public void run() {
        Scanner in = null;
        try {
            in = new Scanner(new File(FileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int countWord=0;
        int countLetter=0;
        while(in.hasNext()){
            String[] line = in.nextLine().split(" ");
            countWord+=line.length;
            for(int i =0;i<line.length;i++){
                countLetter+=line[i].length();
            }
        }
        RunSubFrame r = new RunSubFrame(FileName,countWord,countLetter);
    }
}
