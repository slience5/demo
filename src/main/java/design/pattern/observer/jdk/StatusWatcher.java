package design.pattern.observer.jdk;

import java.util.Observable;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class StatusWatcher extends Observable {


    public void setStatus(String status){
        System.out.println("set status~~~~~~~~~~~~~");
        setChanged();
        notifyObservers(status);
    }
}
