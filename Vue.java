import java.awt.*;
import javax.swing.*;

class Vue extends JFrame{
JFrame main;
JPanel left;
JPanel right;


public Vue(){
  EventQueue.invokeLater(() ->
  {
    //Exo 8 MARCHE PAS WALLAH

      main = new JFrame("Grid test");

      JPanel left = new JPanel(new GridLayout(0,1));
      JPanel right = new JPanel(new GridLayout(1,0));
      left.setBackground(Color.green);
      right.setBackground(Color.black);


      main.add(right);
      main.add(left);
      main.setSize(500,400);
      main.setVisible(true);



// Before Exo 8

    /*  b = new JPanel();
      a = new JPanel();
      b.setBackground(Color.green);
      a.setBackground(Color.black);

      a.setLayout(new GridLayout(0,1));

      b.setLayout(new GridLayout(0,1));

      JLabel text = new JLabel("Vert",JLabel.CENTER);


      setContentPane(b);
      setSize(500,400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);


      GridLayout test = new GridLayout(0,2);
      setSize(500,400);
      setVisible(true);
      */
  });
}


public static void main(String[] args) {
 new Vue();

}


}
