package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedDisplayApp {
    private static final int FRAME_DELAY = 500;

    private static final String[] IMAGE_PATHS = {"/Users/mac/IdeaProjects/RandomsShapes/src/images/frame1.jpg", "/Users/mac/IdeaProjects/RandomsShapes/src/images/frame2.jpg", "/Users/mac/IdeaProjects/RandomsShapes/src/images/frame3.jpg", "/Users/mac/IdeaProjects/RandomsShapes/src/images/frame4.jpg"};

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animated Display");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        ImageIcon[] imageIcon = new ImageIcon[IMAGE_PATHS.length];
//        imageIcon[0] = new ImageIcon("/Users/mac/IdeaProjects/RandomsShapes/src/images/frame2.jpg");
//        JLabel label = new JLabel(imageIcon[0]);
//        JScrollPane scrollPane = new JScrollPane(label);
//        frame.add(scrollPane);
//
//        frame.setVisible(true);

        ImageIcon[] imageIcons = new ImageIcon[IMAGE_PATHS.length];
        for (int i = 0; i < IMAGE_PATHS.length; i++) {
            imageIcons[i] = new ImageIcon(IMAGE_PATHS[i]);
        }

        JLabel label = new JLabel(imageIcons[0]);
        JScrollPane scrollPane = new JScrollPane(label);
        frame.add(scrollPane);

        Timer timer = new Timer(FRAME_DELAY, new ActionListener() {
            int currentFrame = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % IMAGE_PATHS.length;
                label.setIcon(imageIcons[currentFrame]);
            }
        });

        frame.setVisible(true);
        timer.start();
    }
}
