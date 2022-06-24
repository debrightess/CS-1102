import javax.swing.*;
import javax.swing.JOptionPane ;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String power = JOptionPane.showInputDialog("What is your super power?");
        power = power.toUpperCase(Locale.ROOT);
        JOptionPane.showMessageDialog(null,power+" TO THE RESCUE!");
    }
}

