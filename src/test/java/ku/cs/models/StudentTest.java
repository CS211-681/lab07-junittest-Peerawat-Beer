package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student s;

    @BeforeEach
    void setup() {
        s = new Student("6xxxxxxxx", "StudentTest");
    }

    @Test
    void testChangeName() {
        s.changeName("Jimmy");
        assertEquals("Jimmy", s.getName());
    }

    @Test
    void testAddScore() {
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());
    }

    @Test
    void testGrade() {
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    void testIsId() {
        assertTrue(s.isId("6xxxxxxxx"));
    }

    @Test
    void testIsNameContains() {
        assertTrue(s.isNameContains("Test"));
    }

}
