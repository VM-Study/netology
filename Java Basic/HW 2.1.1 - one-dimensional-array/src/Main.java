import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"};
        int[] prices = new int[]{100, 200, 300};
        int[] productCountOrder = new int[products.length];

        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " " + prices[i] + " руб/шт");
        }

        Scanner scanner = new Scanner(System.in);
        String outListPrint = "";
        int sumTotal = 0;
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            String[] parts = input.split(" "); // 1 10
            int productNumber = Integer.parseInt(parts[0]);
            int productCount = Integer.parseInt(parts[1]);
            productNumber--;
            productCountOrder[productNumber] += productCount;
        }
        System.out.println("Наименование товара -  Количество -  Цена/за.ед -  Общая стоимость");
        for (int i = 0; i < productCountOrder.length; i++) {
            if (productCountOrder[i] > 0) {
                int currentPrice = prices[i] * productCountOrder[i];
                System.out.println((i + 1) + ". " + products[i] + "           -  " +
                        productCountOrder[i] + "         -  " +
                        prices[i] + "        -  " + currentPrice);
                sumTotal += currentPrice;
            }
        }
        System.out.println("                                    Итого: " + sumTotal);

    }
}
