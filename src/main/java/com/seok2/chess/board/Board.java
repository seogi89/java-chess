package com.seok2.chess.board;

import com.seok2.chess.piece.Piece;
import java.util.List;

public class Board {

    public static final int MIN_SIZE = 0;
    public static final int MAX_SIZE = 8;

    private final List<Piece> pieces;

    private Board(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public static Board init() {
        return new Board(Piece.INITIAL_LOCATION_PIECE);
    }

    protected Piece find(Location location) {
        return pieces.stream()
            .filter(piece -> piece.isHere(location))
            .findFirst()
            .orElse(null);
    }
}
