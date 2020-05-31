package ObserverPattern;

public class Main {
    public static void main(String args[]) {
        MagazineSubscriber magazineSubscriber = new MagazineSubscriber();
        PaperSubscriber paperSubscriber = new PaperSubscriber();
        Data data = new Data();
        data.subscribe(magazineSubscriber);
        data.subscribe(paperSubscriber);
        data.update("new Magazine", "new Paper");
    }
}
