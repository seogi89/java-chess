package com.seok2.chess.board;

import static com.seok2.chess.board.Board.MAX_SIZE;
import static com.seok2.chess.board.Board.MIN_SIZE;

import java.util.Objects;

public class Location {

    private final int row;
    private final int col;

    private Location(int row, int col) {
        validate(row, col);
        this.row = row;
        this.col = col;
    }

    private void validate(int row, int col) {
        if (row < MIN_SIZE || row >= MAX_SIZE || col < MIN_SIZE || col >= MAX_SIZE) {
            throw new IllegalArgumentException("경기장 밖으로 이동 할 수 없습니다!!");
        }
    }

    public static Location of(int row, int col) {
        return new Location(row, col);
    }

    public static Location of(String location) {
        if(location == null)
            return null;
        char[] locations = location.toCharArray();
        return new Location(parseRow(locations[1]), parseCol(locations[0]));
    }

    private static int parseCol(char col) {
        validateColCharacter(col);
        return Character.toUpperCase(col) - 65;
    }

    private static void validateColCharacter(char col) {
        if (col < 'a' || col > 'h') {
            throw new IllegalArgumentException("경기장 밖으로 이동 할 수 없습니다!!");
        }
    }

    private static int parseRow(char row) {
        int parsed = Character.getNumericValue(row);
        validateRowCharacter(parsed);
        return Math.abs(parsed - 8);
    }

    private static void validateRowCharacter(int row) {
        if (row < MIN_SIZE || row > MAX_SIZE)  {
            throw new IllegalArgumentException("경기장 밖으로 이동 할 수 없습니다!!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Location)) {
            return false;
        }
        Location location = (Location) o;
        return row == location.row &&
            col == location.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }

    @Override
    public String toString() {
        return "Location{" +
            "row=" + row +
            ", col=" + col +
            '}';
    }

    public static void main(String[] args) {
        System.out.println(Location.of("a8"));
        System.out.println(Location.of("h8"));
    }
}
