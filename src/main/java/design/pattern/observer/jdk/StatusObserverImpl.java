package design.pattern.observer.jdk;

import javafx.beans.InvalidationListener;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class StatusObserverImpl implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("notify~~~");
        System.out.println(arg);
    }
}
