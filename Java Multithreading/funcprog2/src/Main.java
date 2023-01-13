import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        final int max = 100;
        final int min = 10;
        final int offers = 10;
        final List<Offer> offerList = new ArrayList<>();

        generateOffers(offers, offerList, max, min);
        printTextToConsole("Enter price for meter: ");
        checkOffersFromList(offerList, inputPriceFromUser());
    }

    private static void checkOffersFromList(List<Offer> offerList, int priceForMeter) {
        for (Offer offer : offerList) {
            int height = offer.getHeight();
            int width = offer.getWidth();
            int totalPrice = offer.getTotalPrice();
            printTextToConsole("[Offer] Height: " + height + ", Width: " + width + ", TotalPrice: $" + totalPrice);
            printTextToConsole(" - Check: " + checkOffer(height, width, totalPrice, priceForMeter));
        }
    }

    private static boolean checkOffer(int height, int width, int totalPrice, int priceForMeter) {
        return height * width * priceForMeter >= totalPrice;
    }


    private static void printTextToConsole(String text) {
        System.out.println(text);
    }

    private static int inputPriceFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void generateOffers(int number, List<Offer> offersList, int max, int min) {
        for (int i = 0; i < number; i++) {
            addOfferToList(newOffer(max, min), offersList);
        }
    }

    private static void addOfferToList(Offer offer, List<Offer> offerList) {
        offerList.add(offer);
    }

    private static Offer newOffer(int max, int min) {
        final int width = (int) ((Math.random() * (max - min)) + min);
        final int height = (int) ((Math.random() * (max - min)) + min);
        final int priceForMeter = (int) ((Math.random() * (max - min)) + min);
        return new Offer(width, height, width * height * priceForMeter);
    }
}