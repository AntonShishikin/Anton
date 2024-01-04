package gui;

import javax.swing.*;
import java.awt.*;

public class ImageDisplayApp {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ImageDisplayApp <path-to-image>");
            System.exit(1);
        }

        String imagePath = args[0];

        JFrame frame = new JFrame("Image Display");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(imageIcon);
        JScrollPane scrollPane = new JScrollPane(label);  // Добавляем возможность прокрутки, если изображение слишком большое
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
