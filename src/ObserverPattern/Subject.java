package ObserverPattern;

public interface Subject {
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifyObservers();
    public void update(String magazineContext, String paperContext);
}
