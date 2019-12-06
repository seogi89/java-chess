package com.seok2.chess.piece;

import com.seok2.chess.board.Location;

public interface PieceInterface {

    boolean moveTo(Location to);

    String view();
}
