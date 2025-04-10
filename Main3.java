import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main3{
    public static void main(String[] args){
        JFrame frame = new JFrame("ログイン画面");

        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);

        

        JPanel jpanel1 = new JPanel();
        frame.add(jpanel1);

        JPanel jpanel2 = new JPanel();
        frame.add(jpanel2);

        JPanel jpanel3 = new JPanel();
        frame.add(jpanel3);

        jpanel1.setLayout(new BoxLayout(jpanel1,BoxLayout.X_AXIS));
        
        JButton button1 = new JButton("ユーザーID");
        jpanel1.add(button1);
        button1.addMouseListener(new MouseAdapter(){
            public void mouseClicked (MouseEvent e){
                System.out.println("クリックされました");
            }
        });

        JTextField jtf = new JTextField();
        jpanel1.add(jtf);

        frame.setVisible(true);
    }
}