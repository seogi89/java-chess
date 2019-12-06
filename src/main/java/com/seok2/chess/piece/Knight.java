package com.seok2.chess.piece;

import com.seok2.chess.board.Board;
import com.seok2.chess.board.Location;
import java.util.List;

public class Knight extends Piece{

    public static final List<Knight> INITIAL_LOCATION_KNIGHTS = List.of(
        Knight.of(BLACK, Location.of("b8")),
        Knight.of(BLACK, Location.of("g8")),
        Knight.of(WHITE, Location.of("b1")),
        Knight.of(WHITE, Location.of("g1"))
    );

    private static final String SYMBOL = "N";

    private Knight(boolean white, Location location) {
        super(white, location);
    }

    protected static Knight of(boolean white, Location location) {
        return new Knight(white, location);
    }

    @Override
    protected String getSymbol() {
        return SYMBOL;
    }


}
