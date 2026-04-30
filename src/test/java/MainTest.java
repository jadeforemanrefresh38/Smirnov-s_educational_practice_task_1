package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testChild() {
        assertEquals("Ты ребенок", Main.ageMeter(10));
    }
    @Test
    void testYoung() {
        assertEquals("Ты молод и полон сил", Main.ageMeter(25));
    }
    @Test
    void testOld() {
        assertEquals("Ты старик", Main.ageMeter(60));
    }
}