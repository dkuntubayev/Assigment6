package ObserverPattern;

import java.util.Date;

public class MagazineSubscriber implements Observer {
    String magazineContext;

    @Override
    public void update(String magazineContext, String paperContext) {
        this.magazineContext = magazineContext;
        display();
    }
    
    @Override
    public void display() {
        System.out.println("New data in magazine: " + magazineContext);
    }
}
