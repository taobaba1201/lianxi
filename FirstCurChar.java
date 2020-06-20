
public class FirstCurChar {
    
    public static void main(String[] args) {
        String s = "abaccdeff";

        System.out.println(findOnlyCurOnceChar(s));
    }

    private static char findOnlyCurOnceChar(String s) {
        if (s == "") {
            return ' ';
        }
        for (Character c : s.toCharArray()) {
            if (s.indexOf(c.toString()) == s.lastIndexOf(c.toString())) {
                return c;
            }
        }
        
        return ' ';
    }
}