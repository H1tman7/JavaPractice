package practice4;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {

    private int Milan_Score = 0, Real_Score = 0;
    JLabel Result = new JLabel("Result: 0 x 0");
//    JLabel Winner = new JLabel("Winner: DRAW");
    JLabel LastScored = new JLabel("Last Scored: N/A");

    JButton Game_Over = new JButton("Game Over");
    JButton Milan = new JButton("AC Milan");
    JButton Real_Mardid = new JButton("Real Madrid");

    App(){
        super("The Game");
        setSize(500,300);
        setLayout(null);

        Result.setBounds(175,35,100,50);
        add(Result);

        LastScored.setBounds(150,90,150,50);
        add(LastScored);

        Milan.setBounds(55,160, 100, 50);
        add(Milan);

        Real_Mardid.setBounds(275,160, 150, 50);
        add(Real_Mardid);

        Game_Over.setBounds(155, 220,120,40);
        add(Game_Over);

        MilanScores();
        RealScores();
        PrintResult();
        GameOver();

    }

    private void PrintResult(){
        Result.setText("Result: " + Integer.toString(Milan_Score) + " X " + Integer.toString(Real_Score));
    }

    private void MilanScores(){
        Milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++Milan_Score;
                LastScored.setText("Last Scored: AC Milan");
                PrintResult();
            }
        });
    }

    private void RealScores(){
        Real_Mardid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                ++Real_Score;
                LastScored.setText("Last Scored: Real Madrid");
                PrintResult();
            }
        });
    }

    public void GameOver(){
        Game_Over.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(Milan_Score > Real_Score)
                    JOptionPane.showMessageDialog(null, "Winner: AC Milan" , "Game Over", JOptionPane.INFORMATION_MESSAGE);
                else if(Real_Score > Milan_Score)
                    JOptionPane.showMessageDialog(null, "Winner: Real Madrid" , "Game Over", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "DRAW!" , "Game Over", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        App obj = new App();
        obj.setVisible(true);
    }
}