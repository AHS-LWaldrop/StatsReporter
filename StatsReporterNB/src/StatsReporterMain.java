
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class StatsReporterMain {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        //different variables needed for the program
        File data = new File("StatsReporterNB//Data.txt");
        Scanner filereader = new Scanner(data);
        Scanner keyboard = new Scanner(System.in);
        StatsReporter teamData = new StatsReporter();
        String input = "";
        int basketsKB;
        int foulShotsKB;
        int totalKB;

        //declaring and initializing an ArrayList
        ArrayList<StatsReporter> team = new ArrayList<>();
        for (int x = 0; x < 6; x++) {
            String name = filereader.nextLine();
            int baskets = filereader.nextInt();
            int foulShots = filereader.nextInt();
            int total = filereader.nextInt();
            team.add(new StatsReporter(name, baskets, foulShots, total));
        }

        //asks user to change player's data
        System.out.println("Would you like to change a player's data? (Y/N)");
        input = keyboard.next();

        //nested loop to change player's data
        while (!(input.equals("N"))) {
            if (input.equals("Y")) {
                System.out.print("Enter the name of the player who's data you would like to change: ");
                input = keyboard.next();
                System.out.println("Enter the number of baskets, foul shots, and total points in that order: ");
                basketsKB = keyboard.nextInt();
                foulShotsKB = keyboard.nextInt();
                totalKB = keyboard.nextInt();
                teamData.changeData(team, input, basketsKB, foulShotsKB, totalKB);
            }
        }

        //lists the filters to sort by
        System.out.println("Please select the filter in which the data is ordered by:");
        System.out.println("alphabetical (alp)");
        System.out.println("baskets (bsk)");
        System.out.println("foul shots (fs)");
        System.out.println("total (ttl)");
        System.out.print("Filter (please type the abbreviation): ");
        input = keyboard.next();

        //selects which filter to run
        if (input.equals("alp")) {
            teamData.alphabeticalOrder(team);
        }
        if (input.equals("bsk")) {
            teamData.basketOrder(team);
        }
        if (input.equals("fs")) {
            teamData.foulShotOrder(team);
        }
        if (input.equals("pnts")) {
            teamData.totalOrder(team);
        }
    }
}
