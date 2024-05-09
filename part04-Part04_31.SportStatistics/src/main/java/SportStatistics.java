
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String file = scanner.nextLine();
        
        System.out.println("Team: ");
        String team = scanner.nextLine();
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        try {
            Scanner fileScanner = new Scanner(Paths.get(file));
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if(line.trim().isEmpty() || !line.contains(",")) {
                    continue;
                }
                String[] splitLine = line.split(",");
                if(splitLine.length != 4) {
                    continue;
                }
                int leftScorePoints, rightScorePoints;
                String homeTeam = splitLine[0];
                String awayTeam = splitLine[1];
                
                try {
                    
                    leftScorePoints = Integer.parseInt(splitLine[2]);
                    rightScorePoints = Integer.parseInt(splitLine[3]);
                } catch(NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                    continue;
                }

                if(homeTeam.equals(team) || awayTeam.equals(team)) {
                    gamesPlayed++;
                    boolean homeTeamWin = leftScorePoints > rightScorePoints;
                    boolean homeTeamIsTheTeam = homeTeam.equals(team);
                    
                    if(homeTeamIsTheTeam && homeTeamWin || !homeTeamIsTheTeam && !homeTeamWin) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
