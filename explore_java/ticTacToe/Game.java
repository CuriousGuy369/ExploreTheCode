package explore_java.ticTacToe;

import java.util.ArrayList;

public interface Game {

    public void displayState();
    public void initializeState();

    public void playChance(Player player, Move move) throws ArrayIndexOutOfBoundsException, Exception;

    public int calculate(State state, int value);

    public void displayResult(ArrayList<Player> player,int flag);

    // public void playGame();

}
