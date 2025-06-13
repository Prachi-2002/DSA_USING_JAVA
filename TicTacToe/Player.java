package TicTacToe;

public class Player {
    private String name;
    private char Symbol;

    public Player(String name, char symbol) {
        this.name = name;
        Symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return Symbol;
    }
}
