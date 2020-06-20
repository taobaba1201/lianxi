public class OneEditAway2 {

    public static void main(String[] args) {

        String first = "ab";

        String second = "a";

        System.out.println(oneEidtAway(first, second));
    }

    private static boolean oneEidtAway(String first, String second) {
        
        if (first.isBlank() || second.isBlank()) {
            return true;
        }

        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        if (isEqual(first, second)) {
            return true;
        }

        if (Math.abs(first.length() - second.length()) == 1) {
            if (first.length() > second.length()) {
               for (int i = 0; i < second.length(); i++) {
                    StringBuilder sb = new StringBuilder(second);
                    sb.insert(i, "0");
                    if (isEqual(first, sb.toString())) {
                        return true;
                    }
               }
           }

           if (first.length() < second.length()) {
               for (int i = 0; i < second.length(); i++) {
                   StringBuilder sb = new StringBuilder(first);
                   sb.insert(i, "0");
                   if (isEqual(sb.toString(), second)) {
                       return true;
                   }
               }
           }

        }
        return false;
    }

    private static boolean isEqual(String first, String second) {
        
        if (first.length() == second.length()) {
            int uniqCount = 0;
            for (int idx = 0; idx < first.length(); idx++) {
                if (!(first.charAt(idx) == second.charAt(idx))) {
                    uniqCount += 1;
                }
            }
            if (uniqCount <= 1) {
                return true;
            }

        }
        return false;
    }
}
