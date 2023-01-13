import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] commands = new int[][]{
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };
        int[] top10 = findTop10(commands, 10);

        System.out.println(Arrays.toString(top10));
    }

    private static int[] findTop10(int[][] commands, int top) {
        int[] total = commands[0];
        for (int i = 1; i < commands.length; i++) {
            total = merge(total, commands[i], top);
        }
        return total;
    }

    private static int[] merge(int[] a, int[] b, int top) {
        int[] c = new int[top];
        int ia = 0;
        int ib = 0;
        int ic = 0;

        while ((ia < a.length || ib < b.length) && ic < top) {
            if (ia == a.length) {
                c[ic] = b[ib];
                ib++;
            } else if (ib == b.length) {
                c[ic] = a[ia];
                ia++;
            } else {
                if (a[ia] >= b[ib]) {
                    c[ic] = a[ia];
                    ia++;
                } else {
                    c[ic] = b[ib];
                    ib++;
                }
            }
            ic++;
        }
        return c;
    }
}