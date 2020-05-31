package ObserverPattern;

import java.util.Date;

public interface Observer {
    public void update(String magazineContext, String paperContext);
    public void display();
}

