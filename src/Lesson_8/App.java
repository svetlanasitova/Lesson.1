package Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame {
    int num = 0;

    private final static String TEXT = "Кнопка переключения";

    public App() {
        setTitle("Моя Java программа.");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 300);
        setResizable(false);

        Font font = new Font("Arial", Font.BOLD, 30);
        JTextField jTextField = new JTextField();
        JButton jButton = new JButton(TEXT);

        jButton.setFont(font);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               jTextField.setText(generateNumber());
            }
        });

        jTextField.setFont(font);
        jTextField.setHorizontalAlignment(0);

        add(jTextField,BorderLayout.CENTER);
        add(jButton,BorderLayout.SOUTH);

        setVisible(true);
    }

    private String generateNumber() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+7");
        stringBuilder.append("999");
        for (int i = 0; i < 7; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }

}
