import java.util.Random;

public class MontyHallParadox {
    public static void main(String[] args) {
        Random random = new Random();
        int switchWins = 0; // Counter for wins by switching
        int stickWins = 0;  // Counter for wins by sticking

        for (int i = 0; i < 1000; i++) {
            // Randomly place the car behind one of the three doors
            int carDoor = random.nextInt(3) + 1;

            // Randomly pick a door (player's choice)
            int playerChoice = random.nextInt(3) + 1;

            // Host opens a door with a goat (not the car and not the player's choice)
            int hostChoice;
            do {
                hostChoice = random.nextInt(3) + 1;
            } while (hostChoice == carDoor || hostChoice == playerChoice);

            // Determine the third door (the one not picked by player or host)
            int switchChoice = 6 - playerChoice - hostChoice;

            // Check outcomes
            if (switchChoice == carDoor) {
                switchWins++; // Player wins by switching
            } else if (playerChoice == carDoor) {
                stickWins++; // Player wins by sticking
            }
        }

        // Print results
        System.out.println("Wins by switching: " + switchWins);
        System.out.println("Wins by sticking: " + stickWins);
    }
}
