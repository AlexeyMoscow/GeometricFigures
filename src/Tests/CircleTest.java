package Tests;

import Demo.Circle;
import Demo.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    static Circle s1;

    @BeforeAll
    static void squareCreate() {
        s1 = new Circle(4, "XXX");
    }

    @Test
    void getArea() {
        Assertions.assertEquals(50.26548245743669, s1.getArea());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Circle", s1.getName());
    }
}