package com.seok2.chess.piece;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

import com.seok2.chess.board.Location;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public abstract class Piece implements PieceInterface {

    public static final boolean WHITE = true;
    public static final boolean BLACK = false;
    public static final List<Piece> INITIAL_LOCATION_PIECE = Stream.of(
        Bishop.INITIAL_LOCATION_BISHOPS,
        Rook.INITIAL_LOCATION_ROOKS,
        Knight.INITIAL_LOCATION_KNIGHTS,
        King.INITIAL_LOCATION_KINGS,
        Queen.INITIAL_LOCATION_QUEENS,
        Pawn.INITIAL_LOCATION_PAWNS
    ).flatMap(Collection::stream)
    .collect(collectingAndThen(toList(), Collections::unmodifiableList));

    protected final boolean white;
    protected Location location;

    protected Piece(boolean white, Location location) {
        this.white = white;
        this.location = location;
    }

    public boolean isHere(Location location) {
        return this.location.equals(location);
    }

    @Override
    public boolean moveTo(Location to) {
        throw new UnsupportedOperationException("Feature not yet implemented : 아직 이동 할 수 없어요 !!");
    }

    @Override
    public String view() {
        return white ? getSymbol().toLowerCase() : getSymbol();
    }

    protected abstract String getSymbol();

}
