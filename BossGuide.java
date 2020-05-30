import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class BossGuide {
    static String level;
    static String newChoice;
    public static void main(String[] Args) throws IOException {

// Print Welcome Screen
        System.out.println("Welcome to the MegaMan 1 Boss Guide");

        // do statement to assign loop function of app
        do {
            // Prompt user for Boss Name
            System.out.println("Type the Boss name for Weakness, Type the letter 'O' for Boss Order, Type 'T' for Thunder BeaM Trick, Type Q to quit \n");
            System.out.println("Bomb, Cut, Elec, Fire, Gut, Ice, Bubble, Wily1, Wily2, Clone, Rock\n");

            // Take input from User
            Scanner scanner = new Scanner(System.in);
            // Define a InputStreamReader based on Standard Input (System.in)
            InputStreamReader isReader = new InputStreamReader(System.in);
            // Send the InputStreamReader to a BufferedReader
            BufferedReader stdin = new BufferedReader(isReader);

            level = scanner.next();

            // Parameters for each boss
            if (level.equalsIgnoreCase("Bomb")) {
                System.out.println("To defeat Bomb Man, use the Megabuster (Also weak to Fire Storm)");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Cut")) {
                System.out.println("To defeat Cut Man, use the SuperArm and MegaBuster");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Elec")) {
                System.out.println("To defeat Elec Man, use the Rolling Cutters)");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Fire")) {
                System.out.println("To defeat Fire Man, use the Ice Slasher)");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Guts")) {
                System.out.println("To defeat Guts Man, use the Hyper Bombs)");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Ice")) {
                System.out.println("To defeat Ice Man, use the Thunder Beam)");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Bubble")) {
                System.out.println("To defeat Bubble Machine, use the Megabuster (Also weak to Fire Storm)");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Wily1")) {
                System.out.println("To defeat the first Dr. Wily, use the Fire Storm)");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Wily2")) {
                System.out.println("To defeat the second Dr. Wily, use the Thunder Beam)");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Clone")) {
                System.out.println("To defeat the MegaMan Clone, use the Thunder Beam)");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Rock")) {
                System.out.println("To defeat Rock Monster, use the Thunder Beam)");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("O")) {
                System.out.println("The preferred boss order is: \n");
                System.out.println("Bomb Man, Guts Man, Cut Man, Elec Man, Ice Man, Fire Man \n");
                System.out.println("Rock Monster, Mega Man Clone, Bubble Machine, Dr. Wily (First), Dr. Wily (Second) \n");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("T")) {
                System.out.println("The Thunder Beam Trick is: \n");
                System.out.println("There’s an interesting glitch in the game when using Elec Man’s weapon, the Thunder Beam. \n");
                System.out.println("If you shoot it and then press Select (to pause the game), you’ll allow the beam to strike \n");
                System.out.println("an enemy more than once \n");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }
            if (level.equalsIgnoreCase("Q")) {
                System.out.println("Thank you for using the Mega Man Boss Guide");
                System.exit(0);
            }
        } while (!level.equalsIgnoreCase("Q"));
    }

}