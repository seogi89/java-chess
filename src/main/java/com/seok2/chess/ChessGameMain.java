package com.seok2.chess;

import com.seok2.chess.board.GameAssembler;
import com.seok2.chess.game.Event;
import com.seok2.chess.view.InputView;
import com.seok2.chess.view.OutputView;

public class ChessGameMain {

    public static void main(String[] args) {
        OutputView.welcome();
        ChessGame game = new ChessGame();
        while(game.receive(Event.of(InputView.getEvent()))){
            OutputView.print(GameAssembler.assemble(game));
        }
    }

}
