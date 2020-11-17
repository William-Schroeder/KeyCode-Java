package Java;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

 class Main {


        public static void main(String[] argv) throws Exception {

            JTextField textField = new JTextField();

            textField.addKeyListener(new MKeyListener());

            JFrame jframe = new JFrame();

            jframe.add(textField);

            jframe.setSize(700, 700);

            jframe.setVisible(true);

        }
    }
    class MKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {
            boolean ProgrammingMode = false;
            if (ProgrammingMode == true) {
                if (event.getKeyCode() == 10) {System.out.println("E " + event.getKeyCode());}
                else if (event.getKeyCode() == 16) {}
                else{System.out.println(event.getKeyChar() + " Was pressed and the code for that is " + event.getKeyCode());}
                if (event.getKeyCode() == 0) { //Change 0 to KeyCode of the code turn Programming mode to True To Get keycodes in the output
                    //put what you want the system to do here for instance System.out.println("Text")
                }
            }
            }
        }
