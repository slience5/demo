package design.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class GuavaWatcherTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new StatusSubscriber());
        eventBus.register(new OtherSubscriber());

        eventBus.post("ssss");
        eventBus.post(1);

        System.out.println("end~~~~~~");
    }
}
