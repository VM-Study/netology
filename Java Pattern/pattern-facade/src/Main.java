public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        // 12 + 5 = 17 = 10001
        System.out.println(bins.sum("1100", "0101"));

        // 7 * 3 = 21 = 10101
        System.out.println(bins.mult("0111", "0011"));
    }
}