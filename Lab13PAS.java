import java.awt.*;
import java.awt.event.*;
class Lab13PAS extends Frame{
    Lab13PAS(String s) {
        super(s);
        setSize(400, 150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
        public static void main(String[]args){
            new Lab13PAS("Моя программа");
        }
    }

