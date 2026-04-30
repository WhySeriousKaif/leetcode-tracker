// Last updated: 30/04/2026, 11:48:12
1public class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        // Iterate through all 9x9 cells
4        for (int i = 0; i < 9; i++) {
5            for (int j = 0; j < 9; j++) {
6                // Skip empty cells ('.')
7                if (board[i][j] == '.') continue;
8                
9                // Check if current cell is valid
10                if (!isValid(board, i, j)) {
11                    return false;
12                }
13            }
14        }
15        return true;
16    }
17    
18    private boolean isValid(char[][] board, int row, int col) {
19        char num = board[row][col];
20        
21        // Check same ROW (exclude current cell)
22        for (int j = 0; j < 9; j++) {
23            if (j != col && board[row][j] == num) {
24                return false;
25            }
26        }
27        
28        // Check same COLUMN (exclude current cell)
29        for (int i = 0; i < 9; i++) {
30            if (i != row && board[i][col] == num) {
31                return false;
32            }
33        }
34        
35        // Check 3x3 SUB-BOX (exclude current cell)
36        int startRow = (row / 3) * 3;  // Starting row of 3x3 box
37        int startCol = (col / 3) * 3;  // Starting column of 3x3 box
38        
39        for (int i = 0; i < 9; i++) {
40            int boxRow = startRow + (i / 3);  // Row formula: 3*(col/3) + i/3
41            int boxCol = startCol + (i % 3);  // Column formula: 3*(row/3) + i%3
42            
43            if (boxRow != row && boxCol != col && board[boxRow][boxCol] == num) {
44                return false;
45            }
46        }
47        
48        return true;
49    }
50}