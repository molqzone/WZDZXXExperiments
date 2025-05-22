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

    /**
     * Simulates the lucky draw process.
     * @param moneys The array of red envelope amounts
     */
    public static void start(int[] moneys) {
        // Convert the array to a list for easier removal after drawing
        ArrayList<Integer> moneyList = new ArrayList<>();
        for (int money : moneys) {
            moneyList.add(money);
        }

        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        // Random object to generate random indices
        Random random = new Random();

        // Continue drawing until all envelopes are drawn
        while (!moneyList.isEmpty()) {
            System.out.print("Press any key to draw a red envelope: ");
            scanner.nextLine(); // Wait for user input (input not actually used)

            // Randomly select an envelope
            int index = random.nextInt(moneyList.size());
            int prize = moneyList.remove(index); // Remove the selected envelope

            // Announce the result
            System.out.println("Congratulations! You got: " + prize);
        }

        // All envelopes have been drawn
        System.out.println("The event is over.");
    }
}
