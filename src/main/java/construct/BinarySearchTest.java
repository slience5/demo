package construct;

public class BinarySearchTest {

    public static void main(String[] args) {
        System.out.println(divid(5));
        System.out.println(Math.sqrt(5));
        
    }
    
    public static double divid(Integer num) {
        double high = num;
        double low = 0.0;
        double mid = high / 2;
        while(String.valueOf(mid).length() - String.valueOf(mid).indexOf(".") <= 20 ) {
            if(Math.pow(mid, 2) == num) {
                return mid;
            }
            else if(Math.pow(mid, 2) > num) {
                high = mid;
            }else if(Math.pow(mid, 2) < num) {
                low = mid;
            }
           mid = (low+high) / 2;
        }
        
        return mid;
    }
}
