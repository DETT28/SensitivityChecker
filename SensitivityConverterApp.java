/*
 * This program will convert hip-fire sensitivity values
 * from one popular FPS video game to another.
 */

public class SensitivityConverterApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Sensitivity Converter!");
        System.out.println("What is you current sensitivity value?");
        double sensitivity = Double.parseDouble(System.console().readLine());

        System.out.println("Which of these games is your current sensitivity value from?");
        System.out.println("1. Counter-Strike");
        System.out.println("2. Valorant");
        System.out.println("3. Overwatch");
        System.out.println("4. Apex Legends");
        int fromGameChoiceNum = Integer.parseInt(System.console().readLine());
        String fromGameChoice = "";

        switch (fromGameChoiceNum) {
            case 1:
                fromGameChoiceNum = 0;
                fromGameChoice  = "Counter-Strike"; // Counter-Strike
                break;
            case 2:
                fromGameChoiceNum = 1;
                fromGameChoice = "Valorant"; // Valorant
                break;
            case 3:
                fromGameChoiceNum = 2;
                fromGameChoice = "Overwatch"; // Overwatch
                break;
            case 4:
                fromGameChoiceNum = 3; 
                fromGameChoice = "Apex Legends"; // Apex Legends
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        System.out.println("Which game would you like to convert to?");
        System.out.println("1. Counter-Strike");
        System.out.println("2. Valorant");
        System.out.println("3. Overwatch");
        System.out.println("4. Apex Legends");
        int toGameChoiceNum = Integer.parseInt(System.console().readLine());
        String toGameChoice = "";

        switch (toGameChoiceNum) {
            case 1:
                toGameChoiceNum = 0;
                toGameChoice = "Counter-Strike"; // Counter-Strike
                break;
            case 2:
                toGameChoiceNum = 1;
                toGameChoice = "Valorant"; // Valorant
                break;
            case 3:
                toGameChoiceNum = 2;
                toGameChoice = "Overwatch"; // Overwatch
                break;
            case 4:
                toGameChoiceNum = 3;
                toGameChoice = "Apex Legends"; // Apex Legends
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        // Perform conversion and display result
        double convertedSensitivity = SensitivityConverter.convert(sensitivity, fromGameChoiceNum, toGameChoiceNum);
        System.out.printf("Your %s sensitivity of %.4f is equivalent to %.4f in %s.%n",
                fromGameChoice, sensitivity, convertedSensitivity, toGameChoice);
    }
}
