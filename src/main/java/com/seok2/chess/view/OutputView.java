package com.seok2.chess.view;

import com.seok2.chess.board.GameDTO;

public class OutputView {

    private static final int MAX_ROW_SIZE = 8;
    private static final String BLANK = "  ";
    private static final String COLUMNS = "a  b  c  d  e  f  g  h";
    private static final String WELCOME_MSG = "체스 게임을 시작합니다." + System.lineSeparator() + "게임 시작은 start, 종료는 end 명령어를 입력하세요.";

    private OutputView() {

    }

    public static void print(GameDTO boardDTO) {
        int i = MAX_ROW_SIZE;
        for (String[] row : boardDTO.getBoard()) {
            for (String cell : row) {
                System.out.print(cell + BLANK);
            }
            System.out.print(i--);
            System.out.println();
        }
        System.out.println();
        System.out.println(COLUMNS);
    }

    public static void welcome() {
        System.out.println(WELCOME_MSG);
    }

}
