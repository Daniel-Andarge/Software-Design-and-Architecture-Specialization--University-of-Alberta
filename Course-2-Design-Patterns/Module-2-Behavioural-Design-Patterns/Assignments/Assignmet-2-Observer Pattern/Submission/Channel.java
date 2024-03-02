import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Observer> observers;

    public Channel() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
