package leetcode;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class LengthOfSubString {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwekw"));
        System.out.println(lengthOfLongestSubstring("au"));
    }

    public static int lengthOfLongestSubstring(String s) {
        return doGetLengthOfString(s);
    }

    private static int doGetLengthOfString(String s){
        int head = 0;
        int tail = 0;
        int tempLength = 0;

        char[] chars = s.toCharArray();
        String tempStr = "";
        while(tail <= s.length()-1){
            if("".equals(tempStr)){
                tempStr += chars[tail++];
            }else if(tempStr.contains("" + chars[tail])){
                if(tempStr.length() > tempLength){
                    tempLength = tempStr.length();
                }
                head = head + tempStr.indexOf(chars[tail]) + 1;
                tail = head;
                tempStr = "";
            }else{
                tempStr += chars[tail++];
            }
        }

        if(tempStr.length() > tempLength){
            tempLength = tempStr.length();
        }

        return tempLength;
    }
}
