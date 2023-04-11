package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == 'X' && matrix[i][1] == 'X' && matrix[i][2] == 'X') {
                return true; //checking rows
            }
        }
        for (int i = 0; i < 3; i++) {
            if (matrix[0][i] == 'X' && matrix[1][i] == 'X' && matrix[2][i] == 'X') {
                return true; //checking columns
            }
        }
        if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') {
            return true;
        }
        if (matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X') {
            return true; //checking diagonals
        }
        return false; //no winnings for x
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == 'O' && matrix[i][1] == 'O' && matrix[i][2] == 'O') {
                return true; //checking rows
            }
        }
        for (int i = 0; i < 3; i++) {
            if (matrix[0][i] == 'O' && matrix[1][i] == 'O' && matrix[2][i] == 'O') {
                return true; //checking columns
            }
        }
        if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
            return true;
        }
        if (matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O') {
            return true; //checking diagonals
        }
        return false; //no winnings for o
    }

    public Boolean isTie() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    return false;
                }
            }
        }
        return !isInFavorOfX() && !isInFavorOfO();
    }

    public String getWinner() {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] != null && matrix[i][0].equals(matrix[i][1]) && matrix[i][0].equals(matrix[i][2])) {
                return matrix[i][0].toString(); //checking rows for winner
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0][i] != null && matrix[0][i].equals(matrix[1][i]) && matrix[0][i].equals(matrix[2][i])) {
                return matrix[0][i].toString(); //checking columns for winner
            }

        }
        if (matrix[0][0] != null && matrix[0][0].equals(matrix[1][1]) && matrix[0][0].equals(matrix[2][2])) {
            return matrix[0][0].toString();
        }
        if (matrix[0][2] != null && matrix[0][2].equals(matrix[1][1]) && matrix[0][2].equals(matrix[2][0])) {
            return matrix[0][2].toString(); //checking diagonals for winner
        }
        return "";
    }
}