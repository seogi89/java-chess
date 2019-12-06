package com.seok2.chess.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LocationTest {

    @Test
    @DisplayName("Location 생성 테스트")
    public void of() {
        assertThat(Location.of("a8")).isEqualTo(Location.of(0,0));
        assertThat(Location.of("h8")).isEqualTo(Location.of(0,7));
        assertThat(Location.of("d4")).isEqualTo(Location.of(4,3));
    }


    @Test
    @DisplayName("Location 은 Board 의 최소값보다 작거나 최대값보다 클 수 없다.")
    public void throwException() {
        assertThatIllegalArgumentException()
            .isThrownBy(() ->Location.of(8,2));
        assertThatIllegalArgumentException()
            .isThrownBy(() ->Location.of(7,-1));
    }

    @Test
    @DisplayName("Location 값은 a1~h8 사이에 있어야 한다.")
    public void throwException2() {
        assertThatIllegalArgumentException()
            .isThrownBy(() ->Location.of("a9"));
        assertThatIllegalArgumentException()
            .isThrownBy(() ->Location.of("i2"));
    }

}