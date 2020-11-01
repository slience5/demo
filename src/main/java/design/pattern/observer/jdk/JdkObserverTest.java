package design.pattern.observer.jdk;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class JdkObserverTest {

    public static void main(String[] args) {
        StatusWatcher watcher = new StatusWatcher();
        watcher.addObserver(new StatusObserverImpl());

        watcher.setStatus("gggg");
        watcher.setStatus("oooo");

        System.out.println("~~~~~~end");

    }


}
