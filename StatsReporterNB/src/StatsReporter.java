
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class StatsReporter {

    Scanner input = new Scanner(System.in);
    private String name;
    private int baskets;
    private int foulShots;
    private int total;

    //class constructor
    public StatsReporter(String nm, int bsk, int fs, int ttl) {
        name = nm;
        baskets = bsk;
        foulShots = fs;
        total = ttl;
    }

    public StatsReporter() {

    }

    //sorts in alphabetical order
    public void alphabeticalOrder(ArrayList<StatsReporter> team) {

    }

    //sorts in order of most baskets
    public void basketOrder(ArrayList<StatsReporter> team) throws IOException {
        FileWriter output = new FileWriter("Z://Programming_IV//Java_Review//StatsReporter//Output.txt");
        int count = 0;
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 5; y++) {
                if (team.get(y).getBaskets() < team.get(x).getBaskets()) {
                    count++;
                } else {
                    count--;
                }
                if (count == 5) {
                    output.write(team.get(x).getName());
                    output.write(": " + this.chartPrint(team, y) + "\n");
                }
            }
        }
    }

    //sorts in order of most foulShots
    public void foulShotOrder(ArrayList<StatsReporter> team) throws IOException {
        FileWriter output = new FileWriter("Z://Programming_IV//Java_Review//StatsReporter//Output.txt");
        int count = 0;
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 5; y++) {
                if (team.get(y).getFoulShots() < team.get(x).getFoulShots()) {
                    count++;
                } else {
                    count--;
                }
                if (count == 5) {
                    output.write(team.get(x).getName());
                    output.write(": " + this.chartPrint(team, y) + "\n");
                }
            }
        }
    }

    //sorts in order of most points
    public void totalOrder(ArrayList<StatsReporter> team) throws IOException {
        FileWriter output = new FileWriter("Z://Programming_IV//Java_Review//StatsReporter//Output.txt");
        int count = 0;
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 5; y++) {
                if (team.get(y).getTotal() < team.get(x).getTotal()) {
                    count++;
                } else {
                    count--;
                }
                if (count == 5) {
                    output.write(team.get(x).getName());
                    output.write(": " + this.chartPrint(team, y) + "\n");
                }
            }

        }
    }

    //changes the data of a player
    public void changeData(ArrayList<StatsReporter> team, String name, int baskets, int foulShots, int total) throws FileNotFoundException {
        for (int x = 0; x < 8; x++) {
            if (team.get(x).getName() == name) {
                
            }
        }
    }

    //makes a String of "*" to show total points of a player
    public String chartPrint(ArrayList<StatsReporter> team, int y) {
        String chart = "";
        for (int x = 0; x < team.get(y).getTotal(); x++) {
            chart += "*";
        }
        return chart;
    }

    //returns the name
    public String getName() {
        return name;
    }

    //returns number of baskets
    public int getBaskets() {
        return baskets;
    }
    
    //changes the value of baskets
    public void setBaskets(int b){
        baskets = b;
    }

    //returns number of foul shots
    public int getFoulShots() {
        return foulShots;
    }
    
    //changes the value of foulShots
    public void setFoulShots(int fs){
        foulShots = fs;
    }

    //return total
    public int getTotal() {
        return total;
    }
    
    //changes the value of total
    public void setTotal(int ttl){
        total = ttl;
    }
}
