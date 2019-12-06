package com.seok2.chess;

import com.seok2.chess.board.Board;
import com.seok2.chess.game.Event;
import com.seok2.chess.game.EventType;

public class ChessGame {

    private Board board;

    public boolean receive(Event event) {
        EventType type = event.getType();
        if (type.equals(EventType.START)) {
            board = Board.init();
            return true;
        }
        if (type.equals(EventType.END)) {
            return false;
        }
        throw new IllegalArgumentException("알 수 없는 이벤트 입니다.");
    }

    public Board getBoard() {
        return board;
    }
}
