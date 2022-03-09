package Tests;


import Demo.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    static Triangle s1;

    @BeforeAll
    static void triangleCreate() {
        s1 = new Triangle(4, 5,5,"Triangle1");
    }

    @Test
    void getArea() {
        Assertions.assertEquals(28, s1.getArea());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Triangle", s1.getName());
    }

    @Test
    void testToString() {
        Assertions.assertEquals("Area: "+28.0+"Name: Triangle1", s1.toString());
    }
}