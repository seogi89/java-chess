package com.seok2.chess.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {

    }

    public static String getEvent() {
        return scanner.nextLine();
    }
}
