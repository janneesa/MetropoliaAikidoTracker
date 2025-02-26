
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AikidoTracker tracker = new AikidoTracker();
        Scanner scanner = new Scanner(System.in);
        int choice;

        boolean systemOn = true;

        System.out.println("Welcome to Aikido Tracker!");

        while (systemOn) {
            System.out.println("Enter 1 to add training: ");
            System.out.println("Enter 2 to check kyu graduation eligibility: ");
            System.out.println("Enter 3 to check total training hours:");
            System.out.println("Enter 4 to exit: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the date of training (yyyy-MM-dd):");
                    String dateString = scanner.next();
                    System.out.println("Enter the number of hours:");
                    int hours = scanner.nextInt();
                    tracker.addTraining(dateString, hours);
                    break;
                case 2:
                    if (tracker.isEligibleForKyuGraduation()) {
                        System.out.println("You are eligible for kyu graduation!");
                    } else {
                        System.out.println("You are not eligible for kyu graduation yet.");
                    }
                    break;
                case 3:
                    System.out.println("Total training hours: " + tracker.getTotalTrainingHours());
                    break;
                case 4:
                    systemOn = false;
                    break;
            }
        }
    }
}