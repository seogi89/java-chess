package com.seok2.chess.game;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

import com.seok2.chess.board.Location;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Event {

    private final EventType type;
    private final Location from;
    private final Location to;

    public Event(EventType type, Location from, Location to) {
        this.type = type;
        this.from = from;
        this.to = to;
    }

    public static Event of(String event){
        Queue<String> deque = Arrays.stream(event.split(" "))
            .collect(collectingAndThen(toList(), LinkedList::new));
        return of(EventType.from(deque.poll()), Location.of(deque.poll()), Location.of(deque.poll()));
    }

    public static Event of(EventType type, Location from, Location to){
        return new Event(type, from, to);
    }

    public EventType getType() {
        return type;
    }

    public Location getFrom() {
        return from;
    }

    public Location getTo() {
        return to;
    }
}
