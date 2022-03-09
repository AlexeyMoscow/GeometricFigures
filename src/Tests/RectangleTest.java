package Tests;

import Demo.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    static Rectangle s1;

    @BeforeAll
    static void rectangleCreate(){
        s1 = new Rectangle(2,5,"Rectangle");
    }

    @Test
    void getArea() {
        Assertions.assertEquals(10,s1.getArea());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Rectangle", s1.getName());
    }

    @Test
    void testToString() {
        Assertions.assertEquals("Area: "+10.0+"Name: Rectangle", s1.toString());
    }
}