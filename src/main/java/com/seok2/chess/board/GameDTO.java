package com.seok2.chess.board;

public class GameDTO {

    private final String [][] board;

    public GameDTO(String[][] board) {
        this.board = board;
    }

    public String[][] getBoard() {
        return board;
    }
}
