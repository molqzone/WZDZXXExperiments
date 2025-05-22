import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Simulates a livestream red envelope (lucky draw) event.
 * There are 5 red envelopes with amounts: 9, 666, 188, 520, and 99999.
 * Each envelope can only be drawn once.
 * Fans "press any key" to draw a random red envelope until all are taken.
 */
public class RedEnvelopeGame {

    public static void main(String[] args) {
        // Initialize the red envelope amounts
        int[] moneys = {9, 666, 188, 520, 99999};

        // Start the lucky draw
        start(moneys);
    }

    public static void start(int[] moneys) {
        // Convert the array to a moneyList for easier removal after drawing
        ArrayList<Integer> moneyList = new ArrayList<>();
        for (int money : moneys) {
            moneyList.add(money);
        }

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (!moneyList.isEmpty()) {
            System.out.println("Press any key to draw a red envelope...");
            scanner.nextLine();

            // Randomly select a envelope
            int index = random.nextInt(moneyList.size());
            int prize = moneyList.remove(index); // Remove the selected envelope from the list

            System.out.println("Congratulations! You got " + prize + ".");
        }

        // All envelopes have been drawn
        System.out.println("All envelopes have been drawn.");
    }
}
