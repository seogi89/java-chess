package com.seok2.chess.game;

import java.util.Arrays;

public enum EventType {

    START, END, MOVE, UNKNOWN;

    public static EventType from(String type) {
        return Arrays.stream(values())
            .filter(t -> t.name().equalsIgnoreCase(type))
            .findFirst()
            .orElse(UNKNOWN);
    }



}
