package explore_java.ticTacToe;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * TicTacToe
 */
public class TicTacToe implements Game {

    State state = new State(3, 3);

    private char getIndexToSymbol(int index) {
        if (index == 0) {
            return 'X';
        } else if (index == 1) {
            return 'O';
        } else {
            return '_';
        }
    }

    @Override
    public void displayState() {
        for (int i = 0; i < state.getRow(); i++) {
            for (int j = 0; j < state.getColumn(); j++) {
                char val = getIndexToSymbol(state.getMatrix()[i][j]);
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

    @Override
    public void initializeState() {

        state.setNullState(-1);
        for (int i = 0; i < state.getRow(); i++) {
            for (int j = 0; j < state.getColumn(); j++) {
                state.getMatrix()[i][j] = -1;
            }
        }

    }

    @Override
    public void playChance(Player player, Move move) throws ArrayIndexOutOfBoundsException, Exception {
        try {
            state.updateMatix(move.getRow(), move.getColumn(), player.getIndex());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index entered");
            throw new ArrayIndexOutOfBoundsException("Invalid index entered");
        } catch (Exception e) {
            throw new Exception("Invalid move: " + e.getMessage());
        }

    }

    @Override
    public int calculate(State state, int value) {

        int column = state.getColumn();
        int row = state.getRow();
        for (int i = 0; i < column; i++) {
            if (state.getMatrix()[0][i] == value && state.getMatrix()[1][i] == value
                    && state.getMatrix()[2][i] == value) {
                return value;
            }
        }

        for (int i = 0; i < row; i++) {
            if (state.getMatrix()[i][0] == value && state.getMatrix()[i][1] == value
                    && state.getMatrix()[i][2] == value) {
                return value;
            }
        }

        if (state.getMatrix()[0][0] == value && state.getMatrix()[1][1] == value && state.getMatrix()[2][2] == value) {
            return value;
        }

        if (state.getMatrix()[0][2] == value && state.getMatrix()[1][1] == value && state.getMatrix()[2][0] == value) {
            return value;
        }

        if (state.isMatrixFilled())
            return -2;
        // no one wins.
        return -1;
    }

    @Override
    public void displayResult(ArrayList<Player> player,int flag) {
        Logger logger = Logger.getLogger("TicTacToe");
        logger.info("flag: " + flag);

        if (flag >= 0 && flag <=2) {
            System.out.println("Player " + player.get(0).getName() + " wins");
        } else if (flag == -2) {
            System.out.println("Draw");
        }

    }

}