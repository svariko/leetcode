package main.java;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;

public class ValidSudoku {



    private void resetNums(Set<Character> set) {
        if (!(set.isEmpty())) {
            set.clear();
        }
        for (int i = 1; i < 10; i++) {
            set.add(Integer.toString(i).charAt(0));
        }
    }

    private boolean checkRows(char[][] board) {
        Set<Character> rowNums = new HashSet<Character>();
        for (int i = 0; i < board.length; i++) {
            resetNums(rowNums);
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if (!rowNums.contains(board[i][j])) {
                        return false;
                    }
                    else {
                        rowNums.remove(board[i][j]);
                    }
                }

            }
        }
        return true;
    }

    private boolean checkColumns(char[][] board) {
        Set<Character> colNums = new HashSet<Character>();
        for (int j = 0; j < board[0].length; j++) {
            resetNums(colNums);
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] != '.') {
                    if (!colNums.contains(board[i][j])) {
                        return false;
                    }
                    else {
                        colNums.remove(board[i][j]);
                    }
                }
            }
        }
        return true;
    }

    private boolean checkBoxes(char[][] board) {
        Set<Character> boxNums = new HashSet<Character>();

        for (int rowOffset = 0; rowOffset < 9; rowOffset += 3) {
            for (int colOffset = 0; colOffset < 9; colOffset += 3) {
                resetNums(boxNums);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[rowOffset + i][colOffset + j] != '.') {
                            if (!(boxNums.contains(board[rowOffset + i][colOffset + j]))) {
                                return false;
                            }
                            else {
                                boxNums.remove(board[rowOffset + i][colOffset + j]);
                            }

                        }
                    }
                }
            }
        }

        return true;

    }

    public boolean isValidSudoku(char[][] board) {

        return checkRows(board) && checkColumns(board) && checkBoxes(board);

    }
}


