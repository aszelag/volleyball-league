import java.util.Arrays;

public class Aplication {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Jan", "Kowalsi");
        Player player2 = new Player(2, "Adam", "Nowak");

        Player player3 = new Player(1, "Maciej", "Kowalsi");
        Player player4 = new Player(2, "Adrian", "Nowak");

        Team team1 = new Team();
        team1.addPlayer(player1);
        team1.addPlayer(player2);

        Team team2 = new Team();
        team2.addPlayer(player3);
        team2.addPlayer(player4);



    }
}


