package cad.lab6.nomer7_18;

public class App {

    public static final int MAX_RUNS = 1000000;

    public static void main(String[] args) {
        int maxRolls = 50;
        int[] wonGames = new int[maxRolls];
        int[] lostGames = new int[maxRolls];

        for (int i = 0; i < MAX_RUNS; i++) {
            Craps craps = new Craps();
            Craps.GameResult result = craps.play();

            int roll = result.getRollNumber() - 1;
            Craps.Status status = result.getStatus();

            if (status == Craps.Status.WON) {
                wonGames[roll]++;
            }

            if (status == Craps.Status.LOST) {
                lostGames[roll]++;
            }

        }

        System.out.println("Rolls\t\t\tWON\t\t\t\t\tLOST");
        for (int i = 0; i < maxRolls; i++) {
            System.out.println(i + 1 + "\t\t\t\t" + wonGames[i] + "\t\t\t\t" + lostGames[i]);
        }
    }
}
