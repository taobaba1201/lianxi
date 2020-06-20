public class IsPalindRome {
    
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        
        if (s.isBlank()) {
            return true;
        }
        
        String s2 = s.replaceAll("[^0-9a-zA-Z]", "");
        for (int i = 0; i < s2.length() / 2; i++) {
            if (Character.toUpperCase(s2.charAt(i)) != Character.toUpperCase(s2.charAt(s2.length() - i - 1))) {
                return false;
            }
        }
        
        return true;
    }

    
}