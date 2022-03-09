package Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Demo.*;


import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    static Square s1;

    @BeforeAll
    static void circleCreate() {
        s1 = new Square(4, "XXX");
    }

    @Test
    void getArea() {
        Assertions.assertEquals(16, s1.getArea());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Square", s1.getName());
    }
}