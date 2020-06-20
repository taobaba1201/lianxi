import java.util.Stack;


public class MaxArea {
    public static void main(String[] args) {
    
        int[] a = {2, 1, 2, 1, 2, 1, 2, 1};
        System.out.println(maxAreaPeek(a));
    }

    private static int maxAreaPeek(int[] heights) {
        int maxArea = 0;
        int length = heights.length;
        if (0 == length) {
            return 0;
        }
        if (length == 1) {
            return heights[0];
        }
        int[] b = new int[length + 1];
        
        for (int idx = 0; idx < length; idx++) {
            b[idx] = heights[idx];
        }
        b[length] = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < b.length; i++) {
            while (!stack.isEmpty() && b[stack.peek()] > b[i]) {
                int h = stack.pop();    
                // 计算面积
                int len = stack.isEmpty() ? -1 : stack.peek();
                int tmaxArea = b[h] * (i - len - 1);
                maxArea = Math.max(maxArea, tmaxArea);
                // 弹出
            }
            stack.push(i);
        }
        return maxArea;
    
    
    }
}
