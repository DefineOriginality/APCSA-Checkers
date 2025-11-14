public class Main {
    public static void main(String[] args) {
        Checker[][] board = new Checker[8][8];
        init(board);
        printBoard(board);
    }

    private static void init(Checker[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 1) { // Only place checkers on dark squares
                    if (i < 3) {
                        board[i][j] = new Checker(i, j, "black");
                    } else if (i > 4) {
                        board[i][j] = new Checker(i, j, "red");
                    }
                }
            }
        }
    }

    private static void printBoard(Checker[][] board) {
        // Top border
        System.out.print("+");
        for (int j = 0; j < 8; j++) {
            System.out.print("--+");
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.print("|");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getColor().charAt(0) + "  ");
                } else {
                    System.out.print(". ");
                }
                System.out.print("|");
            }
            System.out.println();
            
            // Horizontal line after each row
            System.out.print("+");
            for (int j = 0; j < 8; j++) {
                System.out.print("--+");
            }
            System.out.println();
        }
    }


}
