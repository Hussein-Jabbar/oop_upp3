package femtonspel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class femtonspel extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b10 = new JButton("10");
    JButton b11 = new JButton("11");
    JButton b12 = new JButton("12");
    JButton b13 = new JButton("13");
    JButton b14 = new JButton("14");
    JButton b15 = new JButton("15");
    JButton tomButton = new JButton(" ");

    JButton nyttSpel = new JButton("New Game");
    

    femtonspel() {

        panel.setLayout(new GridLayout(4, 4));
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(tomButton);
        
        panel.setForeground(Color.YELLOW);
        
        frame.add(nyttSpel);
        nyttSpel.setForeground(Color.red);
        panel.setBackground(Color.red);
       
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        tomButton.addActionListener(this);
        nyttSpel.addActionListener(this);

        frame.setTitle("Femton Spel");
        frame.setSize(400, 400);
        //frame.setLayout(new GridLayout(4, 4));
        frame.setLayout(new FlowLayout());
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new femtonspel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        
        if (e.getSource() == b1) {
            String s = b1.getText();
            if (b2.getText().equalsIgnoreCase((" "))) {
                b2.setText(s);
                b1.setText(" ");
            }  if (b5.getText().equalsIgnoreCase(" ")) {
                b5.setText(s);
                b1.setText(" ");
            }

        }
        if (e.getSource() == b2) {
            String s = b2.getText();
            if (b1.getText().equalsIgnoreCase(" ")) {
                b1.setText(s);
                b2.setText(" ");
            }  if (b3.getText().equals(" ")) {
                b3.setText(s);
                b2.setText(" ");
            }  if (b6.getText().equalsIgnoreCase(" ")) {
                b6.setText(s);
                b2.setText(" ");
            }

        }
        if (e.getSource() == b3) {
            String s = b3.getText();
            if (b2.getText().equalsIgnoreCase(" ")) {
                b2.setText(s);
                b3.setText(" ");
            }  if (b4.getText().equals(" ")) {
                b4.setText(s);
                b3.setText(" ");
            }  if (b7.getText().equalsIgnoreCase(" ")) {
                b7.setText(s);
                b3.setText(" ");
            }

        }
        if (e.getSource() == b4) {
            String s = b4.getText();
            if (b3.getText().equalsIgnoreCase(" ")) {
                b3.setText(s);
                b4.setText(" ");
            }  if (b8.getText().equalsIgnoreCase(" ")) {
                b8.setText(s);
                b4.setText(" ");
            }

        }
        if (e.getSource() == b5) {
            String s = b5.getText();
            if (b1.getText().equalsIgnoreCase(" ")) {
                b1.setText(s);
                b5.setText(" ");
            }  if (b6.getText().equalsIgnoreCase(" ")) {
                b6.setText(s);
                b5.setText(" ");
            }  if (b9.getText().equalsIgnoreCase(" ")) {
                b9.setText(s);
                b5.setText(" ");
            }

        }
        if (e.getSource() == b6) {
            String s = b6.getText();
            if (b2.getText().equalsIgnoreCase(" ")) {
                b2.setText(s);
                b6.setText(" ");
            }  if (b5.getText().equalsIgnoreCase(" ")) {
                b5.setText(s);
                b6.setText(" ");

            }  if (b7.getText().equalsIgnoreCase(" ")) {
                b7.setText(s);
                b6.setText(" ");
            }  if (b10.getText().equalsIgnoreCase(" ")) {
                b10.setText(s);
                b6.setText(" ");
            }

        }
        if (e.getSource() == b7) {
            String s = b7.getText();
            if (b3.getText().equalsIgnoreCase(" ")) {
                b3.setText(s);
                b7.setText(" ");
            }  if (b6.getText().equalsIgnoreCase(" ")) {
                b6.setText(s);
                b7.setText(" ");
            }  if (b8.getText().equalsIgnoreCase(" ")) {
                b8.setText(s);
                b7.setText(" ");
            }  if (b11.getText().equalsIgnoreCase(" ")) {
                b11.setText(s);
                b7.setText(" ");
            }

        }
        if (e.getSource() == b8) {
            String s = b8.getText();
            if (b7.getText().equalsIgnoreCase(" ")) {
                b7.setText(s);
                b8.setText(" ");
            }  if (b12.getText().equalsIgnoreCase(" ")) {
                b12.setText(s);
                b8.setText(" ");
            }  if (b4.getText().equalsIgnoreCase(" ")) {
                b4.setText(s);
                b8.setText(" ");
            }

        }
        if (e.getSource() == b9) {
            String s = b9.getText();
            if (b5.getText().equalsIgnoreCase(" ")) {
                b5.setText(s);
                b9.setText(" ");
            }
            if (b13.getText().equalsIgnoreCase(" ")) {
                b13.setText(s);
                b9.setText(" ");
            }
            if (b10.getText().equalsIgnoreCase(" ")) {
                b10.setText(s);
                b9.setText(" ");
            }

        }
        if (e.getSource() == b10) {
            String s = b10.getText();
            if (b11.getText().equalsIgnoreCase(" ")) {
                b11.setText(s);
                b10.setText(" ");
            }
            if (b14.getText().equalsIgnoreCase(" ")) {
                b14.setText(s);
                b10.setText(" ");
            }
            if (b6.getText().equalsIgnoreCase(" ")) {
                b6.setText(s);
                b10.setText(" ");
            }
            if (b9.getText().equalsIgnoreCase(" ")) {
                b9.setText(s);
                b10.setText(" ");
            }

        }
        if (e.getSource() == b11) {
            String s = b11.getText();
            if (b7.getText().equalsIgnoreCase(" ")) {
                b7.setText(s);
                b11.setText(" ");
            }
            if (b10.getText().equalsIgnoreCase(" ")) {
                b10.setText(s);
                b11.setText(" ");
            }
            if (b12.getText().equalsIgnoreCase(" ")) {
                b12.setText(s);
                b11.setText(" ");
            }
            if (b15.getText().equalsIgnoreCase(" ")) {
                b15.setText(s);
                b11.setText(" ");
            }

        }
        if (e.getSource() == b12) {
            String s = b12.getText();
            if (tomButton.getText().equalsIgnoreCase(" ")) {
                tomButton.setText(s);
                b12.setText(" ");
            }
            if (b11.getText().equalsIgnoreCase(" ")) {
                b11.setText(s);
                b12.setText(" ");
            }
            if (b8.getText().equalsIgnoreCase(" ")) {
                b8.setText(s);
                b12.setText(" ");
            }

        }
        if (e.getSource() == b13) {
            String s = b13.getText();
            if (b9.getText().equalsIgnoreCase(" ")) {
                b9.setText(s);
                b13.setText(" ");
            }
            if (b14.getText().equalsIgnoreCase(" ")) {
                b14.setText(s);
                b13.setText(" ");

            }

        }
        if (e.getSource() == b14) {
            String s = b14.getText();
            if (b15.getText().equalsIgnoreCase(" ")) {
                b15.setText(s);
                b14.setText(" ");
            }
            if (b10.getText().equalsIgnoreCase(" ")) {
                b10.setText(s);
                b14.setText(" ");

            }if(b13.getText().equalsIgnoreCase(" ")){
                b13.setText(s);
                b14.setText(" ");
            }

        }
        if (e.getSource() == b15) {
            String s = b15.getText();
            if (b11.getText().equalsIgnoreCase(" ")) {
                b11.setText(s);
                b15.setText(" ");
            }
            if (b14.getText().equalsIgnoreCase(" ")) {
                b14.setText(s);
                b15.setText(" ");
            }
            if (tomButton.getText().equalsIgnoreCase(" ")) {
                tomButton.setText(s);
                b15.setText(" ");
            }

        }
        if (e.getSource() == tomButton) {
            String s = tomButton.getText();

            if (b15.getText().equalsIgnoreCase(" ")) {
                b15.setText(s);
                tomButton.setText(" ");
            }  if (b12.getText().equalsIgnoreCase(" ")) {
                b12.setText(s);
                tomButton.setText(" ");
            }
        }

   if (e.getSource() == nyttSpel) {
            String s = b1.getText();
            b1.setText(b15.getText());
            b15.setText(s);


            s = b2.getText();
            b2.setText(b14.getText());
            b14.setText(s);

            s = b2.getText();
            b2.setText(b8.getText());
            b8.setText(s);

            s = b4.getText();
            b4.setText(b9.getText());
            b9.setText(s);
            
            s = b11.getText();
            b11.setText(b7.getText());
            b7.setText(s);
            
            s = b8.getText();
            b8.setText(b1.getText());
            b1.setText(s);
            
            s = b3.getText();
            b3.setText(b12.getText());
            b12.setText(s);

            s = b7.getText();
            b7.setText(b5.getText());
            b5.setText(s);

            s = b13.getText();
            b13.setText(b9.getText());
            b9.setText(s);
            
            s = b6.getText();
            b6.setText(tomButton.getText());
            tomButton.setText(s);

        }
    if (b1.getText().equals("1")&& b2.getText().equals("2")&&b3.getText().equals("3")&&b4.getText().equals("4")&&b5.getText().equals("5")
            &&b6.getText().equals("6")&&b7.getText().equals("7")
            &&b8.getText().equals("8")&&b9.getText().equals("9")&&b10.getText().equals("10")&&b11.getText().equals("11")
            &&b12.getText().equals("12")&&b13.getText().equals("13")&&b14.getText().equals("14")
            &&b15.getText().equals("15")&&tomButton.getText().equals(" ")){
        JOptionPane.showMessageDialog(null, "You win");
    }
            
            
    }
    

}
