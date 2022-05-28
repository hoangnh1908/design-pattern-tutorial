import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void AttachObserver(Observer observer) {
        observers.add(observer);
    }

    public void DetachObserver(Observer observer) {
        observers.remove(observer);
    }

    public void NotifyObserver(Subject subject, Object arg) {
        observers.forEach((observer) -> observer.Notify(subject, arg));
    }


}
