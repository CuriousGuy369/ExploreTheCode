// class State store a 2D matrix using input from constructor
package explore_java.ticTacToe;

public class State {
    private int[][] matrix;
    private int row;
    private int column;
    private int numberOfUpdates;
    private int nullState;
    
    public State(int row, int column) {
        this.row = row;
        this.column = column;
        this.numberOfUpdates = 0;
        matrix = new int[row][column];
    }

    public boolean isMatrixFilled() {
        if(numberOfUpdates == row * column) {
            return true;
        }
        return false;
    }
    
    public int[][] getMatrix() {
        return matrix;
    }

    public void updateMatix(int row, int column,int value) throws Exception {
        if(matrix[row][column] != nullState) {
            throw new Exception("unable to take this move");
        }
        matrix[row][column] = value;
        numberOfUpdates++;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getNumberOfUpdates() {
        return numberOfUpdates;
    }

    public void setNumberOfUpdates(int numberOfUpdates) {
        this.numberOfUpdates = numberOfUpdates;
    }

    public int getNullState() {
        return nullState;
    }

    public void setNullState(int nullState) {
        this.nullState = nullState;
    }

}
