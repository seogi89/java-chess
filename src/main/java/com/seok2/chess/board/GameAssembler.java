package com.seok2.chess.board;

import static com.seok2.chess.board.Board.MAX_SIZE;
import static com.seok2.chess.board.Board.MIN_SIZE;

import com.seok2.chess.ChessGame;
import com.seok2.chess.piece.Piece;
import java.util.Optional;
import java.util.stream.IntStream;

public class GameAssembler {

    private static final String EMPTY_SYMBOL = ".";

    public static GameDTO assemble(ChessGame game) {
        Board board = game.getBoard();
        String[][] result = new String[MAX_SIZE][MAX_SIZE];
        IntStream.range(MIN_SIZE, MAX_SIZE)
            .forEach(x -> IntStream.range(MIN_SIZE, MAX_SIZE)
                .forEach(y -> result[x][y] =
                    Optional.ofNullable(board.find(Location.of(x, y)))
                        .map(Piece::view)
                        .orElse(EMPTY_SYMBOL)
                ));
        return new GameDTO(result);
    }
}