import javax.swing.*;
import java.awt.*;

public class BlackWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Black Window");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK); // boom, black
        frame.add(panel);

        frame.setVisible(true);
    }
}
