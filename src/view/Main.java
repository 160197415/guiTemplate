package view;

import view.AInterface;
import javax.swing.*;

/**
 * @version 0.0.1, 07/10/20
 */

public class Main {
    /**
     * This is a standard class used for Java Swing-based GUI applications, which creates a thread for the application
     * to run within.
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(AInterface::new);
    }
}
