import java.util.Stack;

public class OneEditAway {

    public static void main(String[] args) {

        String first = "abcdxabcde";
;

        String second = "abcdeabcd";

        System.out.println(oneEidtAway(first, second));
    }

    private static boolean oneEidtAway(String first, String second) {
        
        if (first.isBlank() || second.isBlank()) {
            return true;
        }

        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        Stack<Pair<Character, Integer>> stack = new Stack<Pair<Character, Integer>>();

        char[] firstArray = first.toCharArray();

        char[] secondAray  = second.toCharArray();

        int len1 = firstArray.length;

        int len2 = secondAray.length;

        int i = 0;

        Pair<Character, Integer> pair = new Pair<Character, Integer>(firstArray[i], i);

        stack.push(pair);


        while (true) {
            
            if (i < len2) {
                compareChar(stack, secondAray, i);
            }
            
            i++;

            if (i < len1 ) {

                compareChar(stack, firstArray, i);
            }

            if (i == Math.max(len1, len2)) {
                break;
            }


        }

        if (stack.size() <= 1 || (stack.size() == 2 &&  stack.get(0).getValue() == stack.get(1).getValue())){
            
            return true;
        }

        return false;
    }

    private static void compareChar(Stack<Pair<Character, Integer>> stack, char[] secondAray, int i) {
        
        if (stack.isEmpty()) {
            
            Pair<Character, Integer> pair = new Pair<Character, Integer>(secondAray[i], i);

            stack.push(pair);
            
            return;
        }

        if (secondAray[i] == stack.peek().getKey()) {
            
            stack.pop();

        } else {

            Pair<Character, Integer> pair = new Pair<Character, Integer>(secondAray[i], i);

            stack.push(pair);


        }
    }

    private static class Pair<K, V> {

        private K key;

        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

    }
}