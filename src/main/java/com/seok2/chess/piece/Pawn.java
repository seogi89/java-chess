package com.seok2.chess.piece;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

import com.seok2.chess.board.Board;
import com.seok2.chess.board.Location;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pawn extends Piece {

    protected static final List<Pawn> INITIAL_LOCATION_PAWNS = Stream.of(
        init(Piece.BLACK),
        init(Piece.WHITE)
    ).flatMap(Collection::stream)
    .collect(collectingAndThen(toList(), Collections::unmodifiableList));

    private static final String SYMBOL = "P";

    private Pawn(boolean white, Location location) {
        super(white, location);
    }

    protected static Pawn of(boolean white, Location location) {
        return new Pawn(white, location);
    }

    private static List<Pawn> init(boolean white) {
        int row = white ? 6 : 1;
        return IntStream.range(Board.MIN_SIZE, Board.MAX_SIZE)
            .mapToObj(i-> of(white, Location.of(row,i)))
            .collect(Collectors.toList());
    }

    @Override
    protected String getSymbol() {
        return SYMBOL;
    }
}
