package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    private StudentList studentList;

    @BeforeEach
    void setup() {
        studentList = new StudentList();
        studentList.addNewStudent("6700000001", "A", 80);
        studentList.addNewStudent("6700000002", "B", 70);
        studentList.addNewStudent("6700000003", "C", 50);
    }

    @Test
    void testAddNewStudent() {
        studentList.addNewStudent("6700000004", "D", 90);
        assertEquals(4, studentList.getStudents().size());
    }

    @Test
    void testFindByID() {
        Student student = studentList.findStudentById("6700000002");
        assertEquals("B", student.getName());
    }

    @Test
    void testFilterByName() {
        StudentList filteredList = studentList.filterByName("B");
        assertEquals(1, filteredList.getStudents().size());
    }

    @Test
    void testGiveScoreToId() {
        studentList.giveScoreToId("6700000001", 10);
        Student student = studentList.findStudentById("6700000001");
        assertEquals(90, student.getScore());
    }

    @Test
    void testViewGradeOfId() {
        String grade = studentList.viewGradeOfId("6700000001");
        assertEquals("A", grade);
    }

}
