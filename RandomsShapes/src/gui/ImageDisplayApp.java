package gui;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ImageDisplayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path to the image: ");
        String imagePath = scanner.nextLine();

        JFrame frame = new JFrame("Image Display");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(imageIcon);
        JScrollPane scrollPane = new JScrollPane(label);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
