import javax.swing.*; //
import java.awt.*;

class TrafficLightImage extends JPanel implements TrafficLightObs {
    private Color currentRed;
    private Color currentYellow;
    private Color currentGreen;

    public void update(String color) {
        currentRed = Color.GRAY;
        currentYellow = Color.GRAY;
        currentGreen = Color.GRAY;

        switch (color) {
            case "Red":
                currentRed = Color.RED;
                break;
            case "Yellow":
                currentYellow = Color.YELLOW;
                break;
            case "Green":
                currentGreen = Color.GREEN;
                break;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(currentGreen);
        g.fillOval(75, 30, 100, 100);
        g.setColor(currentYellow);
        g.fillOval(75, 130, 100, 100);
        g.setColor(currentRed);
        g.fillOval(75, 230, 100, 100);
    }
}