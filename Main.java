import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;

class StackItem {
    int i, j, num;
    ArrayList<int[]> list;

    StackItem(int i, int j, int num, ArrayList<int[]> list) {
        this.i = i;
        this.j = j;
        this.num = num;
        this.list = list == null ? new ArrayList<>() : list;
    }
}

class Boards {
    static int[][] sudoku_board_1 = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };
    static int[][] sudoku_board_2 = {
        {0, 2, 0, 0, 0, 0, 0, 0, 5},
        {0, 0, 0, 0, 9, 0, 2, 0, 0},
        {0, 0, 0, 5, 0, 0, 1, 0, 0},
        {0, 8, 0, 0, 7, 0, 0, 9, 0},
        {0, 0, 6, 0, 0, 0, 5, 0, 0},
        {0, 3, 0, 0, 4, 0, 0, 1, 0},
        {0, 0, 1, 0, 0, 9, 0, 0, 0},
        {0, 0, 3, 0, 5, 0, 0, 0, 0},
        {7, 0, 0, 0, 0, 0, 0, 6, 0}
    };
    static int[][] sudoku_board_3 = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };
    static int[][] sudoku_board_4 = {
        {0, 0, 0, 2, 6, 0, 7, 0, 1},
        {6, 8, 0, 0, 7, 0, 0, 9, 0},
        {1, 9, 0, 0, 0, 4, 5, 0, 0},
        {8, 2, 0, 1, 0, 0, 0, 4, 0},
        {0, 0, 4, 6, 0, 2, 9, 0, 0},
        {0, 5, 0, 0, 0, 3, 0, 2, 8},
        {0, 0, 9, 3, 0, 0, 0, 7, 4},
        {0, 4, 0, 0, 5, 0, 0, 3, 6},
        {7, 0, 3, 0, 1, 8, 0, 0, 0}
    };
    static int[][] sudoku_board_5 = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };
    static int[][] sudoku_board_6 = {
        {0, 0, 0, 0, 0, 5, 0, 0, 4},
        {0, 0, 0, 8, 0, 0, 0, 9, 0},
        {5, 0, 0, 0, 0, 0, 3, 0, 0},
        {0, 0, 0, 0, 7, 0, 0, 0, 0},
        {3, 0, 4, 0, 0, 0, 7, 0, 0},
        {0, 0, 8, 0, 9, 0, 0, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 8, 3},
        {0, 0, 0, 4, 0, 0, 0, 0, 0},
        {9, 0, 0, 0, 5, 0, 0, 0, 0}
    };
    static int[][] sudoku_board_7 = {
        {0, 0, 0, 0, 0, 5, 0, 0, 4},
        {0, 0, 0, 8, 0, 0, 0, 9, 0},
        {5, 0, 0, 0, 0, 0, 3, 0, 0},
        {0, 0, 0, 0, 7, 0, 0, 0, 0},
        {3, 0, 4, 0, 0, 0, 7, 0, 0},
        {0, 0, 8, 0, 9, 0, 0, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 8, 3},
        {0, 0, 0, 4, 0, 0, 0, 0, 0},
        {9, 0, 0, 0, 5, 0, 0, 0, 0}
    };
    static int[][] sudoku_board_8 = {
        {0, 0, 0, 0, 0, 0, 6, 0, 0},
        {0, 9, 0, 0, 7, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 5, 0},
        {0, 0, 0, 5, 0, 0, 0, 9, 0},
        {0, 4, 0, 0, 0, 9, 0, 7, 0},
        {0, 3, 0, 0, 0, 4, 0, 0, 0},
        {0, 1, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 9, 0, 0, 0, 4, 0},
        {0, 0, 6, 0, 0, 0, 0, 0, 0}
    };
    static int[][] sudoku_board_9 = {
        {8, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 3, 6, 0, 0, 0, 0, 0},
        {0, 7, 0, 0, 9, 0, 2, 0, 0},
        {0, 5, 0, 0, 0, 7, 0, 0, 0},
        {0, 0, 0, 0, 4, 5, 7, 0, 0},
        {0, 0, 0, 1, 0, 0, 0, 3, 0},
        {0, 0, 1, 0, 0, 0, 0, 6, 8},
        {0, 0, 8, 5, 0, 0, 0, 1, 0},
        {0, 9, 0, 0, 0, 0, 4, 0, 0}
    };
}

