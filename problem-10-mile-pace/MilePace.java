import java.util.Scanner;

public class MilePace {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter miles: ");
            double miles = sc.nextDouble();
            sc.nextLine(); // clear buffer

            System.out.print("Enter time (MM:SS): ");
            String time = sc.nextLine();

            String pace = milePace(miles, time);
            System.out.println("Average pace per mile = " + pace);

            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again!");
        }
    }

    private static String milePace(double miles, String time) {
        String[] str = time.split(":");
        if (str.length != 2) return "Invalid time format!";

        int minutes = Integer.parseInt(str[0]);
        int seconds = Integer.parseInt(str[1]);

        if (seconds >= 60) return "Invalid seconds (must be < 60).";

        // Convert total time into seconds
        int totalSeconds = minutes * 60 + seconds;

        // Average pace in seconds per mile
        double paceSeconds = totalSeconds / miles;

        int paceMin = (int) (paceSeconds / 60);
        int paceSec = (int) Math.round(paceSeconds % 60);

        return String.format("%02d:%02d", paceMin, paceSec);
    }
}
