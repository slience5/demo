package design.pattern.rateLimit;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class InternalErrorException extends Exception {

    public InternalErrorException(String message){
        super(message);
    }

    public InternalErrorException(String message,Exception e){
        super(message,e);
    }
}