public class Main {
    static int[][] pmatrix = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    static void printSudoku(int[][] board) {
        System.out.println("#####################");
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------");
            }
            for (int j = 0; j < board[i].length; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                if (board[i][j] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    static int[] col_to_list(int[][] board, int col) {
        int[] l = new int[9];
        for (int k = 0; k < 9; k++) {
            l[k] = board[k][col];
        }
        return l;
    }

    static int[] s3x3_to_list(int[][] board, int initial_i, int initial_j) {
        int[] l = new int[9];
        int k = 0;
        for (int i = initial_i; i < initial_i + 3; i++) {
            for (int j = initial_j; j < initial_j + 3; j++) {
                l[k] = board[i][j];
                k++;
            }
        }
        return l;
    }

    static int[] det_3x3_square(int i, int j) {
        int si = 0;
        int sj = 0;
        if (i < 3) {
            si = 0;
        } else if (i < 6) {
            si = 3;
        } else {
            si = 6;
        }
        if (j < 3) {
            sj = 0;
        } else if (j < 6) {
            sj = 3;
        } else {
            sj = 6;
        }
        return new int[]{si, sj};
    }

    static int[] possible_num(int[][] board, int i, int j) {
        if (board[i][j] != 0) {
            return new int[]{};
        }

        boolean[] possible = new boolean[10]; // To check available numbers [1-9]
        Arrays.fill(possible, true);

        // Check row and column
        for (int k = 0; k < 9; k++) {
            if (board[i][k] != 0) possible[board[i][k]] = false;
            if (board[k][j] != 0) possible[board[k][j]] = false;
        }

        // Check 3x3 square
        int [] squareStart = det_3x3_square(i, j);
        int rowStart = squareStart[0];
        int colStart = squareStart[1];

        for (int r = rowStart; r < rowStart + 3; r++){
            for (int c = colStart; c < colStart + 3; c++) {
                if (board[r][c] != 0) possible[board[r][c]] = false;
            }
        }

        // Collect valid numbers
        List<Integer> validNumbers = new ArrayList<>();
        for (int num = 1; num <= 9; num++) {
            if (possible[num]) validNumbers.add(num);
        }
        // Convert List<Integer> to int[]
        return validNumbers.stream().mapToInt(Integer::intValue).toArray();
    }

    static boolean isSolved(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) return false;
            }
        }
        return true;
    }

    static void update_pmatrix(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                pmatrix[i][j] = possible_num(board, i, j).length;
            }
        }
    }

    static int[] cellWithMinValueInPMatrix(int[][] board) {
        update_pmatrix(board);
        int minValueInPMatrix = 10, min_i = 0, min_j = 0; // Use -1 to detect errors
    
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (pmatrix[i][j] < minValueInPMatrix && pmatrix[i][j] > 0) {
                    minValueInPMatrix = pmatrix[i][j];
                    min_i = i;
                    min_j = j;
                }
            }
        }
    
        return new int[]{min_i, min_j, minValueInPMatrix}; 
    }

    public static void main(String[] args) {
        ArrayDeque<StackItem> stack = new ArrayDeque<>();
        int board[][] = Boards.sudoku_board_9;
        update_pmatrix(board);
         while (!isSolved(board)) {
            int[] cellWithMinValue = cellWithMinValueInPMatrix(board);
            int i = cellWithMinValue[0];
            int j = cellWithMinValue[1];
            boolean found = false;
            int[] pnum = possible_num(board, i, j);
            outerLoop:
            for (int num = board[i][j] + 1; num < 10; num++) {
                for (int n : pnum) {
                    if (n == num) {
                        // Check if the number already exists in the stack
                        if (!stack.isEmpty()) {
                            StackItem top = stack.peek();
                            ArrayList<int[]> arrayList = top.list;
                            for (int[] arr : arrayList) {
                                if (arr.length == 3 && arr[0] == i && arr[1] == j && arr[2] == num) {
                                    continue outerLoop;
                                }
                            }
                        }
                        // Place the number and push to stack
                        board[i][j] = num;
                        stack.push(new StackItem(i, j, num, new ArrayList<>()));
                        printSudoku(board);
                        found = true;
                        break outerLoop;
                    }
                }
            }
            if (!found) {
                StackItem topPrev = stack.pop();
                board[topPrev.i][topPrev.j] = 0;
                if (!stack.isEmpty()) {
                    StackItem topNow = stack.peek();
                    topNow.list.add(new int[] {topPrev.i, topPrev.j, topPrev.num});
                }
            }
        } 
    }
  }
  