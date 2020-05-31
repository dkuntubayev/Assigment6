package ObserverPattern;

import java.util.Date;

public class PaperSubscriber implements Observer {
    String paperContext;

    @Override
    public void update(String magazineContext, String paperContext) {
        this.paperContext = paperContext;
        display();
    }

    @Override
    public void display() {
        System.out.println("New data in paper: " + paperContext);
    }
}
