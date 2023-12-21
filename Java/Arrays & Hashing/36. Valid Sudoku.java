class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Row and Column Check
        for (int row = 0; row < 9; row++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();

            for (int col = 0; col < 9; col++) {
                char rowVal = board[row][col];
                char colVal = board[col][row];

                if (rowVal != '.') {
                    if (rowSet.contains(rowVal)) return false;
                    else rowSet.add(rowVal);
                }

                if (colVal != '.') {
                    if (colSet.contains(colVal)) return false;
                    else colSet.add(colVal);
                }
            }
        }

        // Box Check
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Character> blockSet = new HashSet<>();

                int rowIndex = row + 3;
                int colIndex = col + 3;

                for (int i = row; i < rowIndex; i++) {
                    for (int j = col; j < colIndex; j++) {
                        if (board[i][j] == '.') continue;
                        if (blockSet.contains(board[i][j])) return false;
                        blockSet.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}
