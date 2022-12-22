package practice16.Task1;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse implements MouseListener {
    private String title;
    JFrame jframe;
    Mouse(String title, JFrame jframe){
        this.title = title;
        this.jframe = jframe;
    }
    public void mouseClicked(MouseEvent event){}

    public void mouseEntered(MouseEvent event){
        JOptionPane.showMessageDialog(jframe, "Добро пожаловать в " + title,"Диалоговое окно" , JOptionPane.WARNING_MESSAGE);
    }

    public void mouseExited(MouseEvent event){}

    public void mousePressed(MouseEvent event){}

    public void mouseReleased(MouseEvent event){}
}
