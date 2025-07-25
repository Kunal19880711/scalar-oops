package corejava.concurrency.webScapper;

import java.util.concurrent.Callable;

public class ScrapURL implements Callable<Void> {
    private final String url;

    public ScrapURL(String url){
        this.url = url;
    }

    @Override
    public Void call() throws Exception {
        System.out.println("[ " + Thread.currentThread().getName() + " ] Scraping URL: " + url);
        Thread.sleep(500);
        return null;
    }
}