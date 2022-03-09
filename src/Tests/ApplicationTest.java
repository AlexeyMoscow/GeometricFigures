package Tests;

import Demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    static Application app;

    @BeforeAll
    static void createApp (){
        Application app = new Application();
        ArrayList <Figure> figures = new ArrayList<Figure>();

    }


    @Test void addSquareToList() {

            ArrayList <Figure> figures = new ArrayList<Figure>();
            figures.add(new Square(4, "Square1"));
            boolean actual = figures.isEmpty();
            boolean expected = false;
            assertEquals(expected,actual);
    }

    @Test void addRectangleToList() {

        ArrayList <Figure> figures = new ArrayList<Figure>();
        figures.add(new Rectangle(4, 5,"Rectangle1"));
        boolean actual = figures.isEmpty();
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test void addCircleToList() {

        ArrayList <Figure> figures = new ArrayList<Figure>();
        figures.add(new Circle(4, "Circle1"));
        boolean actual = figures.isEmpty();
        boolean expected = false;
        assertEquals(expected,actual);
    }
    @Test
    void addTriangleToList() {

        ArrayList <Figure> figures = new ArrayList<Figure>();
        figures.add(new Triangle(4, 5, 3,"Rectangle1"));
        boolean actual = figures.isEmpty();
        boolean expected = false;
        assertEquals(expected,actual);
    }

}
