package TicTacToe;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Board {
    char [][] grid;
    int size;

    public Board(int size) {
        this.size = size;
        this.grid = new char[size][size];
        for(char[] row : grid){
            Arrays.fill(row, '-');
        }
    }

    void printBoard (){
        for(char [] row : grid){
            System.out.println(Arrays.toString(row));
        }
    }

    boolean placeMove(Move move){
        char symbol = move.getPlayer().getSymbol();
        int row = move.getRow();
        int col = move.getCol();

        if(this.grid[row][col] != '-'){
            return false;
        }
        this.grid[row][col] = symbol;

        return true;

    }

    boolean checkWin(Move move){
        boolean rowWin = true;
        boolean colWin = true;
        boolean diag1Win = true;
        boolean diag2Win = true;
        char symbol = move.getPlayer().getSymbol();
        int row = move.getRow();
        int col = move.getCol();
        for(int i=0;i< this.size;i++){
            if(this.grid[row][i] != symbol) rowWin = false;
            if(this.grid[i][col] != symbol) colWin = false;
            if(this.grid[i][i] != symbol) diag1Win = false;
            if(this.grid[i][this.size-1-i] != symbol) diag2Win=  false;
        }
        return rowWin || colWin || diag2Win || diag1Win;
    }

    boolean isFull () {
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                if(this.grid[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }
}
