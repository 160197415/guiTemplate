package view;

import javax.swing.*;
import java.awt.*;

public class AInterface extends JPanel {
    private JButton button1,button2;
    private JLabel  label1;

    GridBagConstraints gbc = new GridBagConstraints();

    public AInterface() {
        JFrame frame = new JFrame(  "Creativity tutorial");
        JPanel panel = new JPanel(new GridBagLayout());

        gbc.insets = new Insets(20,20,20,20);
        label1 = new JLabel("Label 1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label1,gbc);

        //used to fill width and height of window
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        //gbc.fill = GridBagConstraints.VERTICAL;

        button1 = new JButton("Button 1");
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(button1,gbc);

        button2 = new JButton("Button 2");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(button2,gbc);

        //Setting up frame design

        frame.setSize(new Dimension(800,600));
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(panel);
    }

}