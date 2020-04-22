package leetcode;

public class DetectCaptial {

    
    public static void main(String[] args) {
        String testStr = "mL";
        
        System.out.println(checkStr(testStr));
    }
    
    public static boolean checkStr(String s) {
        if(s.length() < 2) {
            return true;
        }
        
        boolean flag = !(s.charAt(0) >= 97 && s.charAt(0) <= 122);
        
        if((s.charAt(1) < 97 || s.charAt(1) > 122) && !flag) {
            return false;
        }
        
        if((s.charAt(1) >= 97 && s.charAt(1) <= 122) && flag) {
            flag = false;
        }
        
        if(s.length() >= 2) {
            for(int i=2;i<=s.length()-1;i++) {
                if((s.charAt(i) >= 97 && s.charAt(i) <= 122) == flag) {
                    return false;
                }
            }
        }
        
      return true;
    }
}
