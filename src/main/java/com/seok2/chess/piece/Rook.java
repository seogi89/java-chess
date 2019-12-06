package com.seok2.chess.piece;

import com.seok2.chess.board.Location;
import java.util.List;

public class Rook extends Piece {

    public static final List<Rook> INITIAL_LOCATION_ROOKS = List.of(
        Rook.of(BLACK, Location.of("a8")),
        Rook.of(BLACK, Location.of("h8")),
        Rook.of(WHITE, Location.of("a1")),
        Rook.of(WHITE, Location.of("h1"))
    );

    private static final String SYMBOL = "R";

    private Rook(boolean white, Location location) {
        super(white, location);
    }

    protected static Rook of(boolean white, Location location) {
        return new Rook(white, location);
    }

    @Override
    protected String getSymbol() {
        return SYMBOL;
    }

}
