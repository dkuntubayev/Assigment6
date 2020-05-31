package ObserverPattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Data implements Subject {
    String magazineContext;
    String paperContext;
    ArrayList<Observer> ObserverList;

    public Data() {
        ObserverList = new ArrayList<Observer>();
    }

    @Override
    public void subscribe(Observer observer) {
        ObserverList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        ObserverList.remove(ObserverList.indexOf(observer));
    }

    @Override
    public void notifyObservers() {
        for (Iterator<Observer> iterator = ObserverList.iterator(); iterator.hasNext();) {
            Observer observer = iterator.next();
            observer.update(magazineContext, paperContext);
        }
    }

    @Override
    public void update(String magazineContext, String paperContext) {
        this.magazineContext = magazineContext;
        this.paperContext = paperContext;
        notifyObservers();
    }


}
