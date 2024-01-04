import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder {
    private StringBuilder sb = new StringBuilder();
    private List<Observer> observers = new ArrayList<>();

    public ObservableStringBuilder append(String str) {
        sb.append(str);
        notifyObservers();
        return this;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
