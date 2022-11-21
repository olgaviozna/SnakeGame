package main;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
        public MainWindow() throws HeadlessException {
            setTitle("Snake Game");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(320,345);
            setLocation(400,400);
            add(new GameField());
            setVisible(true);
        }

        public static void main(String[] args) {
            main.MainWindow mainWindow = new main.MainWindow();
        }

}