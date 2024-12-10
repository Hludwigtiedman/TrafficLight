import javax.swing.*;

public class TrafficLightSystem {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light");
        TrafficLight trafficLight = new TrafficLight();
        TrafficLightImage display = new TrafficLightImage();

        trafficLight.addObserver(display);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 400);
        frame.add(display);
        frame.setVisible(true);

        new Thread(() -> trafficLight.start()).start();
    }
}