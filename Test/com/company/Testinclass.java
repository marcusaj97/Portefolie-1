package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Testinclass{
    Circle c = new Circle();
    Square s = new Square();
    Triangles t = new Triangles();

    @BeforeEach
    void setUp() {
        c.set(1,1,1);
        s.set(1,1,1,1);
        t.set(1,1,1,1);
    }

    @Test
    @DisplayName("circumference burde virke")
    void testcircumference() {

        assertEquals(6.283185307179586, c.circumference(),
                "Circumference burde virke circle");
        assertEquals(4.0, s.circumference(),
                "Circumference burde virke firekant");
        assertEquals(3.414213562373095, t.circumference(),
                "Circumference burde virke trekant");
    }

    @Test
    @DisplayName("sikkre håndtering af overlappoint")
    void testmedpunktudeogindforioverlappoint() {
        assertFalse(c.pointoverlap(0, 5), "håntering af overlappoint ok med c");
        assertTrue(c.pointoverlap(1, 1), "håntering af overlappoint ok med c");

        assertFalse(s.pointoverlap(0, 5), "håntering af overlappoint ok med s");
        assertTrue(s.pointoverlap(1, 1), "håntering af overlappoint ok med s");

        assertFalse(t.pointoverlap(0, 5), "håntering af overlappoint ok med t");
        assertTrue(t.pointoverlap(1, 1), "håntering af overlappoint ok med t");
    }
    @Test
    @DisplayName("test area")
    void testarea() {
        assertEquals(3.141592653589793, c.area(),
                "area burde virke circle");
        assertEquals(1.0, s.area(),
                "area burde virke firekant");
        assertEquals(0.5, t.area(),
                "area burde virke trekant");
    }
    @Test
    @DisplayName("test dist")
    void testdist() {
        assertEquals(1, c.dist(2,1),
                "dist burde virke circle");
        assertEquals(1, s.dist(2,1),
                "dist burde virke firekant");
        assertEquals(1, t.dist(2,1),
                "dist burde virke trekant");
    }
    @Test
    @DisplayName("test returncentrum")
    void testreturncentrum() {
        assertEquals("1.0, 1.0", c.returnCentrum(),
                "dist burde virke circle");
        assertEquals("1.0, 1.0", s.returnCentrum(),
                "dist burde virke firekant");
        assertEquals("1.0, 1.0", t.returnCentrum(),
                "dist burde virke trekant");

    }

}