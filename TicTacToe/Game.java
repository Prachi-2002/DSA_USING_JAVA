package TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    List<Player> players;
    int boardSize;
    Player winner;
    Board board;
    int turnIndex=0;
    Game(Player p1, Player p2, int boardSize){
        this.players = List.of(p1,p2);
        this.boardSize = boardSize;
        this.board = new Board(boardSize);
        this.turnIndex=0;
    }

    void start (){
        Scanner sc = new Scanner(System.in);
        while(true){
            board.printBoard();
            Player current = players.get(turnIndex);
            System.out.println("Player name" + current.getName() + "Syembol" + current.getSymbol());

            int row = sc.nextInt();
            int col = sc.nextInt();

            Move move = new Move(current, row, col);
            if(!board.placeMove(move)){
                System.out.println("Invalid move , Please try again");
                continue;
            }

            if(board.checkWin(move)){
                board.printBoard();
                System.out.println(current.getName() + "Wins");
                winner = current;
                break;
            }

            if(board.isFull()){
                board.printBoard();
                System.out.println("Its a draw");
                break;

            }
            turnIndex = (turnIndex + 1) % 2;

        }

    }
}
