package com.seok2.chess.piece;

import com.seok2.chess.board.Location;
import java.util.List;

public class Bishop extends Piece {

    public static final List<Bishop> INITIAL_LOCATION_BISHOPS = List.of(
        Bishop.of(BLACK, Location.of("c8")),
        Bishop.of(BLACK, Location.of("f8")),
        Bishop.of(WHITE, Location.of("c1")),
        Bishop.of(WHITE, Location.of("f1"))
    );

    private static final String SYMBOL = "B";

    private Bishop(boolean white, Location location) {
        super(white, location);
    }

    protected static Bishop of(boolean white, Location location) {
        return new Bishop(white, location);
    }

    @Override
    protected String getSymbol() {
        return SYMBOL;
    }
}
