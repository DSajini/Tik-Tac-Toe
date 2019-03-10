import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//View class includes the start Game grid and the winner window at the end of the game.
public class View extends JFrame implements ActionListener {
    static JButton b1=new JButton("");
    static JButton b2=new JButton("");
    static JButton b3=new JButton("");
    static JButton b4=new JButton("");
    static JButton b5=new JButton("");
    static JButton b6=new JButton("");
    static JButton b7=new JButton("");
    static JButton b8=new JButton("");
    static JButton b9=new JButton("");


    public  static String message;
    public  static String p1="Player 1 Wins";
    public  static String p2="Player 2 Wins";

    Font newfont=new Font("Serif",Font.BOLD,50);


    public static void main(String[] args){
       View g=new View("Tik-Tac-Toe");
    }

    //constructor
    public View(String title){
        super (title);
        JFrame f= new JFrame(title);
        Container c=f.getContentPane();
        c.setLayout(new GridLayout(3,3,10,10));

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);
        c.add(b9);

        b1.setFont(newfont);
        b2.setFont(newfont);
        b3.setFont(newfont);
        b4.setFont(newfont);
        b5.setFont(newfont);
        b6.setFont(newfont);
        b7.setFont(newfont);
        b8.setFont(newfont);
        b9.setFont(newfont);

        //connect actionlistners
        Controller l=new Controller(this);

        b1.addActionListener(l);
        b2.addActionListener(l);
        b3.addActionListener(l);
        b4.addActionListener(l);
        b5.addActionListener(l);
        b6.addActionListener(l);
        b7.addActionListener(l);
        b8.addActionListener(l);
        b9.addActionListener(l);

        f.pack();
        f.setSize(600,600);
        f.show();

        setBounds(300,300,100,100);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    //winner window
    public static void post(String m) {
        Font newfont=new Font("Serif",Font.BOLD,50);
        JLabel l1=new JLabel(m);
        JFrame msg=new JFrame("Result");
        Container d=msg.getContentPane();
        msg.pack();

        msg.show();

        msg.setBounds(700,500,350,400);
        msg.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        l1.setFont(newfont);
        d.add(l1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
