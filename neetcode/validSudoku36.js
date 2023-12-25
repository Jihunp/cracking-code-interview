/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {
  const boards = 3;
  const [boxes, cols, rows] = getBoards(boards);
  
  return searchGrid(board, boxes, cols, rows);
}

// creates a board and fills all the rows and colloms with false
const initBoard = (rows, cols) => new Array(rows).fill()
  .map(() => new Array(cols).fill(false));

const getBoards = (boards) => {
  const [ rows, cols ] = [ 9, 9 ]
  return new Array(boards).fill()
  .map(() => initBoard(rows,cols))
}

const searchGrid = (board, boxes, cols, rows) => {
  const [_rows, _cols] = [9, 9];
  for(let r = 0; r < 9; r++) {
      for(let c = 0; c < 9; c++) {
          const char = board[r][c];
          const index = (Math.floor(r / 3) * 3) + Math.floor(c / 3);

          const isEmpty = char === '.';
          if (isEmpty) continue;

          const hasMoved = boxes[index][(char - 1)] ||
              cols[c][(char - 1)] ||
              rows[r][(char - 1)];
          if (hasMoved) return false;

          rows[r][(char - 1)] = true;               /* Space O(ROWS * COLS)*/
          cols[c][(char - 1)] = true;               /* Space O(ROWS * COLS)*/
          boxes[index][(char - 1)] = true;            /* Space O(ROWS * COLS)*/
      }
  }
  return true;
}