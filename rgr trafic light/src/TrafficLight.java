import java.util.ArrayList;
import java.util.List;

class TrafficLight {
    private List<TrafficLightObs> observers = new ArrayList<>();
    private String currentColor;

    public void addObserver(TrafficLightObs observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.update(currentColor));
    }

    public void start() {
        while (true) {
            // Красный 10 секунд
            currentColor = "Red";
            for (int i = 0; i < 100; i++) {
                notifyObservers();
                sleep(50); // приостанавливает на 10 секунд
            }

            // Желтый 5 секунд
            currentColor = "Yellow";
            for (int i = 0; i < 100; i++) {
                notifyObservers();
                sleep(20); // 5 секунд  50 = 50 мс
            }

            // Зеленый 10 секунд
            currentColor = "Green";
            for (int i = 0; i < 100; i++) {
                notifyObservers();
                sleep(100);
            }

            // Желтый 5 секунд
            currentColor = "Yellow";
            for (int i = 0; i < 100; i++) {
                notifyObservers();
                sleep(20); // 5 секунд  50 = 50 мс
            }
        }
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}