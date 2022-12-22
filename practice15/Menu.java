package practice15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
2. Разработайте программу выбора меню как на рис. 15.8 ниже.
Вам понадобится JComboBox.
При выборе пункта меню должна выводится информация о стране
 */

public class Menu extends JFrame {
    final private JComboBox menu; // для выпадающего списка
    private JLabel labelStart, labelChoose;
    Menu(){
        setSize(1920, 100);
        setLayout(new FlowLayout());
        String [] stringMenu = {"Австралия", "Китай", "Англия", "Россия"};
        menu = new JComboBox<>(stringMenu);
        menu.setBounds(80, 50, 140, 20);

        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menu.getSelectedItem() == "Австралия")
                    labelChoose.setText(" государство в Южном полушарии, занимающее одноимённый материк, остров Тасмания и несколько других островов Индийского и Тихого океанов; является шестым государством по площади в мире");
                else if (menu.getSelectedItem() == "Китай")
                    labelChoose.setText(" государство в Восточной Азии. Занимает третье место в мире по территории (9 598 962 км²), уступая России и Канаде, а по численности населения — 1 425 403 000 жителей — первое, обойдя Индию");
                else if (menu.getSelectedItem() == "Англия")
                    labelChoose.setText(" страна, являющаяся крупнейшей административно-политической частью Соединённого Королевства Великобритании и Северной Ирландии. Население Англии составляет 84 % от общего числа населения Великобритании");
                else labelChoose.setText(" государство в Восточной Европе и Северной Азии. Россия — крупнейшее государство в мире, её территория в конституционных границах с территорией Крыма, аннексия которого не получила международного признания, составляет 17 125 191 км². Население страны в тех же границах составляет 147 182 123 чел.");
            }
        });
        labelStart = new JLabel("Выберите страну: ");
        labelStart.setBounds(90, 100, 400, 100);
        labelChoose = new JLabel("");
        labelChoose.setBounds(90, 100, 400, 100);
        add(labelStart);
        add(menu);
        add(labelChoose);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args){
        new Menu();
    }
}

