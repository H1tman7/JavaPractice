package practice24;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class Task3 extends JFrame {
    public Task3(){
        setSize(600, 400);
        String [] files_arr = {"Text", "Image", "Music"};
        JMenu file = new JMenu("File");
        JMenu create = createJMenu(files_arr, "Create");
        JMenu open = createJMenu(files_arr, "Open");
        file.add(create);
        file.add(open);
        JMenuBar fullMenu = new JMenuBar();
        fullMenu.add(file);
        setJMenuBar(fullMenu);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    private JMenu createJMenu(String [] array, String name){
        JMenu menu = new JMenu(name);
        for (int i = 0; i < 3; ++i){
            int temp = i;
            menu.add(new JMenuItem(new AbstractAction(array[i]) {
                public void actionPerformed(ActionEvent e) {
                    if (temp == 0) {
                        try {
                            IDocument document_ = Factory.getDocument(new CreateText());
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    else if (temp == 1){
                        try{
                            IDocument document_ = Factory.getDocument(new CreateImage());
                        }catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    else{
                        try {
                            IDocument document_ = Factory.getDocument(new CreateMusic());
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }));
        }
        return menu;
    }

    public static void main(String [] args){
        new Task3();
    }
}

