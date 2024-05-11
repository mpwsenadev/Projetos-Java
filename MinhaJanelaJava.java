import javax.swing.*;
import java.awt.*;

public class MinhaJanelaJava{
    public static void main(String[] args) {

        JLabel label = new JLabel("Hello!", JLabel.CENTER);
        label.setFont(new Font("Calibri", Font.BOLD, 40));
        // JANELA
        JFrame janela = new JFrame();
        janela.setSize(500, 500);
        janela.getContentPane().setBackground(new Color(200, 30, 50));
        janela.add(label);
        janela.setVisible(true);
    }
}
