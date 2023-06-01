import java.awt.event.*;
import java.awt.*;

public class Main extends Frame {
    public Main() {
        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawLine(20, 40, 100, 90);
        g.drawLine(20, 90, 100, 40);
        g.drawLine(40, 45, 250, 80);

        g.clearRect(20, 150, 60, 50);
        g.fillRect(110, 150, 60, 50);
        g.drawRoundRect(200, 150, 60, 50, 15, 15);
        g.fillRoundRect(290, 150, 60, 50, 30, 40);

        g.drawOval(20, 250, 50, 50);
        g.fillOval(100, 250, 75, 50);
        g.drawOval(200, 260, 100, 40);

        g.drawArc(20, 350, 70, 70, 0, 180);
        g.fillArc(70, 350, 70, 70, 0, 75);

        int[] x = { 20, 200, 20, 200, 20 };
        int[] y = { 450, 450, 650, 650, 450 };
        int num = 5;
        g.drawPolygon(x, y, num);
    }

    public static void main(String[] args) {
        Main app = new Main();

        app.setSize(new Dimension(370, 700));
        app.setTitle("Graphics Demo");
        app.setVisible(true);
    }
}