package com.seok2.chess.piece;

import com.seok2.chess.board.Board;
import com.seok2.chess.board.Location;
import java.util.List;

public class King extends Piece {

    public static final List<King> INITIAL_LOCATION_KINGS = List.of(
        King.of(BLACK, Location.of("e8")),
        King.of(WHITE, Location.of("d1"))
    );

    private static final String SYMBOL = "K";

    private King(boolean white, Location location) {
        super(white, location);
    }

    protected static King of(boolean white, Location location) {
        return new King(white, location);
    }

    @Override
    protected String getSymbol() {
        return SYMBOL;
    }
}
