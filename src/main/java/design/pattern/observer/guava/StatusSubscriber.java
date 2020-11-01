package design.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class StatusSubscriber {
    @Subscribe
    public void printStatus(String status){
        System.out.println("subscriber  success + status : " + status);
    }
}
