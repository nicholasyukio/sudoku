import os

sudoku_board = [
    [5, 3, 0, 0, 7, 0, 0, 0, 0],
    [6, 0, 0, 1, 9, 5, 0, 0, 0],
    [0, 9, 8, 0, 0, 0, 0, 6, 0],
    [8, 0, 0, 0, 6, 0, 0, 0, 3],
    [4, 0, 0, 8, 0, 3, 0, 0, 1],
    [7, 0, 0, 0, 2, 0, 0, 0, 6],
    [0, 6, 0, 0, 0, 0, 2, 8, 0],
    [0, 0, 0, 4, 1, 9, 0, 0, 5],
    [0, 0, 0, 0, 8, 0, 0, 7, 9]
]

sudoku_board_2 = [
    [0, 2, 0, 0, 0, 0, 0, 0, 5],
    [0, 0, 0, 0, 9, 0, 2, 0, 0],
    [0, 0, 0, 5, 0, 0, 1, 0, 0],
    [0, 8, 0, 0, 7, 0, 0, 9, 0],
    [0, 0, 6, 0, 0, 0, 5, 0, 0],
    [0, 3, 0, 0, 4, 0, 0, 1, 0],
    [0, 0, 1, 0, 0, 9, 0, 0, 0],
    [0, 0, 3, 0, 5, 0, 0, 0, 0],
    [7, 0, 0, 0, 0, 0, 0, 6, 0]
]

sudoku_board_3 = [
    [5, 3, 0, 0, 7, 0, 0, 0, 0],
    [6, 0, 0, 1, 9, 5, 0, 0, 0],
    [0, 9, 8, 0, 0, 0, 0, 6, 0],
    [8, 0, 0, 0, 6, 0, 0, 0, 3],
    [4, 0, 0, 8, 0, 3, 0, 0, 1],
    [7, 0, 0, 0, 2, 0, 0, 0, 6],
    [0, 6, 0, 0, 0, 0, 2, 8, 0],
    [0, 0, 0, 4, 1, 9, 0, 0, 5],
    [0, 0, 0, 0, 8, 0, 0, 7, 9]
]

sudoku_board_4 = [
    [0, 0, 0, 2, 6, 0, 7, 0, 1],
    [6, 8, 0, 0, 7, 0, 0, 9, 0],
    [1, 9, 0, 0, 0, 4, 5, 0, 0],
    [8, 2, 0, 1, 0, 0, 0, 4, 0],
    [0, 0, 4, 6, 0, 2, 9, 0, 0],
    [0, 5, 0, 0, 0, 3, 0, 2, 8],
    [0, 0, 9, 3, 0, 0, 0, 7, 4],
    [0, 4, 0, 0, 5, 0, 0, 3, 6],
    [7, 0, 3, 0, 1, 8, 0, 0, 0]
]

sudoku_board_medium = [
    [5, 3, 0, 0, 7, 0, 0, 0, 0],
    [6, 0, 0, 1, 9, 5, 0, 0, 0],
    [0, 9, 8, 0, 0, 0, 0, 6, 0],
    [8, 0, 0, 0, 6, 0, 0, 0, 3],
    [4, 0, 0, 8, 0, 3, 0, 0, 1],
    [7, 0, 0, 0, 2, 0, 0, 0, 6],
    [0, 6, 0, 0, 0, 0, 2, 8, 0],
    [0, 0, 0, 4, 1, 9, 0, 0, 5],
    [0, 0, 0, 0, 8, 0, 0, 7, 9]
]

sudoku_board_challenging = [
    [0, 0, 0, 0, 0, 5, 0, 0, 4],
    [0, 0, 0, 8, 0, 0, 0, 9, 0],
    [5, 0, 0, 0, 0, 0, 3, 0, 0],
    [0, 0, 0, 0, 7, 0, 0, 0, 0],
    [3, 0, 4, 0, 0, 0, 7, 0, 0],
    [0, 0, 8, 0, 9, 0, 0, 5, 0],
    [0, 0, 0, 0, 0, 0, 0, 8, 3],
    [0, 0, 0, 4, 0, 0, 0, 0, 0],
    [9, 0, 0, 0, 5, 0, 0, 0, 0]
]

sudoku_board_challenging_2 = [
    [0, 0, 0, 0, 0, 5, 0, 0, 4],
    [0, 0, 0, 8, 0, 0, 0, 9, 0],
    [5, 0, 0, 0, 0, 0, 3, 0, 0],
    [0, 0, 0, 0, 7, 0, 0, 0, 0],
    [3, 0, 4, 0, 0, 0, 7, 0, 0],
    [0, 0, 8, 0, 9, 0, 0, 5, 0],
    [0, 0, 0, 0, 0, 0, 0, 8, 3],
    [0, 0, 0, 4, 0, 0, 0, 0, 0],
    [9, 0, 0, 0, 5, 0, 0, 0, 0]
]

