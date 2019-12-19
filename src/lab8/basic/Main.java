package lab8.basic;
//swing framework
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        //Creating the Frame
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);

        JLabel divider = new JLabel("/");
        JLabel resultLabel = new JLabel();

        JTextArea error = new JTextArea();
        Font font = new Font("Courier New", Font.PLAIN, 12);
        error.setFont(font);
        error.setForeground(Color.RED);

        final JScrollPane scroll = new JScrollPane(error);
        JTextField tf1 = new JTextField(5);
        JTextField tf2 = new JTextField(5);
        JButton send = new JButton("=");
        JButton reset = new JButton("Reset");

        JPanel panel = new JPanel();
        panel.add(reset);
        panel.add(tf1);
        panel.add(divider); // Components Added using Flow Layout
        panel.add(tf2);
        panel.add(send);
        panel.add(resultLabel);

       send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Integer value1 = Integer.valueOf(tf1.getText());
                    Integer value2 = Integer.valueOf(tf2.getText());
                    String result = String.valueOf(value1 / value2);
                    resultLabel.setText(result);
                }catch (Throwable t){
                    Main.displayError(t, error);
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            scroll.getVerticalScrollBar().setValue(0);
                        }
                    });
                }
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                error.setText("");
                resultLabel.setText("");
            }
        });

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, scroll);
        frame.setVisible(true);
    }

    private static void displayError(Throwable error, JTextArea jTextArea) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        error.printStackTrace(pw);
        jTextArea.setText(sw.toString());
    }
}
