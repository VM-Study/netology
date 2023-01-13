import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] field = new String[][]{
                {"P", "-", "-", "*", "*", "-", "-", "-", "-", "-"},
                {"-", "-", "-", "-", "*", "-", "*", "*", "-", "-"},
                {"-", "-", "-", "*", "-", "*", "-", "-", "-", "*"},
                {"-", "*", "-", "-", "-", "-", "-", "-", "H", "-"},
                {"-", "-", "-", "-", "-", "-", "*", "-", "-", "-"},
                {"-", "-", "*", "-", "-", "*", "-", "-", "-", "-"},
                {"-", "-", "-", "*", "-", "-", "*", "*", "*", "-"},
                {"-", "-", "-", "-", "-", "-", "-", "*", "-", "-"},
                {"-", "-", "-", "-", "-", "-", "-", "*", "-", "-"},
                {"-", "-", "-", "-", "-", "*", "*", "-", "-", "-"}
        };
        String[][] finalPath = findPath(field, 3, 8);
        for (int i = 0; i < finalPath.length; i++) {
            System.out.println(Arrays.toString(finalPath[i]));
        }

    }

    private static String[][] findPath(String[][] field, int x0, int y0) {

        String[][] path = new String[field.length][];
        for(int i = 0; i < field.length; i++) {
            path[i] =  new String[field[i].length];
            System.arraycopy(field[i], 0, path[i], 0, field[i].length);
        }

        int x = x0;
        int y = y0;
        String direction;
        while (x != 0 || y != 0) {
            direction = whereFrom(field, x, y);
            if (direction.equals("N")) {
                return path;
            } else if (direction.equals("U")) {
                path[x][y] = "x";
                y -= 1;
            } else if (direction.equals("L")) {
                path[x][y] = "x";
                x -= 1;
            }
        }
        path[x0][y0] = "H";
        return path;
    }

    private static String whereFrom(String[][] field, int x, int y) {
        String[][] memory = new String[field.length][];
        for(int i = 0; i < field.length; i++) {
            memory[i] =  new String[field[i].length];
            System.arraycopy(field[i], 0, memory[i], 0, field[i].length);
        }
        return whereFrom(field, x, y, memory);
    }

    private static String whereFrom(String[][] field, int x, int y, String[][] memory) {
        int leftX;
        int leftY;
        int upX;
        int upY;
        if (memory[x][y].equals("P")) {
            return memory[x][y];
        }
        if (x > 0) {
            leftX = x - 1;
            leftY = y;
            if (leftX == 0 && leftY == 0) {
                memory[x][y] = "L";
                return "L";
            }
            if (!field[leftX][leftY].equals("*")) {
                if (!whereFrom(field, leftX, leftY, memory).equals("N")) {
                    memory[x][y] = "L";
                    return "L";
                }
            }
        }
        if (y > 0) {
            upX = x;
            upY = y - 1;
            if (upX == 0 && upY == 0) {
                memory[x][y] = "U";
                return "U";
            }
            if (!field[upX][upY].equals("*")) {
                if (!whereFrom(field, upX, upY, memory).equals("N")) {
                    memory[x][y] = "U";
                    return "U";
                }
            }
        }
        memory[x][y] = "N";
        return "N";
    }


}