sudoku_board_very_challenging = [
    [0, 0, 0, 0, 0, 0, 6, 0, 0],
    [0, 9, 0, 0, 7, 0, 0, 0, 0],
    [0, 0, 0, 0, 0, 0, 0, 5, 0],
    [0, 0, 0, 5, 0, 0, 0, 9, 0],
    [0, 4, 0, 0, 0, 9, 0, 7, 0],
    [0, 3, 0, 0, 0, 4, 0, 0, 0],
    [0, 1, 0, 0, 0, 0, 0, 0, 0],
    [0, 0, 0, 9, 0, 0, 0, 4, 0],
    [0, 0, 6, 0, 0, 0, 0, 0, 0]
]


sudoku_board_hard = [
    [8, 0, 0, 0, 0, 0, 0, 0, 0],
    [0, 0, 3, 6, 0, 0, 0, 0, 0],
    [0, 7, 0, 0, 9, 0, 2, 0, 0],
    [0, 5, 0, 0, 0, 7, 0, 0, 0],
    [0, 0, 0, 0, 4, 5, 7, 0, 0],
    [0, 0, 0, 1, 0, 0, 0, 3, 0],
    [0, 0, 1, 0, 0, 0, 0, 6, 8],
    [0, 0, 8, 5, 0, 0, 0, 1, 0],
    [0, 9, 0, 0, 0, 0, 4, 0, 0]
]

pmatrix = [
    [0]*9,
    [0]*9,
    [0]*9,
    [0]*9,
    [0]*9,
    [0]*9,
    [0]*9,
    [0]*9,
    [0]*9
]


def print_sudoku(board):
    os.system("clear")
    print("#####################")
    for i in range(9):
        if i % 3 == 0 and i != 0:  # Print a horizontal separator every 3 rows
            print("-" * 21)
        
        for j in range(9):
            if j % 3 == 0 and j != 0:  # Print a vertical separator every 3 columns
                print("|", end=" ")
            
            print(board[i][j] if board[i][j] != 0 else ".", end=" ")
        
        print()  # Newline at the end of each row

def solver(board):
    def col_to_list(col):
        l = []
        for k in range(9):
            l.append(board[k][col])
        return l
    def s3x3_to_list(initial_i, initial_j):
        l = []
        for i in range(initial_i, initial_i+3):
            for j in range(initial_j, initial_j+3):
                l.append(board[i][j])
        return l
    def det_3x3_square(i, j):
        si, sj = 0, 0
        if i < 3:
            si = 0
        elif i < 6:
            si = 3
        else:
            si = 6
        if j < 3:
            sj = 0
        elif j < 6:
            sj = 3
        else:
            sj = 6
        return si, sj
    def possible_num(i, j):
        if board[i][j] != 0:
            return []
        plist = []
        for k in range(1, 10):
            si, sj = det_3x3_square(i, j)
            if k not in board[i] and k not in col_to_list(j) and k not in s3x3_to_list(si, sj):
                plist.append(k)
        return plist
    def is_solved():
        for i in range(9):
            if 0 in board[i]:
                return False
        return True
    def update_pmatrix():
        for i in range(9):
            for j in range(9):
                pmatrix[i][j] = len(possible_num(i, j))
    def cell_with_min_value_in_pmatrix():
        update_pmatrix()
        min_value_in_pmatrix = 10
        min_i, min_j = 0, 0
        for i in range(9):
            for j in range(9):
                if pmatrix[i][j] < min_value_in_pmatrix and pmatrix[i][j] > 0:
                    min_value_in_pmatrix = pmatrix[i][j]
                    min_i, min_j = i, j
        return (min_i, min_j, min_value_in_pmatrix)
    stack = []
    index = 0
    possible_num_qtd = 1
    #empty_cells = [(r, c) for r in range(9) for c in range(9) if board[r][c] == 0]
    while not is_solved():
        #changed_num = 0
        #print(f"Stack: {stack}")
        i, j, p = cell_with_min_value_in_pmatrix()
        #print(f"Cell with min value in pmatrix: ({i}, {j}): {p}")
        found = False
        pnum = possible_num(i, j)
        #print(f"Possibilities for ({i}, {j}): {pnum}")
        for num in range(board[i][j] + 1, 10):
            if num in pnum:
                if stack:
                    if [i, j, num] in stack[-1][3]:
                        continue
                board[i][j] = num
                stack.append([i, j, num, []])
                print_sudoku(board)
                #changed_num += 1
                found = True
                break
        if found:
            index += 1
        else:
            # backtrack: reset cell, move back
            if not stack:
                pass
                #print("Sudoku board impossible to solve. Ending")
                #return False
            else:
                [i, j, prev_num, _] = stack.pop()
                board[i][j] = 0
                index -= 1
                if stack:
                    stack[-1][3].append([i, j, prev_num])

solver(sudoku_board_2)