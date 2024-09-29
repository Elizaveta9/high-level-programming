package edu.katkova;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void shouldBeEqualAge() {
        Student student = new Student("", LocalDateTime.of(2002, Month.DECEMBER, 27, 10, 0), "", 0, 0);
        assertEquals(21, student.getAge());
    }

    @Test
    public void shouldBeFalseIsExcellentStudent() {
        Student student = new Student("", LocalDateTime.now(), "", 0, 3.2);
        assertFalse(student.isExcellentStudent());
    }

    @Test
    public void shouldBeTrueIsExcellentStudent() {
        Student student = new Student("", LocalDateTime.now(), "", 0, 4.8);
        assertTrue(student.isExcellentStudent());
    }
}
