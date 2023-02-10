import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {



        JFrame frame = new JFrame();
        ImagePanel imagePanel = new ImagePanel(Toolkit.getDefaultToolkit().getImage("/Volumes/Ventriliquist/Code/Java/Java Projects/PopularShows/src/rocket.jpg").getScaledInstance(1000,750,Image.SCALE_DEFAULT));
        frame.setContentPane(imagePanel);

        JLabel titleOfShow = new JLabel("Harry Potter and The Deathly Hallows");
        JLabel descriptionOfShow = new JLabel("<html>Without the guidance and protection of their professors,\n Harry (Daniel Radcliffe), Ron (Rupert Grint) and Hermione (Emma Watson) begin a \nmission to destroy the Horcruxes, the sources of Voldemort's immortality.</html>");

        titleOfShow.setFont(new Font("Sans serif", Font.BOLD, 22 ));
        descriptionOfShow.setFont(new Font("Sans serif", Font.PLAIN, 12 ));

        descriptionOfShow.setPreferredSize(new Dimension(250,250));
        imagePanel.add(titleOfShow);
        Dimension size = titleOfShow.getPreferredSize();
        titleOfShow.setBounds(100,500,size.width,size.height);

        imagePanel.add(descriptionOfShow);
        Dimension size1 = descriptionOfShow.getPreferredSize();
        descriptionOfShow.setBounds(100,450,size1.width,size1.height);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Popular Show Of The Day");
        frame.setSize(1000,750);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }


}
