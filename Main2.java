import javax.swing.*;
import javax.swing.BoxLayout;
import java.awt.*;
import java.awt.event.*;

public class Main2{
    public static void main(String[] args){
        JFrame frame = new JFrame("はじめてのSwing");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);

        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.X_AXIS));

        JLabel label = new JLabel("Hello World!");
        frame.add(label);

        JButton button = new JButton("うえ");
        frame.add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("おされました");
            }
        });

        JButton button2 = new JButton("みぎ");
        frame.add(button2);

        JButton button3 = new JButton("ひだり");
        frame.add(button3);

        JButton button4 = new JButton("した");
        frame.add(button4);

        frame.setVisible(true);
        System.out.println("フレームを表示");
    }
}