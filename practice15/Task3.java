package practice15;
import javax.swing.*;
import java.awt.*;

/*
3. Разработайте программу с меню, двумя кнопками и текстовым
полем ввода. В этой программе у вас должны быть разные настройки в
меню. Должно быть меню «Файл», которое включает в себя подменю
«Сохранить», «Выйти» и «Правка», включая подменю «Копировать,
вырезать, вставить» и меню «Справка». Вид окна программы должен иметь
вид как на рис.15.9 ниже.
Замечание. Для выполнения задания вам понадобятся следующие
классы: GridLayout, JButton, JFrame, JMenu, JMenuBar, JMenuItem, JPanel,
JTextArea;
 */

public class Task3 extends JFrame {

    private JMenu createJMenu(String [] items, String name){
        JMenu ans = new JMenu(name);
        for (String item : items)
            ans.add(new JMenuItem(item));
        return ans;
    }
    Task3() {
        JPanel panel = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(250, 100);
            };
        };

        String [] arrFiles = {"Сохранить", "Правка", "Выйти"};
        String [] arrEdit = {"Копировать", "Вырезать", "Вставить"};
        String [] arrHelp = {"Справка"};

        JMenu file = createJMenu(arrFiles, "Файл");
        JMenu edit = createJMenu(arrEdit, "Редактировать");
        JMenu help = createJMenu(arrHelp, "Помощь");
        JMenuBar fullMenu = new JMenuBar();

        fullMenu.add(file);
        fullMenu.add(edit);
        fullMenu.add(help);
        setJMenuBar(fullMenu);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");

        JTextArea text = new JTextArea("Эта область для входного текста");
        text.setBounds(500, 15, 100, 100);

        panel.add(button1);
        panel.add(button2);
        panel.add(text);
        add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args){
        new Task3();
    }
}
