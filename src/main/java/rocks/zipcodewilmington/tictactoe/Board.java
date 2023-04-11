package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private  Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == 'X' && matrix [i][1] == 'X' && matrix [i][2] == 'X') {
                return true; //checking rows
            }
        }
        for (int i = 0; i < 3; i++) {
            if (matrix[0][i] == 'X' && matrix [1][i] == 'X' && matrix [2][i] == 'X') {
                return true; //checking columns
            }
        }
        if (matrix[0][0] == 'X' && matrix [1][1] == 'X' && matrix [2][2] == 'X') {
            return true;
        }
        if (matrix[0][2] == 'X' && matrix [1][1] == 'X' && matrix [2][0] == 'X') {
            return true; //checking diagonals
        }
        return false; //no winnings for x
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == 'O' && matrix [i][1] == 'O' && matrix [i][2] == 'O') {
                return true; //checking rows
            }
        }
        for (int i = 0; i < 3; i++) {
            if (matrix[0][i] == 'O' && matrix [1][i] == 'O' && matrix [2][i] == 'O') {
                return true; //checking columns
            }
        }
        if (matrix[0][0] == 'O' && matrix [1][1] == 'O' && matrix [2][2] == 'O') {
            return true;
        }
        if (matrix[0][2] == 'O' && matrix [1][1] == 'O' && matrix [2][0] == 'O') {
            return true; //checking diagonals
        }
        return false; //no winnings for o
    }

    public Boolean isTie() {

        return null;
    }

    public String getWinner() {

        return null;
    }

}
