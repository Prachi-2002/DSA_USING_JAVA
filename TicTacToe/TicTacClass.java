package TicTacToe;

public class TicTacClass {

    public static void main(String[] args) {

        Player player1 = new Player("Prachi", 'x');
        Player player2 = new Player("Prachi-001", 'o');
        int boardSize = 3;
        Game game = new Game(player1, player2, boardSize);
        game.start();

    }
}
