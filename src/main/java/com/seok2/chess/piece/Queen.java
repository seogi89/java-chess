package com.seok2.chess.piece;

import com.seok2.chess.board.Location;
import java.util.List;

public class Queen extends Piece {

    public static final List<Queen> INITIAL_LOCATION_QUEENS = List.of(
        Queen.of(BLACK, Location.of("d8")),
        Queen.of(WHITE, Location.of("e1"))
    );

    private static final String SYMBOL = "Q";

    private Queen(boolean white, Location location) {
        super(white, location);
    }

    protected static Queen of(boolean white, Location location) {
        return new Queen(white, location);
    }

    @Override
    protected String getSymbol() {
        return SYMBOL;
    }

}
