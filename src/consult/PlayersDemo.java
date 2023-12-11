package consult;

import java.util.Arrays;

public class PlayersDemo {

    public static void main(String[] args) {

        Players player1 = new Players("Alex", 1, 2, 3);
        Players player2 = new Players("Den", 4, 5, 6);
        Players player3 = new Players("Max", 7, 8, 9);
        Players player4 = new Players("Anna", 10, 11, 12);
        Players player5 = new Players("John", 13, 14, 15);

        Players[] players = {player1,player2,player3,player4,player5};

        System.out.println(Arrays.toString(players));

    }
}
