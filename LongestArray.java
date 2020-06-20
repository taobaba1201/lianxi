import java.util.HashSet;
import java.util.Set;

public class LongestArray {
    public static void main(String[] args) {
        
        int[] a = { 100, 4, 1, 3, 2, 5, 80 };

        System.out.println(longestArray(a));
    }

    private static int longestArray(int[] a) {
        
        Set<Integer> set = new HashSet<Integer>();

        int result = 0;

        for (int num : a) {
            set.add(num);
        }

        for (int e : set) {
            if (!set.contains(e - 1)) {
                int currResult = 1;
                int currNum = e;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currResult++;
                }
                result = Math.max(currResult, result);
            }   
        }
        
        return result;
    }
}