package design.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class OtherSubscriber {

    @Subscribe
    public void printStatus(Integer status){
        System.out.println("subscriber  success + status : " + status);
    }
}
