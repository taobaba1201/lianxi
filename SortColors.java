
public class SortColors {

    public static void Main(String[] args) {
        int[] colors = {2,0,2,1,1,0};

        sortColor(colors);
    }

    private static void sortColor(int[] colors) {
        int len = colors.length;
        int p0 = 0, curr = 0;
        int p2 = len - 1;
        while (curr <= p2) {
            int tmp;
            if (colors[curr] == 0) {
                tmp = colors[p0];
                colors[p0++] = colors[curr];
                colors[curr++] = tmp;
           }
           else if (colors[curr] == 2) {
               tmp = colors[curr];
               colors[curr++] = colors[p2];
               colors[p2--] = tmp;
           }
           else curr++;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}