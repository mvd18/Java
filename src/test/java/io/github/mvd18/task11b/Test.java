package io.github.mvd18.task11b;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class FigureTest {

    @Test
    void testGetArea() {
        Figure figure = new Figure(4.0, 5.0, "blue");
        double expectedArea = 20.0;
        Assertions.assertEquals(expectedArea, figure.getArea(), 0.001);
    }

    @Test
    void testGetPerimeter() {
        Figure figure = new Figure(4.0, 5.0, "blue");
        double expectedPerimeter = 18.0;
        Assertions.assertEquals(expectedPerimeter, figure.getPerimeter(), 0.001);
    }

    @Test
    void testGetAreaWithDecimals() {
        Figure figure = new Figure(2.5, 3.5, "purple");
        double expectedArea = 8.75;
        Assertions.assertEquals(expectedArea, figure.getArea(), 0.001);
    }

    @Test
    void testToString() {
        Figure figure = new Figure(4.0, 5.0, "blue");
        String expected = "Rectangle [4,00 x 5,00, color=blue, area=20,00, perimeter=18,00]";
        Assertions.assertEquals(expected, figure.toString());
    }

}
